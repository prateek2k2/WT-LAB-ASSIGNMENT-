import java.applet.Applet;
import java.awt.*;

public class Q17 extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        int[] x = {100, 150, 100, 50};
        int[] y = {100, 150, 200, 150};
        g2.drawPolygon(x, y, 4);
        g2.setColor(Color.red);
        g2.fillPolygon(x, y, 4);
        g2.setColor(Color.black);
        g2.drawRoundRect(75, 135, 50, 30, 10, 10);
        g2.setColor(Color.blue);
        g2.fillRoundRect(75, 135, 50, 30, 10, 10);
        g2.setColor(Color.red);
        g2.drawOval(85, 140, 30, 20);
        g2.setColor(Color.black);
        g2.fillOval(85, 140, 30, 20);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "Q17.class" width = "320" height = "480"></applet>
   </body>
</html>*/
