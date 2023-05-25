import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class armstrong extends JFrame implements ActionListener {
    private JTextField numField;
    private JLabel resultLabel;

    public armstrong() {
        JLabel numLabel = new JLabel("Enter a number:");
        numField = new JTextField(10);
        JButton checkBtn = new JButton("Check if Strong");
        checkBtn.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(3, 1));
        JPanel numPanel = new JPanel(new FlowLayout());
        numPanel.add(numLabel);
        numPanel.add(numField);
        mainPanel.add(numPanel);
        mainPanel.add(checkBtn);
        mainPanel.add(resultLabel);
        setTitle("Strong Number Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(numField.getText());
            int sum = 0;
            int temp = num;
            while (temp > 0) {
                int digit = temp % 10;
                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact *= i;
                }
                sum += fact;
                temp /= 10;
            }
            if (sum == num) {
                resultLabel.setText("The number is a strong number.");
            } else {
                resultLabel.setText("The number is not a strong number.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new armstrong();
    }
}
