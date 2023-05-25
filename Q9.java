import java.applet.Applet;
import java.awt.*;

public class Q9 extends Applet {
    public void paint(Graphics g) {
        setBackground(Color.red);
        g.setColor(Color.blue);
        g.fillArc(80, 250, 350, 350, 0, 360);
    }
}
