import java.applet.*;
import java.awt.*;

/*<applet code ="Smiley" width=300 height=300> </applet>*/
public class Smiley extends Applet {
    public void paint (Graphics g) {
        //Draw and fill the face
        g.setColor(Color.yellow);
        g.drawOval(50, 50, 200, 200);
        g.fillOval(50, 50, 200, 200);

        //Draw the eyes
        g.setColor(Color.black);
        g.fillOval(100, 100, 25, 25);
        g.fillOval(175, 100, 25, 25);

        //Draw the mouth
        g.drawArc(100, 150, 100, 50, 180, 180);
    }
}
