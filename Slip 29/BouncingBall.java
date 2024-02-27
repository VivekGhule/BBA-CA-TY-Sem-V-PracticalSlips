// Import the java.applet package
import java.applet.*;
// Import the java.awt package for graphics and color
import java.awt.*;

// Extend the Applet class and implement the Runnable interface
public class BouncingBall extends Applet implements Runnable {

    // Declare the variables for the position, radius, and direction of the ball
    int x, y, r, dx, dy;
    // Declare the variable for the thread
    Thread t;
    // Declare the variable for the color of the ball
    Color color;

    // Override the init() method to initialize the variables and the thread
    public void init() {
        // Set the initial position of the ball
        x = 150;
        y = 50;
        // Set the radius of the ball
        r = 20;
        // Set the initial direction of the ball
        dx = 11;
        dy = 7;
        // Create a new thread with this applet as the target
        t = new Thread(this);
        // Start the thread
        t.start();
        // Set the initial color of the ball
        color = Color.red;
    }

    // Override the paint() method to draw the ball
    public void paint(Graphics g) {
        // Set the color of the ball
        g.setColor(color);
        // Draw the ball as a filled oval
        g.fillOval(x - r, y - r, r * 2, r * 2);
    }

    // Override the run() method to animate the ball
    public void run() {
        // Use an infinite loop to update the position and color of the ball
        while (true) {
            // Check if the ball hits the left or right edge of the applet
            if (x - r + dx < 0 || x + r + dx > getWidth()) {
                // Reverse the horizontal direction
                dx = -dx;
                // Change the color of the ball
                color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            }
            // Check if the ball hits the top or bottom edge of the applet
            if (y - r + dy < 0 || y + r + dy > getHeight()) {
                // Reverse the vertical direction
                dy = -dy;
                // Change the color of the ball
                color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
            }
            // Update the position of the ball
            x += dx;
            y += dy;
            // Repaint the applet
            repaint();
            // Delay the animation for 100 milliseconds
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
/*<html>
<head>
    <title>Bouncing Ball</title>
</head>
<body>
    <applet code="BouncingBall.class" width="400" height="400">
    </applet>
</body>
</html>*/