import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class grade extends JFrame implements ActionListener {
    private JTextField[] subjectFields;
    private JLabel resultLabel;

    public grade() {
        JLabel[] subjectLabels = new JLabel[5];
        subjectFields = new JTextField[5];
        for (int i = 0; i < 5; i++) {
            subjectLabels[i] = new JLabel("Subject " + (i + 1) + " marks:");
            subjectFields[i] = new JTextField(10);
        }
        JButton calculateBtn = new JButton("Calculate");
        calculateBtn.addActionListener(this);
        resultLabel = new JLabel();
        JPanel mainPanel = new JPanel(new GridLayout(7, 1));
        for (int i = 0; i < 5; i++) {
            JPanel subjectPanel = new JPanel(new FlowLayout());
            subjectPanel.add(subjectLabels[i]);
            subjectPanel.add(subjectFields[i]);
            mainPanel.add(subjectPanel);
        }
        mainPanel.add(calculateBtn);
        mainPanel.add(resultLabel);
        setTitle("Grade Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setContentPane(mainPanel);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            // Get marks from text fields and calculate average
            double totalMarks = 0;
            for (int i = 0; i < 5; i++) {
                totalMarks += Double.parseDouble(subjectFields[i].getText());
            }
            double averageMarks = totalMarks / 5;
            String grade;
            if (averageMarks >= 90) {
                grade = "O";
            } else if (averageMarks >= 80) {
                grade = "E";
            } else if (averageMarks >= 70) {
                grade = "A";
            } else if (averageMarks >= 60) {
                grade = "B";
            } else if (averageMarks >= 50) {
                grade = "C";
            } else if (averageMarks >= 40) {
                grade = "D";
            } else {
                grade = "F";
            }
            String result = String.format("Average marks: %.2f\nGrade: %s", averageMarks, grade);
            resultLabel.setText(result);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter valid marks for all five subjects.");
        }
    }

    public static void main(String[] args) {
        new grade();
    }
}
