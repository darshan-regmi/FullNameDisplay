import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FullNameDisplay {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Full Name Display");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 200);
        frame.setLayout(new FlowLayout());

        JTextField firstNameField = new JTextField(10);
        JTextField lastNameField = new JTextField(10);

        JButton displayButton = new JButton("Display");

        JLabel fullNameLabel = new JLabel("Full Name: ");

        displayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                fullNameLabel.setText("Full Name: " + firstName + " " + lastName);
            }
        });

        frame.add(new JLabel("First Name: "));
        frame.add(firstNameField);
        frame.add(new JLabel("Last Name: "));
        frame.add(lastNameField);
        frame.add(displayButton);
        frame.add(fullNameLabel);

        frame.setVisible(true);
    }
}
