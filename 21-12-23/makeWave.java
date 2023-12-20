import javax.swing.*;
import java.awt.*;

public class WaveFormPrint extends JFrame {

    public WaveFormPrint() {
        super("Wave Form Print");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400);

        WaveFormPanel waveFormPanel = new WaveFormPanel();
        add(waveFormPanel);

        setVisible(true);
    }

    private class WaveFormPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawWaveForm(g);
        }

        private void drawWaveForm(Graphics g) {
            int width = getWidth();
            int height = getHeight();
            int midY = height / 2;

            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.BLUE);

            int x = 0;
            int y = midY;

            for (int i = 0; i < width; i++) {
                int nextY = midY + (int) (Math.sin(Math.toRadians(i)) * midY);
                g2d.drawLine(x, y, i, nextY);
                x = i;
                y = nextY;
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new WaveFormPrint());
    }
}
