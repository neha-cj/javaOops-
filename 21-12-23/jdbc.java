import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DisplayRecordsJDBC {

    // JDBC database URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/your_database";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // JDBC variables for opening, closing and managing connection
    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;

    public static void main(String[] args) {
        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);

            // Create a statement
            statement = connection.createStatement();

            // Execute a query
            String sqlQuery = "SELECT * FROM your_table";
            resultSet = statement.executeQuery(sqlQuery);

            // Display the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                // Add more fields as needed

                System.out.println("ID: " + id + ", Name: " + name);
                // Display other fields as needed
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the resources in the reverse order of their creation
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
