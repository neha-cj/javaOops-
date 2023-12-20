import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorApp extends JFrame {

    private JTextField displayField;
    private double currentResult;
    private String currentInput;
    private String lastOperator;

    public CalculatorApp() {
        super("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setLayout(new BorderLayout());

        displayField = new JTextField();
        displayField.setEditable(false);
        add(displayField, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4));

        // Digits 0-9
        for (int i = 0; i <= 9; i++) {
            addButton(buttonPanel, String.valueOf(i));
        }

        // Operations +, -, *, %
        addButton(buttonPanel, "+");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "%");

        // Equals button
        JButton equalsButton = new JButton("=");
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateResult();
                lastOperator = null;
            }
        });
        buttonPanel.add(equalsButton);

        // Clear button
        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearCalculator();
            }
        });
        buttonPanel.add(clearButton);

        add(buttonPanel, BorderLayout.CENTER);

        // Set up the initial state
        clearCalculator();
    }

    private void addButton(Container container, String label) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleButtonClick(label);
            }
        });
        container.add(button);
    }

    private void handleButtonClick(String buttonLabel) {
        if (Character.isDigit(buttonLabel.charAt(0))) {
            // Digit button pressed
            currentInput += buttonLabel;
        } else {
            // Operation button pressed
            if (!currentInput.isEmpty()) {
                calculateResult();
                lastOperator = buttonLabel;
            }
        }

        updateDisplay();
    }

    private void calculateResult() {
        if (!currentInput.isEmpty() && lastOperator != null) {
            try {
                double input = Double.parseDouble(currentInput);
                switch (lastOperator) {
                    case "+":
                        currentResult += input;
                        break;
                    case "-":
                        currentResult -= input;
                        break;
                    case "*":
                        currentResult *= input;
                        break;
                    case "%":
                        if (input != 0) {
                            currentResult %= input;
                        } else {
                            throw new ArithmeticException("Cannot divide by zero");
                        }
                        break;
                }
            } catch (NumberFormatException e) {
                // Handle invalid input format
                clearCalculator();
            } catch (ArithmeticException e) {
                // Handle divide by zero
                clearCalculator();
                displayField.setText("Error: " + e.getMessage());
            }
            currentInput = "";
        }
    }

    private void clearCalculator() {
        currentResult = 0;
        currentInput = "";
        lastOperator = null;
        updateDisplay();
    }

    private void updateDisplay() {
        displayField.setText(currentInput.isEmpty() ? String.valueOf(currentResult) : currentInput);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculatorApp().setVisible(true);
            }
        });
    }
}
