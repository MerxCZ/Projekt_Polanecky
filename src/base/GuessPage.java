package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuessPage implements ActionListener {

    // All the frame components used in the guess page
    JPanel inputPanel = new JPanel();
    JTextField inputField = new JTextField();
    JLabel inputLabel = new JLabel();
    JButton enterButton = new JButton();
    JButton backButton = new JButton();
    JFrame guessPageFrame = new JFrame();

    String cityName;

    private int points;

    CitiesImage citiesImage = new CitiesImage(); //instance of the class CitiesImage

    GuessPage(String cityName) {

        this.cityName = cityName;

        // String city = citiesImage.getCity(numberCity);//getting the city from instance

        // Setup of the panel for the title, input field and enter button
        inputPanel.setBounds(350, 600, 200, 100);
        inputPanel.setBackground(new Color(231, 111, 81));
        inputPanel.setLayout(new GridLayout(1, 2));
        inputPanel.add(inputField);
        inputPanel.add(enterButton);
        inputPanel.add(inputLabel);

        // Setup of the label for the title
        inputLabel.setText("Guess the city");
        inputLabel.setFont(new Font("Default", Font.PLAIN, 16));
        inputLabel.setForeground(new Color(10, 10, 250));

        // Setup of the button for forwarding the guess
        enterButton.setBounds(600, 600, 200, 100);
        enterButton.setText("enter");
        enterButton.setFont(new Font("Default", Font.PLAIN, 16));
        enterButton.setBackground(new Color(231, 111, 81));
        enterButton.setForeground(new Color(233, 196, 106));
        enterButton.setBorder(BorderFactory.createEmptyBorder());
        enterButton.setOpaque(true);
        enterButton.setFocusable(false);
        enterButton.addActionListener(this);

        // Setup of the button for going back to the home page
        backButton.setBounds(880, 650, 200, 50);
        backButton.setText("Back to home page");
        backButton.setFont(new Font("Default", Font.PLAIN, 18));
        backButton.setBackground(new Color(38, 70, 83));
        backButton.setForeground(new Color( 231, 111, 81));
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        backButton.setOpaque(true);
        backButton.setFocusable(false);

        // Setup of the guess page frame
        guessPageFrame.setTitle("Guess Page");
        guessPageFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guessPageFrame.setSize(1100, 750);
        guessPageFrame.setLayout(null);
        guessPageFrame.getContentPane().setBackground(new Color(42, 157, 143));
        guessPageFrame.add(inputPanel);
        guessPageFrame.add(enterButton);
        guessPageFrame.add(backButton);
        guessPageFrame.add(inputLabel);
        guessPageFrame.setResizable(false);
        guessPageFrame.setVisible(true);
    }

    public void setPoints(int p)
    {
        this.points = p;
    }

    // Action listener method for the buttons in the guess page
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == backButton) {
            guessPageFrame.dispose();
            new ModePage();
        }


        //if enter is pressed it checks if the entered input belongs to the image
        if (e.getSource() == enterButton) {

            String input = inputField.getText().trim();
            if (input.equalsIgnoreCase(cityName)) {

                JOptionPane.showMessageDialog(guessPageFrame, "you got a " + points + " point, you can now return and play again");

                enterButton.setEnabled(false);
                inputField.setEnabled(false);

            } else {
                JOptionPane.showMessageDialog(guessPageFrame, "you didnt get any points, you can now return to mode page and try again");

                enterButton.setEnabled(false);
                inputField.setEnabled(false);

            }
        }
    }
}