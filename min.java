import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class min extends JFrame implements ActionListener {
    private JTextField num1Field, num2Field, num3Field;
    private JLabel resultLabel;

    public min() {
        JLabel num1Label = new JLabel("First Number:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Second Number:");
        num2Field = new JTextField(10);
        JLabel num3Label = new JLabel("Third Number:");
        num3Field = new JTextField(10);
        JButton findBtn = new JButton("Find Minimum");
        findBtn.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(4, 2));
        mainPanel.add(num1Label);
        mainPanel.add(num1Field);
        mainPanel.add(num2Label);
        mainPanel.add(num2Field);
        mainPanel.add(num3Label);
        mainPanel.add(num3Field);
        mainPanel.add(findBtn);
        mainPanel.add(resultLabel);
        setTitle("Minimum of Three Numbers");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
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
            int min = Math.min(Math.min(num1, num2), num3);
            resultLabel.setText("Minimum of " + num1 + ", " + num2 + ", and " + num3 + " is " + min + ".");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for all three fields.");
        }
    }

    public static void main(String[] args) {
        new min();
    }
}
