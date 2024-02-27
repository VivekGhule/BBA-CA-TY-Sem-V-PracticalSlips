import java.applet.*;
import java.awt.*;
import java.util.Random;
public class TableLamp extends Applet implements Runnable {
    private Thread t; 
    private Color color; 
    private Random rand; 
    private final int DELAY = 1000; 
    public void init() {
        t = new Thread(this);
        color = Color.YELLOW; 
        rand = new Random();
    }
    public void start() {
        t.start();
    }
    public void stop() {
        t = null;
    }

    public void run() {
        while (t != null) {
            color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            repaint();
            try {
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
            }
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(150, 200, 100, 50);
        g.setColor(Color.GRAY);
        g.fillRect(190, 100, 20, 100);
        g.setColor(color); 
        g.fillOval(150, 50, 100, 50);
        g.setColor(Color.BLACK);
        g.drawOval(150, 50, 100, 50);
    }
}
