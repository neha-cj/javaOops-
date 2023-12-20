import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DrawingApplication extends JFrame {

    private JButton lineButton, rectangleButton, ovalButton;
    private String currentShape = "Line";
    private ShapePanel shapePanel;

    public DrawingApplication() {
        super("Drawing Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);

        // Create buttons for selecting drawing mode
        lineButton = new JButton("Line");
        rectangleButton = new JButton("Rectangle");
        ovalButton = new JButton("Oval");

        // Create panel for drawing area
        shapePanel = new ShapePanel();

        // Add action listeners to buttons
        lineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentShape = "Line";
            }
        });

        rectangleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentShape = "Rectangle";
            }
        });

        ovalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                currentShape = "Oval";
            }
        });

        // Add mouse listener to drawing panel
        shapePanel.addMouseListener(new CustomMouseListener());

        // Set layout
        setLayout(new BorderLayout());

        // Add buttons and drawing panel to the frame
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(lineButton);
        buttonPanel.add(rectangleButton);
        buttonPanel.add(ovalButton);

        add(buttonPanel, BorderLayout.NORTH);
        add(shapePanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private class CustomMouseListener extends MouseAdapter {
        private int startX, startY, endX, endY;

        @Override
        public void mousePressed(MouseEvent e) {
            startX = e.getX();
            startY = e.getY();
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            endX = e.getX();
            endY = e.getY();

            // Draw the selected shape based on the current mode
            switch (currentShape) {
                case "Line":
                    shapePanel.addShape(new Line(startX, startY, endX, endY));
                    break;
                case "Rectangle":
                    shapePanel.addShape(new Rectangle(startX, startY, endX, endY));
                    break;
                case "Oval":
                    shapePanel.addShape(new Oval(startX, startY, endX, endY));
                    break;
            }

            shapePanel.repaint();
        }
    }

    // Custom JPanel for drawing shapes
    private class ShapePanel extends JPanel {
        private java.util.List<Shape> shapes = new LinkedList<>();

        public void addShape(Shape shape) {
            shapes.add(shape);
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (Shape shape : shapes) {
                shape.draw(g);
            }
        }
    }

    // Interface for shapes
    private interface Shape {
        void draw(Graphics g);
    }

    // Line class implementing the Shape interface
    private class Line implements Shape {
        private int startX, startY, endX, endY;

        public Line(int startX, int startY, int endX, int endY) {
            this.startX = startX;
            this.startY = startY;
            this.endX = endX;
            this.endY = endY;
        }

        @Override
        public void draw(Graphics g) {
            g.drawLine(startX, startY, endX, endY);
        }
    }

    // Rectangle class implementing the Shape interface
    private class Rectangle implements Shape {
        private int startX, startY, endX, endY;

        public Rectangle(int startX, int startY, int endX, int endY) {
            this.startX = Math.min(startX, endX);
            this.startY = Math.min(startY, endY);
            this.endX = Math.max(startX, endX);
            this.endY = Math.max(startY, endY);
        }

        @Override
        public void draw(Graphics g) {
            g.drawRect(startX, startY, endX - startX, endY - startY);
        }
    }

    // Oval class implementing the Shape interface
    private class Oval implements Shape {
        private int startX, startY, endX, endY;

        public Oval(int startX, int startY, int endX, int endY) {
            this.startX = Math.min(startX, endX);
            this.startY = Math.min(startY, endY);
            this.endX = Math.max(startX, endX);
            this.endY = Math.max(startY, endY);
        }

        @Override
        public void draw(Graphics g) {
            g.drawOval(startX, startY, endX - startX, endY - startY);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new DrawingApplication());
    }
}
