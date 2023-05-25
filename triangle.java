import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class triangle extends JPanel {
  
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] x = {25, 75, 50};
        int[] y = {30, 80, 50};
        int side = 3;
        g.drawPolygon(x, y, side);
    }
  
    public static void main(String[] args) {
        JFrame frame = new JFrame("Triangle Drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new triangle());
        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
