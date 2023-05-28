package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class ModePage implements ActionListener {

    // All the frame components used in the mode page
    JPanel titlePanel2 = new JPanel();
    JLabel labelText2 = new JLabel();
    JButton backButton = new JButton();
    JButton imageModeButton = new JButton();
    JButton clueModeButton = new JButton();
    JButton infoButton1 = new JButton();
    JButton infoButton2 = new JButton();
    JFrame modePageFrame = new JFrame();

    ModePage() {

        // Path of the icon used in the buttons in mode page
        ImageIcon iconInterrogation = new ImageIcon(ModePage.class.getResource("/interrogation.png"));

        // Setup of the panel for the title
        titlePanel2.setBackground(new Color(38, 70, 83));
        titlePanel2.setBounds(280, 150, 540, 60);
        titlePanel2.add(labelText2);

        // Setup of the label for title
        labelText2.setText("Please select game mode");
        labelText2.setForeground(new Color(231, 111, 81));
        labelText2.setFont(new Font("Default", Font.BOLD, 40));

        // Setup of button for continuing the Image mode
        imageModeButton.setBounds(350, 250, 350, 80);
        imageModeButton.setText("Image mode");
        imageModeButton.setFont(new Font("Default", Font.PLAIN, 36));
        imageModeButton.setBackground(new Color(233, 196, 106));
        imageModeButton.setForeground(new Color( 231, 111, 81));
        imageModeButton.setBorder(BorderFactory.createEmptyBorder());
        imageModeButton.setOpaque(true);
        imageModeButton.setFocusable(false);
        imageModeButton.addActionListener(this);

        // Setup of button for continuing the Clue mode
        clueModeButton.setBounds(350, 380, 350, 80);
        clueModeButton.setText("Clues mode");
        clueModeButton.setFont(new Font("Default", Font.PLAIN, 36));
        clueModeButton.setBackground(new Color(233, 196, 106));
        clueModeButton.setForeground(new Color( 231, 111, 81));
        clueModeButton.setBorder(BorderFactory.createEmptyBorder());
        clueModeButton.setOpaque(true);
        clueModeButton.setFocusable(false);
        clueModeButton.addActionListener(this);

        // Setup of button for going back to the home page
        backButton.setBounds(880, 650, 200, 50);
        backButton.setText("Back to home page");
        backButton.setFont(new Font("Default", Font.PLAIN, 18));
        backButton.setBackground(new Color(38, 70, 83));
        backButton.setForeground(new Color( 231, 111, 81));
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        backButton.setOpaque(true);
        backButton.setFocusable(false);

        // Setup of button for going to the info page
        infoButton1.setIcon(iconInterrogation);
        infoButton1.setBounds(715, 265, 50, 50);
        infoButton1.setBackground(new Color(42, 157, 143));
        infoButton1.setBorder(BorderFactory.createEmptyBorder());
        infoButton1.setOpaque(true);
        infoButton1.setFocusable(false);
        infoButton1.addActionListener(this);

        // Setup of button for going to the info page
        infoButton2.setIcon(iconInterrogation);
        infoButton2.setBounds(715, 395, 50, 50);
        infoButton2.setBackground(new Color(42, 157, 143));
        infoButton2.setBorder(BorderFactory.createEmptyBorder());
        infoButton2.setOpaque(true);
        infoButton2.setFocusable(false);
        infoButton2.addActionListener(this);

        // Setup of the mode page frame
        modePageFrame.setTitle("Games Modes");
        modePageFrame.setVisible(true);
        modePageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        modePageFrame.setSize(1100, 750);
        modePageFrame.setLayout(null);
        modePageFrame.setResizable(false);
        modePageFrame.getContentPane().setBackground(new Color(42, 157, 143));
        modePageFrame.add(backButton);
        modePageFrame.add(imageModeButton);
        modePageFrame.add(clueModeButton);
        modePageFrame.add(titlePanel2);
        modePageFrame.add(infoButton1);
        modePageFrame.add(infoButton2);


    }

    // Action listener method for the buttons in the mode page
    @Override
    public void actionPerformed(ActionEvent e) {

        // If the back button is pressed, the main page is opened and the mode page is closed
        if(e.getSource() == backButton) {
            MainPage m = new MainPage();
            modePageFrame.dispose();
        }

        // If the info button is pressed, the info page is opened and the mode page is closed
        if(e.getSource() == infoButton1) {
            InfoPage infoPage = new InfoPage();
            modePageFrame.dispose();
        }
        // If the info button is pressed, the info page is opened and the mode page is closed
        if(e.getSource() == infoButton2) {
            InfoPage infoPage = new InfoPage();
            modePageFrame.dispose();
        }
        // If the image mode button is pressed, the image mode is opened and the mode page is closed
        if(e.getSource() == clueModeButton) {
            ClueMode clueMode = new ClueMode(0);
            modePageFrame.dispose();
        //if the imagemode button is pressed one random image is picked
        } else if (e.getSource() == imageModeButton) {
            modePageFrame.dispose();
            java.util.Random generator = new Random();
            int genNumber = generator.nextInt(8) + 1;
            ArrayList<Integer> list = new ArrayList<>();
            list.add(genNumber);

            ImageMode firstImage = new ImageMode(genNumber, 1, list, 0);
        }
    }
}