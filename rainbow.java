import java.applet.*;
import java.awt.*;
/*
<Applet code="rainbow"  width=1200   height=1200>
</Applet>
*/
import java.awt.Color;
import java.awt.Graphics;
import java.applet.Applet;

public class rainbow extends Applet {
  
    public void paint(Graphics g) {
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        int diameter = Math.min(getWidth(), getHeight());
        
        // Draw the red arc
        g.setColor(Color.RED);
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 0, 180);
        
        // Draw the orange arc
        g.setColor(Color.ORANGE);
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 20, 140);
        
        // Draw the yellow arc
        g.setColor(Color.YELLOW);
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 40, 100);
        
        // Draw the green arc
        g.setColor(Color.GREEN);
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 80, 80);
        
        // Draw the blue arc
        g.setColor(Color.BLUE);
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 120, 60);
        
        // Draw the indigo arc
        g.setColor(new Color(75, 0, 130)); // This creates a custom indigo color
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 140, 40);
        
        // Draw the violet arc
        g.setColor(new Color(238, 130, 238)); // This creates a custom violet color
        g.fillArc(centerX - diameter / 2, centerY - diameter / 2, diameter, diameter, 160, 20);
    }
}
