import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberCheckApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Number Check App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(10);
        JButton checkButton = new JButton("Check Number");

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField.getText();
                if (isNumeric(input)) {
                    JOptionPane.showMessageDialog(frame, "It is a Number!");
                } else {
                    JOptionPane.showMessageDialog(frame, "It is not a Number!");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(checkButton);

        frame.getContentPane().add(panel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null); // Center the frame
        frame.setVisible(true);
    }

    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
