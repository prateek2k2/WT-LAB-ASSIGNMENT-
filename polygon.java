import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class polygon extends JPanel {
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        int[] x = { 100, 150, 200, 200, 150, 100 };
        int[] y = { 100, 50, 100, 150, 200, 150 };
        
        g.drawPolygon(x, y, 6);
    }
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hexagon");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        polygon hexagon = new polygon();
        hexagon.setSize(300, 300);
        frame.add(hexagon);
        
        frame.pack();
        frame.setVisible(true);
    }
}
