import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class color extends JFrame implements ActionListener 
{
    JButton yellow, blue, pink;
    JPanel p;
    public color() 
    {
        setSize(500, 500);
        p = new JPanel();
        yellow = new JButton("Yellow");
        blue = new JButton("Blue");
        pink = new JButton("Pink");
        yellow.addActionListener(this);
        blue.addActionListener(this);
        pink.addActionListener(this);
        p.add(yellow);
        p.add(blue);
        p.add(pink);
        add(p);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == yellow) 
        {
            p.setBackground(Color.yellow);
        }
         else if (e.getSource() == blue) 
         {
            p.setBackground(Color.blue);
        } 
        else if (e.getSource() == pink)
        {
            p.setBackground(Color.pink);
        }
    }

    public static void main(String[] args) {
        new color();
    }
}