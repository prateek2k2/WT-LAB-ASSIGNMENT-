import java.applet.Applet;
import java.awt.*;
public class q6 extends Applet
{
    public void paint(Graphics g) 
    {
        g.setColor(Color.blue);
        g.fillArc(30, 50, 80, 80, 0, -180);
        g.fillArc(30+80, 50, 80, 80, 0, +180);
        g.fillArc(30+160, 50, 80, 80, 0, -180);
        g.fillArc(30+240, 50, 80, 80, 0, +180);
    }
}
/*<html>
   <head>
   </head>
   <body>
        <applet code = "q6.class" width = "320" height = "480"></applet>
   </body>
</html>*/
