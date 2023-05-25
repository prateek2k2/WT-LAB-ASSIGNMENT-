import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class temprature extends JFrame implements ActionListener {
    private JLabel celsiusLabel, fahrenheitLabel;
    private JTextField celsiusField, fahrenheitField;
    private JButton celsiusToFahrenheitBtn, fahrenheitToCelsiusBtn;

    public temprature() {
        setTitle("Temprature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        celsiusLabel = new JLabel("Celsius");
        fahrenheitLabel = new JLabel("Fahrenheit");
        celsiusField = new JTextField(10);
        fahrenheitField = new JTextField(10);
        celsiusToFahrenheitBtn = new JButton("Convert to Fahrenheit");
        fahrenheitToCelsiusBtn = new JButton("Convert to Celsius");
        celsiusToFahrenheitBtn.addActionListener(this);
        fahrenheitToCelsiusBtn.addActionListener(this);
        JPanel mainPanel = new JPanel(new GridLayout(3, 2));
        mainPanel.add(celsiusLabel);
        mainPanel.add(celsiusField);
        mainPanel.add(celsiusToFahrenheitBtn);
        mainPanel.add(fahrenheitLabel);
        mainPanel.add(fahrenheitField);
        mainPanel.add(fahrenheitToCelsiusBtn);
        setTitle("Temperature Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == celsiusToFahrenheitBtn) {
            try {
                double celsius = Double.parseDouble(celsiusField.getText());
                double fahrenheit = (celsius * 1.8) + 32;
                fahrenheitField.setText(String.format("%.2f", fahrenheit));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number for Celsius.");
            }
        } else if (e.getSource() == fahrenheitToCelsiusBtn) {
            try {
                double fahrenheit = Double.parseDouble(fahrenheitField.getText());
                double celsius = (fahrenheit - 32) / 1.8;
                celsiusField.setText(String.format("%.2f", celsius));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Please enter a valid number for Fahrenheit.");
            }
        }
    }

    public static void main(String[] args) {
        new temprature();
    }
}
