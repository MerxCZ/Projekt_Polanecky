package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InfoPage implements ActionListener {

    // All the frame components used in the info page
    JPanel infoPanel = new JPanel();
    JPanel rulesPanel = new JPanel();
    JLabel titleLabel = new JLabel();
    JLabel rulesLabel = new JLabel();
    JButton backButton = new JButton();
    JFrame infoPageFrame = new JFrame();


    InfoPage() {

        //Setup for panel for the tittle
        infoPanel.setBackground(new Color(38, 70, 83));
        infoPanel.setBounds(330, 80, 440, 100);

        //Setup for panel for the rules
        rulesPanel.setBackground(new Color(38, 70, 83));
        rulesPanel.setBounds(235, 200, 640, 375);

        //Setup for the title label
        titleLabel.setText("Info and Rules");
        titleLabel.setForeground(new Color(231, 111, 81));
        titleLabel.setFont(new Font("Default", Font.BOLD, 48));


        rulesLabel.setForeground(new Color(231, 111, 81));
        rulesLabel.setFont(new Font("Default", Font.PLAIN, 20));
        rulesLabel.setText("<html>Image Mode: In this mode you are guessing city by images,<br>you get maximum amount of 3 hints (including the first image),<br>you can take a guess after any hint you want, <br>but you can only take one guess.<br>     <br> <br> <br>Clue Mode: In this mode you are guessing city by clues,<br>you get maximum amount of 3 hints (including the first clue),<br>you can take a guess after any hint you want, <br>but you can only take one guess.<br> <br> <br> Your answer must be write correctly (like this London) </html>");

        //Setup of button for going back to the mode page
        backButton.setBounds(880, 650, 200, 50);
        backButton.setText("Back to mode page");
        backButton.setFont(new Font("Default", Font.PLAIN, 18));
        backButton.setBackground(new Color(38, 70, 83));
        backButton.setForeground(new Color( 231, 111, 81));
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        backButton.setOpaque(true);
        backButton.setFocusable(false);

        //Setup of the info page frame
        infoPageFrame.setTitle("Info and Rules");
        infoPageFrame.setVisible(true);
        infoPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        infoPageFrame.setSize(1100, 750);
        infoPageFrame.setLayout(null);
        infoPageFrame.setResizable(false);
        infoPageFrame.getContentPane().setBackground(new Color(42, 157, 143));
        infoPageFrame.add(infoPanel);
        infoPanel.add(titleLabel);
        infoPageFrame.add(backButton);
        infoPageFrame.add(rulesPanel);
        rulesPanel.add(rulesLabel);
        
    }

    // Action listener method for the button in the info page
    @Override
    public void actionPerformed(ActionEvent e) {

        // If the back button is pressed, the mode page is opened and the info page is closed
        if(e.getSource() == backButton) {
            ModePage m = new ModePage();
            infoPageFrame.dispose();
        }
    }
}