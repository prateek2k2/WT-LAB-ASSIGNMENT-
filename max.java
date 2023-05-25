import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class max extends JFrame implements ActionListener {
    private JTextField n1f, n2f, n3f;
    private JLabel resultLabel;

    public max() {
        // Create UI elements
        JLabel n1 = new JLabel("First Number:");
        n1f = new JTextField(10);
        JLabel n2 = new JLabel("Second Number:");
        n2f = new JTextField(10);
        JLabel n3 = new JLabel("Third Number:");
        n3f = new JTextField(10);
        JButton calculate = new JButton("Calculate");
        calculate.addActionListener(this);
        resultLabel = new JLabel("");
        JPanel mainPanel = new JPanel(new GridLayout(4, 2));
        mainPanel.add(n1);
        mainPanel.add(n1f);
        mainPanel.add(n2);
        mainPanel.add(n2f);
        mainPanel.add(n3);
        mainPanel.add(n3f);
        mainPanel.add(calculate);
        mainPanel.add(resultLabel);
        setTitle("Max of Three");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(n1f.getText());
            double num2 = Double.parseDouble(n2f.getText());
            double num3 = Double.parseDouble(n3f.getText());
            double max = Math.max(num1, Math.max(num2, num3));
            resultLabel.setText("Maximum number is " + max);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for all three fields.");
        }
    }

    public static void main(String[] args) {
        new max();
    }
}
