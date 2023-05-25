import java.applet.Applet;
import java.awt.*;

public class q7 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillArc(50, 50, 100, 100, 0, 360);
        g.setColor(getBackground());
        g.fillArc(75, 75, 50, 50, 0, 360);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "q7.class" width = "320" height = "480"></applet>
   </body>
</html>*/