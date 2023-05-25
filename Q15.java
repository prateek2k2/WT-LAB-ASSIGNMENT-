import java.applet.Applet;
import java.awt.*;

public class Q15 extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
        int[] x1 = {30, 30, 60};
        int[] y1 = {100, 150, 125};
        g2.drawPolygon(x1, y1, 3);
        g2.setColor(Color.green);
        g2.fillPolygon(x1, y1, 3);
        g2.setColor(Color.black);
        int[] x2 = {30, 60, 60};
        int[] y2 = {150, 175, 125};
        g2.drawPolygon(x2, y2, 3);
        g2.setColor(Color.yellow);
        g2.fillPolygon(x2, y2, 3);
        g2.setColor(Color.black);
        int[] x3 = {60, 90, 60};
        int[] y3 = {175, 150, 125};
        g2.drawPolygon(x3, y3, 3);
        g2.setColor(Color.blue);
        g2.fillPolygon(x3, y3, 3);
        g2.setColor(Color.black);
        int[] x4 = {90, 90, 60};
        int[] y4 = {150, 100, 125};
        g2.drawPolygon(x4, y4, 3);
        g2.setColor(Color.green);
        g2.fillPolygon(x4, y4, 3);
        g2.setColor(Color.black);
        int[] x5 = {90, 60, 60};
        int[] y5 = {100, 70, 125};
        g2.drawPolygon(x5, y5, 3);
        g2.setColor(Color.yellow);
        g2.fillPolygon(x5, y5, 3);
        g2.setColor(Color.black);
        int[] x6 = {60, 30, 60};
        int[] y6 = {70, 100, 125};
        g2.drawPolygon(x6, y6, 3);
        g2.setColor(Color.red);
        g2.fillPolygon(x6, y6, 3);
        g2.setColor(Color.black);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "Q15.class" width = "320" height = "480"></applet>
   </body>
</html>*/