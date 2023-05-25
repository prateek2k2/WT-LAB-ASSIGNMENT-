import java.applet.Applet;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;

public class q11 extends Applet {
    public void paint(Graphics g) {
        Color[] colors = { Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.MAGENTA };
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(12));
        for (int i = 0;i<5;i++) {
            g2.setColor(colors[i]);
            g2.drawArc(30+(i*10), 30+(i*10), 200-(i*10), 100-(i*10), 180, -180);
        }
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "q11.class" width = "320" height = "480"></applet>
   </body>
</html>*/