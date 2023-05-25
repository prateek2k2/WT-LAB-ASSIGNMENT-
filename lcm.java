import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class t extends JFrame implements ActionListener {
    private JTextField f1, f2, f3;
    private JLabel resultLabel;

    public lcm() {
        JLabel num1Label = new JLabel("Enter first number:");
        f1 = new JTextField(10);
        JLabel num2Label = new JLabel("Enter second number:");
        f2 = new JTextField(10);
        JLabel num3Label = new JLabel("Enter third number:");
        f3 = new JTextField(10);
        JButton LCM = new JButton("Calculate LCM");
        LCM.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        JPanel num1Panel = new JPanel();
        num1Panel.add(num1Label);
        num1Panel.add(f1);
        mainPanel.add(num1Panel);
        JPanel num2Panel = new JPanel(new FlowLayout());
        num2Panel.add(num2Label);
        num2Panel.add(f2);
        mainPanel.add(num2Panel);
        JPanel num3Panel = new JPanel(new FlowLayout());
        num3Panel.add(num3Label);
        num3Panel.add(f3);
        mainPanel.add(num3Panel);
        mainPanel.add(LCM);
        mainPanel.add(resultLabel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
            int a = Integer.parseInt(f1.getText());
            int b = Integer.parseInt(f2.getText());
            int c = Integer.parseInt(f3.getText());
            int max = Math.max(Math.max(a, b), c);
            int lcm = max;
            while (true) {
                if (lcm % a == 0 && lcm % b == 0 && lcm % c == 0) {
                    resultLabel.setText("The LCM is " + lcm + ".");
                    break;
                }
                lcm += max;
            }
    }

    public static void main(String[] args) 
    {
        new lcm();
    }
}
