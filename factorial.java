import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class factorial extends JFrame implements ActionListener {

    private JTextField inputField;
    private JButton calculateButton;
    private JLabel resultLabel;

    public factorial() {
        setTitle("Factorial Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        inputField = new JTextField(10);
        calculateButton = new JButton("Calculate");

        resultLabel = new JLabel("Result: ");
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Enter a number: "));
        contentPane.add(inputField);
        contentPane.add(calculateButton);
        contentPane.add(resultLabel);
        calculateButton.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }
            resultLabel.setText("Result: " + factorial);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }
    public static void main(String[] args) {
        new factorial();
    }
}
