import java.awt.Color; import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class circle2 extends Applet 
{

    public void paint(Graphics g) 
{
        int diameter = 300;
        int x = (getWidth() - diameter) / 2;
        int y = (getHeight() - diameter) / 2;
        g.setColor(Color.BLACK);
        g.drawOval(x, y, diameter, diameter);
        g.setColor(Color.blue);
        g.fillArc(x, y, diameter, diameter, 0, 90);

        g.setColor(Color.red);
        g.fillArc(x, y, diameter, diameter, 90, 90);

        g.setColor(Color.yellow);
        g.fillArc(x, y, diameter, diameter, 180, 90);

        g.setColor(Color.green);
        g.fillArc(x, y, diameter, diameter, 270, 90);
    }
}
/*
<html>
   <head>
   </head>
   <body>
         <applet code = "circle2.class" width = "320" height = "480"></applet>
   </body>
</html>*/
