import java.applet.Applet;
import java.awt.*;

public class q8 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(200, 30, 30, 80, 0, 360);
        g.setColor(Color.red);
        g.fillArc(200, 80, 80, 30, 0, 360);
        g.setColor(Color.pink);
        g.fillArc(150, 80, 80, 30, 0, 360);
        g.setColor(Color.orange);
        g.fillArc(200, 80, 30, 80, 0, 360);
        g.setColor(getBackground());
        g.fillArc(200, 80, 30, 30, 0, 360);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "q8.class" width = "320" height = "480"></applet>
   </body>
</html>*/