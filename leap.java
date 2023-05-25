import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class leap extends JFrame implements ActionListener {
    private JTextField yrf;
    private JLabel resultLabel;

    public leap() {
        JLabel year = new JLabel("Enter a year:");
        yrf = new JTextField(10);
        JButton checkBtn = new JButton("Check");
        checkBtn.addActionListener(this);
        resultLabel = new JLabel("");
        JPanel mainPanel = new JPanel(new GridLayout(2, 2));
        mainPanel.add(year);
        mainPanel.add(yrf);
        mainPanel.add(checkBtn);
        mainPanel.add(resultLabel);
        setTitle("Leap Year Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int year = Integer.parseInt(yrf.getText());
            boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

            if (isLeapYear) {
                resultLabel.setText(year + " is a leap year.");
            } else {
                resultLabel.setText(year + " is not a leap year.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid year.");
        }
    }

    public static void main(String[] args) {
        new leap();
    }
}
