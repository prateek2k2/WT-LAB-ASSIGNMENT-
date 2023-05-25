import java.applet.Applet;
import java.awt.*;

public class Q12 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.fillOval(50, 150, 200, 200);
        g.setColor(Color.red);
        g.fillOval(50, 250, 200, 200);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "Q12.class" width = "320" height = "480"></applet>
   </body>
</html>*/