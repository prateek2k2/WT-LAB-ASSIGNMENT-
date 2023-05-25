import java.applet.Applet;
import java.awt.*;

public class Q18 extends Applet {
    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        setBackground(Color.green);
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.red);
        g2.drawLine(30, 175, 230, 175);
        g2.setColor(Color.black);
        g2.fillArc(30, 150, 50, 50, 0, -180);
        g2.setColor(Color.red);
        g2.drawArc(30, 150, 50, 50, 0, -180);
        g2.fillArc(80, 150, 50, 50, 0, 180);
        g2.setColor(Color.red);
        g2.drawArc(80, 150, 50, 50, 0, 180);
        g2.setColor(Color.blue);
        g2.fillArc(130, 150, 50, 50, 0, -180);
        g2.setColor(Color.red);
        g2.drawArc(130, 150, 50, 50, 0, -180);
        g2.setColor(Color.yellow);
        g2.fillArc(180, 150, 50, 50, 0, 180);
        g2.setColor(Color.red);
        g2.drawArc(180, 150, 50, 50, 0, 180);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "Q18.class" width = "320" height = "480"></applet>
   </body>
</html>*/