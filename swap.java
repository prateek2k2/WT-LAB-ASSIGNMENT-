import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class swap extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field;

    public swap() {
        JLabel num1Label = new JLabel("First Number:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Second Number:");
        num2Field = new JTextField(10);
        JButton swapBtn = new JButton("Swap");
        swapBtn.addActionListener(this);
        JPanel mainPanel = new JPanel(new GridLayout(3, 2));
        mainPanel.add(num1Label);
        mainPanel.add(num1Field);
        mainPanel.add(num2Label);
        mainPanel.add(num2Field);
        mainPanel.add(swapBtn);
        setTitle("Swap Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            num1 = num1 + num2;
            num2 = num1 - num2;
            num1 = num1 - num2;
            num1Field.setText(Integer.toString(num1));
            num2Field.setText(Integer.toString(num2));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for both fields.");
        }
    }

    public static void main(String[] args) {
        new swap();
    }
}
