import java.applet.Applet;
import java.awt.*;

public class Q13 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(50, 150, 300, 100);
        g.setColor(Color.green);
        g.fillOval(165, 100, 100, 100);
        g.setColor(Color.blue);
        g.fillOval(175, 175, 10, 10);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "Q13.class" width = "320" height = "480"></applet>
   </body>
</html>*/
