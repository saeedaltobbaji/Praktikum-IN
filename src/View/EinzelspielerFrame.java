package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EinzelspielerFrame extends JFrame {
    public EinzelspielerFrame() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Geben Sie die Tabellengröße ein:");
        JTextField textField = new JTextField(10);
        JButton okButton = new JButton("OK");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String input = textField.getText();
                int tableSize = Integer.parseInt(input);

                // Erstellt die GameTableSplitContainer mit der eingegebenen Tabellengröße
                GameTableSplitContainer gameTableSplitContainer = new GameTableSplitContainer(tableSize);

                
                dispose();
            }
        });

        add(label);
        add(textField);
        add(okButton);

        setSize(300, 150);
        setLocationRelativeTo(null);
    }

    


}
