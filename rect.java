import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class rect extends Applet {
  
    public void paint(Graphics g) {
        int x = 1000 / 2;
        int y = 600 / 2;
        int size = Math.min(2000, 1200) / 2;
        int width = size / 2;
        int height = size / 4;
        g.setColor(Color.RED);
        g.fillRect(x - width / 2, y - height / 2, width, height);
        g.setColor(Color.BLUE);
        int diameter = Math.min(width, height) * 3 / 4;
        int circleX = x - diameter / 2;
        int circleY = y - diameter / 2;
        g.fillOval(circleX, circleY, diameter, diameter);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "rect.class" width = "320" height = "480"></applet>
   </body>
</html>*/