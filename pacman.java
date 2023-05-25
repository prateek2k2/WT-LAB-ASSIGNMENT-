import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class pacman extends Applet {
  
    public void paint(Graphics g) {
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        int diameter = Math.min(getWidth(), getHeight()) / 2;
        g.setColor(Color.gray);
        g.fillArc(x - diameter, y - diameter, diameter * 2, diameter * 2, 30, 300);
        
  }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "pacman.class" width = "320" height = "480"></applet>
   </body>
</html>*/