import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class secondlargest extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, num3Field;
    private JLabel resultLabel;
    public secondlargest() {
        JLabel n1 = new JLabel("Enter first number:");
        num1Field = new JTextField(10);
        JLabel n2 = new JLabel("Enter second number:");
        num2Field = new JTextField(10);
        JLabel n3 = new JLabel("Enter third number:");
        num3Field = new JTextField(10);
        JButton calculateBtn = new JButton("Find Second Largest");
        calculateBtn.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(5, 1));
        JPanel num1Panel = new JPanel(new FlowLayout());
        num1Panel.add(n1);
        num1Panel.add(num1Field);
        mainPanel.add(num1Panel);
        JPanel num2Panel = new JPanel(new FlowLayout());
        num2Panel.add(n2);
        num2Panel.add(num2Field);
        mainPanel.add(num2Panel);
        JPanel num3Panel = new JPanel(new FlowLayout());
        num3Panel.add(n3);
        num3Panel.add(num3Field);
        mainPanel.add(num3Panel);
        mainPanel.add(calculateBtn);
        mainPanel.add(resultLabel);
        setTitle("Second Largest Number Finder");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int num3 = Integer.parseInt(num3Field.getText());
            int secondLargest;
            if (num1 >= num2 && num1 >= num3) {
                secondLargest = Math.max(num2, num3);
            } else if (num2 >= num1 && num2 >= num3) {
                secondLargest = Math.max(num1, num3);
            } else {
                secondLargest = Math.max(num1, num2);
            }
            String result = String.format("The second largest number is: %d", secondLargest);
            resultLabel.setText(result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid integers.");
        }
    }

    public static void main(String[] args) {
        new secondminimum();
    }
}
