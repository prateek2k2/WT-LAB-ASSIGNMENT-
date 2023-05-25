import java.applet.Applet;
import java.awt.*;

public class Q16 extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.green);
        g2.drawRoundRect(25, 30, 250, 100, 20, 20);
        g2.setColor(Color.black);
        g2.fillRoundRect(25, 30, 250, 100, 20, 20);
        g2.setColor(Color.green);
        g2.drawRoundRect(75, 65, 175, 50, 20, 20);
        g2.setColor(Color.blue);
        g2.fillRoundRect(75, 65, 175, 50, 20, 20);
        g2.setColor(Color.green);
        g2.drawOval(100, 85, 45, 20);
        g2.setColor(Color.red);
        g2.fillOval(100, 85, 45, 20);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "Q16.class" width = "320" height = "480"></applet>
   </body>
</html>*/