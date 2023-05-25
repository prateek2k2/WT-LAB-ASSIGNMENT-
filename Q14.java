import java.applet.Applet;
import java.awt.Graphics;

public class Q14 extends Applet {
    
    public void paint(Graphics g) {
        super.paint(g);
        
        // Define the coordinates of the hexagon
        int[] xPoints = {50, 100, 150, 150, 100, 50};
        int[] yPoints = {100, 100, 125, 175, 200, 200};
        
        // Draw the hexagon using the drawPolygon() method
        g.drawPolygon(xPoints, yPoints, 6);
    }
}
