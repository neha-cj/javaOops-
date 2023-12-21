import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalculator extends JFrame implements ActionListener {
    private JTextField textField;
    private JButton[] digitButtons;
    private JButton[] operationButtons;
    private JButton equalsButton, clearButton;
    private JPanel panel;

    private String input = "";

    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        digitButtons = new JButton[10];
        operationButtons = new JButton[5];

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4));

        for (int i = 0; i < 10; i++) {
            digitButtons[i] = new JButton(String.valueOf(i));
            digitButtons[i].addActionListener(this);
        }

        for (int i = 0; i < 5; i++) {
            operationButtons[i] = new JButton();
            operationButtons[i].addActionListener(this);
        }

        operationButtons[0].setText("+");
        operationButtons[1].setText("-");
        operationButtons[2].setText("*");
        operationButtons[3].setText("/");
        operationButtons[4].setText("%");

        equalsButton = new JButton("=");
        equalsButton.addActionListener(this);

        clearButton = new JButton("C");
        clearButton.addActionListener(this);

        panel.add(digitButtons[1]);
        panel.add(digitButtons[2]);
        panel.add(digitButtons[3]);
        panel.add(operationButtons[0]);

        panel.add(digitButtons[4]);
        panel.add(digitButtons[5]);
        panel.add(digitButtons[6]);
        panel.add(operationButtons[1]);

        panel.add(digitButtons[7]);
        panel.add(digitButtons[8]);
        panel.add(digitButtons[9]);
        panel.add(operationButtons[2]);

        panel.add(digitButtons[0]);
        panel.add(clearButton);
        panel.add(equalsButton);
        panel.add(operationButtons[3]);

        add(textField, BorderLayout.NORTH);
        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == digitButtons[i]) {
                input += i;
                textField.setText(input);
            }
        }

        if (e.getSource() == operationButtons[0]) {
            input += "+";
            textField.setText(input);
        }

        if (e.getSource() == operationButtons[1]) {
            input += "-";
            textField.setText(input);
        }

        if (e.getSource() == operationButtons[2]) {
            input += "*";
            textField.setText(input);
        }

        if (e.getSource() == operationButtons[3]) {
            input += "/";
            textField.setText(input);
        }

        if (e.getSource() == operationButtons[4]) {
            input += "%";
            textField.setText(input);
        }

        if (e.getSource() == equalsButton) {
            try {
                double result = evaluateExpression();
                textField.setText(String.valueOf(result));
                input = "";
            } catch (ArithmeticException ex) {
                textField.setText("Error");
                input = "";
            }
        }

        if (e.getSource() == clearButton) {
            input = "";
            textField.setText("");
        }
    }

    private double evaluateExpression() {
        String[] tokens = input.split("[+\\-*/%]");
        double operand1 = Double.parseDouble(tokens[0]);
        double operand2 = Double.parseDouble(tokens[1]);

        if (input.contains("+")) {
            return operand1 + operand2;
        } else if (input.contains("-")) {
            return operand1 - operand2;
        } else if (input.contains("*")) {
            return operand1 * operand2;
        } else if (input.contains("/")) {
            if (operand2 == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return operand1 / operand2;
        } else if (input.contains("%")) {
            return operand1 % operand2;
        }

        return 0;
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
