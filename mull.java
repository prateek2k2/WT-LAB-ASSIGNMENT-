import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class mull extends JFrame implements ActionListener
{
    JTextField num1, num2, result;
    JButton multi;
    JLabel a1,a2,a3;

    public mull() {
        super("Division");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        num1 = new JTextField(10);
        num2 = new JTextField(10);
        result = new JTextField(10);
        result.setEditable(false);
        multi = new JButton("DIVIDE");
        a1=new JLabel("Enter first number:");
        a2=new JLabel("Enter second number:");
        a3=new JLabel("Result:");
        setLayout(new GridLayout(7,1));
        JPanel panel;
        panel=new JPanel();
        panel.add(a1);
        panel.add(num1);add(panel);
        panel=new JPanel();
        panel.add(a2);
        panel.add(num2);add(panel);
        panel=new JPanel();
        panel.add(a3);
        panel=new JPanel();
        panel.add(result);add(panel);
        panel=new JPanel();
        panel.add(multi);

        multi.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());

        if (e.getSource() == multi) {
            result.setText(Integer.toString(a * b));
        }
    }
}
