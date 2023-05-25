import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sum extends JFrame implements ActionListener {
    private JTextField numField;
    private JLabel resultLabel;

    public sum() {
        JLabel numLabel = new JLabel("Enter a number:");
        numField = new JTextField(10);
        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(3, 1));
        JPanel numPanel = new JPanel(new FlowLayout());
        numPanel.add(numLabel);
        numPanel.add(numField);
        mainPanel.add(numPanel);
        mainPanel.add(calculateBtn);
        mainPanel.add(resultLabel);
        setTitle("Digit Sum Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(numField.getText());
            int digitSum = 0;
            while (num != 0) {
                digitSum += num % 10;
                num /= 10;
            }
            String result = String.format("The sum of digits is: %d", digitSum);
            resultLabel.setText(result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid integer.");
        }
    }

    public static void main(String[] args) {
        new sum();
    }
}
