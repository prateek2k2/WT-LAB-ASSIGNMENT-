import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc extends JFrame implements ActionListener {
    
    private JLabel resultLabel;
    private JTextField num1Field, num2Field;
    private JButton addButton, subtractButton, multiplyButton, divideButton;
    
    public calc() {
        setTitle("Simple Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        num1Field = new JTextField(10);
        num2Field = new JTextField(10);
        addButton = new JButton("+");
        subtractButton = new JButton("-");
        multiplyButton = new JButton("*");
        divideButton = new JButton("/");
        resultLabel = new JLabel("Result: ");
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("Number 1: "));
        contentPane.add(num1Field);
        contentPane.add(new JLabel("Number 2: "));
        contentPane.add(num2Field);
        contentPane.add(addButton);
        contentPane.add(subtractButton);
        contentPane.add(multiplyButton);
        contentPane.add(divideButton);
        contentPane.add(resultLabel);
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        try {

            double num1 = Double.parseDouble(num1Field.getText());
            double num2 = Double.parseDouble(num2Field.getText());
            if (e.getSource() == addButton) {
                resultLabel.setText("Result: " + (num1 + num2));
            } else if (e.getSource() == subtractButton) {
                resultLabel.setText("Result: " + (num1 - num2));
            } else if (e.getSource() == multiplyButton) {
                resultLabel.setText("Result: " + (num1 * num2));
            } else if (e.getSource() == divideButton) {
                resultLabel.setText("Result: " + (num1 / num2));
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Result: Invalid input");
        }
    }
    
    public static void main(String[] args) {
        new calc();
    }
}
