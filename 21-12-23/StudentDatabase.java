import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentDatabase {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String DB_USER = "your_username";
    private static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            createTable(connection);
            insertStudentData(connection);
            displayStudentsWithCGPAGreaterThan7(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                "id INT AUTO_INCREMENT PRIMARY KEY," +
                "rollno INT," +
                "name VARCHAR(255)," +
                "cgpa DOUBLE)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(createTableSQL)) {
            preparedStatement.execute();
        }
    }

    private static void insertStudentData(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollno = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("CGPA: ");
            double cgpa = scanner.nextDouble();

            String insertSQL = "INSERT INTO students (rollno, name, cgpa) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
                preparedStatement.setInt(1, rollno);
                preparedStatement.setString(2, name);
                preparedStatement.setDouble(3, cgpa);
                preparedStatement.executeUpdate();
            }
        }
    }

    private static void displayStudentsWithCGPAGreaterThan7(Connection connection) throws SQLException {
        double thresholdCGPA = 7.0;
        String selectSQL = "SELECT * FROM students WHERE cgpa > ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(selectSQL)) {
            preparedStatement.setDouble(1, thresholdCGPA);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                System.out.println("\nStudents with CGPA greater than 7:");
                while (resultSet.next()) {
                    int rollno = resultSet.getInt("rollno");
                    String name = resultSet.getString("name");
                    double cgpa = resultSet.getDouble("cgpa");
                    System.out.println("Roll Number: " + rollno + ", Name: " + name + ", CGPA: " + cgpa);
                }
            }
        }
    }
}
