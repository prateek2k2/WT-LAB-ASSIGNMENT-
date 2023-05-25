import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.util.Locale;

public class loan extends JFrame implements ActionListener {
    private JTextField principalField, yearsField, rateField;
    private JLabel resultLabel;

    public loan() {
        JLabel principalLabel = new JLabel("Principal amount:");
        principalField = new JTextField(10);
        JLabel yearsLabel = new JLabel("Number of years:");
        yearsField = new JTextField(10);
        JLabel rateLabel = new JLabel("Annual interest rate (%):");
        rateField = new JTextField(10);
        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(4, 2));
        mainPanel.add(principalLabel);
        mainPanel.add(principalField);
        mainPanel.add(yearsLabel);
        mainPanel.add(yearsField);
        mainPanel.add(rateLabel);
        mainPanel.add(rateField);
        mainPanel.add(calculateBtn);
        mainPanel.add(resultLabel);
        setTitle("Monthly Payment Calculator (INR)");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double principal = Double.parseDouble(principalField.getText());
            double years = Double.parseDouble(yearsField.getText());
            double rate = Double.parseDouble(rateField.getText());
            double monthlyRate = rate / (12 * 100);
            double months = years * 12;
            double monthlyPayment = (principal * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
            Locale indiaLocale = new Locale("en", "IN");
            DecimalFormat inrFormat = (DecimalFormat) DecimalFormat.getCurrencyInstance(indiaLocale);
            String result = String.format("Monthly payment: %s", inrFormat.format(monthlyPayment));
            resultLabel.setText(result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for all three fields.");
        }
    }

    public static void main(String[] args) {
        new loan();
    }
}
