// Import the necessary packages
import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// Define the applet class that implements MouseListener and KeyListener interfaces
public class CursorApplet extends Applet implements MouseListener, KeyListener {

    // Declare the variables to store the x and y coordinates of the cursor
    int x, y;

    // Initialize the applet
    public void init() {
        // Add the listeners to the applet
        addMouseListener(this);
        addKeyListener(this);
        // Set the background color
        setBackground(Color.white);
        // Set the initial coordinates to zero
        x = 0;
        y = 0;
    }

    // Paint the applet
    public void paint(Graphics g) {
        // Set the font and color
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.blue);
        // Display the coordinates
        g.drawString("X: " + x + ", Y: " + y, 50, 50);
    }

    // Handle the mouse events
    public void mousePressed(MouseEvent e) {
        // Get the coordinates of the mouse pointer
        x = e.getX();
        y = e.getY();
        // Repaint the applet
        repaint();
    }

    // Handle the key events
    public void keyPressed(KeyEvent e) {
        // Get the key code of the pressed key
        int keyCode = e.getKeyCode();
        // Move the cursor according to the arrow keys
        switch (keyCode) {
            case KeyEvent.VK_UP:
                y -= 10;
                break;
            case KeyEvent.VK_DOWN:
                y += 10;
                break;
            case KeyEvent.VK_LEFT:
                x -= 10;
                break;
            case KeyEvent.VK_RIGHT:
                x += 10;
                break;
        }
        // Repaint the applet
        repaint();
    }

    // The following methods are not used but need to be implemented
    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}
