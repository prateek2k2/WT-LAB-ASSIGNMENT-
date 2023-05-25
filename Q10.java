import java.applet.Applet;
import java.awt.*;

public class Q10 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillArc(150, 100, 150, 150, 0, 90);
        g.setColor(Color.green);
        g.fillArc(150, 100, 150, 150, 0, -90);
        g.setColor(Color.yellow);
        g.fillArc(150, 100, 150, 150, -90, -90);
        g.setColor(Color.red);
        g.fillArc(150, 100, 150, 150, -180, -90);
    }
}