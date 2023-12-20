import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyEventHandling extends JFrame {

    private JTextField textField;

    public KeyEventHandling() {
        super("Key Event Handling");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        textField = new JTextField();
        textField.addKeyListener(new CustomKeyAdapter());
        add(textField);

        setVisible(true);
    }

    private static class CustomKeyAdapter extends KeyAdapter {
        @Override
        public void keyTyped(KeyEvent e) {
            System.out.println("Key Typed: " + e.getKeyChar());
        }

        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
        }

        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new KeyEventHandling());
    }
}
