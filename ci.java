import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ci extends JFrame {

    private JTextField principalField, rateField, yearsField, timesPerYearField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public ci() {
        setTitle("Compound Interest Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        principalField = new JTextField(10);
        rateField = new JTextField(10);
        yearsField = new JTextField(10);
        timesPerYearField = new JTextField(10);
        calculateButton = new JButton("Calculate");
        resultLabel = new JLabel("");
        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(principalField.getText());
                    double rate = Double.parseDouble(rateField.getText());
                    double years = Double.parseDouble(yearsField.getText());
                    double timesPerYear = Double.parseDouble(timesPerYearField.getText());
                    double compoundInterest = principal * Math.pow(1 + (rate / timesPerYear), timesPerYear * years) - principal;
                    resultLabel.setText("Compound Interest: " + compoundInterest);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input");
                }
            }
        });
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));
        panel.add(new JLabel("Principal: "));
        panel.add(principalField);
        panel.add(new JLabel("Rate: "));
        panel.add(rateField);
        panel.add(new JLabel("Years: "));
        panel.add(yearsField);
        panel.add(new JLabel("Times per year: "));
        panel.add(timesPerYearField);
        panel.add(calculateButton);
        panel.add(resultLabel);

        // add panel to frame
        getContentPane().add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new ci();
    }
}
