import java.applet.*;
import java.awt.*;

public class Q3 extends Applet {
    public void paint(Graphics g) {
        int x = 100, y = 100, w = 60;
        g.setColor(Color.blue);
        g.drawOval(x, y, w, w);
        g.setColor(Color.black);
        g.drawOval(x+w, y, w, w);
        g.setColor(Color.red);
        g.drawOval(x+w+w, y, w, w);
        g.setColor(Color.yellow);
        g.drawOval(x+(w/2), y+(w/2), w, w);
        g.setColor(Color.green);
        g.drawOval(x+w+w-(w/2), y+(w/2), w, w);
    }
}