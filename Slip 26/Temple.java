// Import the Applet and Graphics classes for applet programming
import java.applet.Applet;
import java.awt.Graphics;

// Create a class that extends Applet
public class TempleApplet extends Applet {

    // Override the paint method to draw graphics
    public void paint (Graphics g) {
        // Set the color to black
        g.setColor (Color.black);
        // Draw the base of the temple as a rectangle
        g.drawRect (50, 200, 300, 100);
        // Fill the base with gray color
        g.setColor (Color.gray);
        g.fillRect (50, 200, 300, 100);
        // Draw the roof of the temple as a triangle
        g.setColor (Color.black);
        int x [] = {50, 200, 350}; // The x-coordinates of the vertices
        int y [] = {200, 100, 200}; // The y-coordinates of the vertices
        g.drawPolygon (x, y, 3); // Draw a polygon with 3 vertices
        // Fill the roof with red color
        g.setColor (Color.red);
        g.fillPolygon (x, y, 3);
        // Draw the door of the temple as a rectangle
        g.setColor (Color.black);
        g.drawRect (175, 250, 50, 50);
        // Fill the door with brown color
        g.setColor (Color.brown);
        g.fillRect (175, 250, 50, 50);
        // Draw the windows of the temple as ovals
        g.setColor (Color.black);
        g.drawOval (100, 225, 25, 25); // Left window
        g.drawOval (275, 225, 25, 25); // Right window
        // Fill the windows with yellow color
        g.setColor (Color.yellow);
        g.fillOval (100, 225, 25, 25); // Left window
        g.fillOval (275, 225, 25, 25); // Right window
    }
}

// Create an HTML file to run the applet
/*
<html>
<body>
<applet code="TempleApplet.class" width="400" height="400">
</applet>
</body>
</html>
*/
