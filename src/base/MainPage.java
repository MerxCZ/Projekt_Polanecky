package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;

public class MainPage extends JFrame implements ActionListener {


        // All the frame components used in the main page
        JPanel titlePanel = new JPanel();
        JPanel iconPanel = new JPanel();
        JLabel titleLabel = new JLabel();
        JLabel iconLabel = new JLabel();
        JButton gameModesButton = new JButton();
        JFrame mainPageFrame = new JFrame();


        MainPage() {

                // Paths for the icons used in the labels and button in main page
                ImageIcon iconMarker = new ImageIcon(MainPage.class.getResource("/marker-3.png"));
                ImageIcon iconBurger = new ImageIcon(MainPage.class.getResource("/menu-burger.png"));

                // Setup for panel for the tittle
                titlePanel.setBackground(new Color(38, 70, 83));
                titlePanel.setBounds(380, 210, 400, 100);
                titlePanel.add(titleLabel);

                // Setup of panel for the marker icon
                iconPanel.setBackground(new Color(38, 70, 83));
                iconPanel.setBounds(230, 185, 140, 140);
                iconPanel.add(iconLabel);

                // Set icon for the label
                iconLabel.setIcon(iconMarker);

                // Setup of label for the tittle
                titleLabel.setText("City Guesser");
                titleLabel.setForeground(new Color(231, 111, 81));
                titleLabel.setFont(new Font("Default", Font.BOLD, 60));

                // Setup of button for continuing the game modes screen
                gameModesButton.setBounds(380, 400, 400, 100);
                gameModesButton.setText(" game modes:  ");
                gameModesButton.setFont(new Font("Default", Font.PLAIN, 40));
                gameModesButton.setIcon(iconBurger);
                gameModesButton.setHorizontalTextPosition(JButton.LEFT);
                gameModesButton.setBackground(new Color(42, 157, 143));
                gameModesButton.setForeground(new Color(233, 196, 106));
                gameModesButton.setBorder(BorderFactory.createEmptyBorder());
                gameModesButton.setOpaque(true);
                gameModesButton.setFocusable(false);
                gameModesButton.addActionListener(this);

                // Setup of the main page frame
                mainPageFrame.setTitle("City guesser");
                mainPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainPageFrame.setSize(1100, 750);
                mainPageFrame.setLayout(null);
                mainPageFrame.setResizable(false);
                mainPageFrame.add(gameModesButton);
                mainPageFrame.getContentPane().setBackground(new Color(38, 70, 83));
                mainPageFrame.add(titlePanel);
                mainPageFrame.add(iconPanel);
                mainPageFrame.setVisible(true);

        }

        // Action listener method for the button in main page
        @Override
        public void actionPerformed(ActionEvent e) {

                // If the button is pressed, the mode page is opened and the main page is closed
                if(e.getSource()== gameModesButton) {
                        ModePage modePage = new ModePage();
                        mainPageFrame.dispose();

                }
        }
}
