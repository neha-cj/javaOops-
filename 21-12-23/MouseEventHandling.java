import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventHandling extends JFrame {

    public MouseEventHandling() {
        super("Mouse Event Handling");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JPanel panel = new JPanel();
        panel.addMouseListener(new CustomMouseListener());
        add(panel);

        setVisible(true);
    }

    private static class CustomMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("Mouse Pressed at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("Mouse Released at (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("Mouse Entered");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("Mouse Exited");
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            System.out.println("Mouse Moved to (" + e.getX() + ", " + e.getY() + ")");
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            System.out.println("Mouse Dragged to (" + e.getX() + ", " + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MouseEventHandling());
    }
}
