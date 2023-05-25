import java.applet.*;
import java.awt.*;

public class Q4 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.drawArc(40, 40, 200, 250, 0, 360);
        g.drawArc(60, 100, 50, 40, 0, 360);
        g.fillArc(60, 100, 40, 40, 0, 360);
        g.drawArc(150, 100, 50, 40, 0, 360);
        g.fillArc(150, 100, 40, 40, 0, 360);
        g.drawArc(85, 180, 100, 70, 0, -180);
    }
}