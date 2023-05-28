package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

public class ImageMode implements ActionListener {

    // All the frame components used in the image mode page
    JPanel ImagePanel = new JPanel();
    JLabel IconLabel = new JLabel();
    JButton backButton = new JButton();
    JButton startButton = new JButton();
    JButton nextHintButton = new JButton();
    JButton guessButton = new JButton();
    JFrame imageModeFrame = new JFrame();

    // All the variables used in the image mode page
    private int numberCity;
    private int numberPhoto;
    private ArrayList<Integer> listOfUsedCities;

    private int usedClues = 0;

    ImageMode(int numberCity, int numberPhoto, ArrayList<Integer> listOfUsedCities, int usedClues) {

        this.usedClues = usedClues;

        // Setting the variables
        this.numberCity = numberCity;
        this.numberPhoto = numberPhoto;
        this.listOfUsedCities = listOfUsedCities;

        if (listOfUsedCities.size() <= 3) {

            //Path for the images used in the image mode
            ImageIcon img1 = new ImageIcon(ImageMode.class.getResource("/CityImages/" + numberCity + "_City/" + numberPhoto + "_Image.jpg"));

            //Setup of the panel for the Images
            ImagePanel.setBackground(new Color(38, 70, 83));
            ImagePanel.setBounds(170, 25, 740, 620);
            ImagePanel.add(IconLabel);

            //Setup of the label for the images
            IconLabel.setIcon(img1);

            //Setup of the button for going back to the mode page
            backButton.setBounds(880, 650, 200, 50);
            backButton.setText("Back to mode page");
            backButton.setFont(new Font("Default", Font.PLAIN, 18));
            backButton.setBackground(new Color(38, 70, 83));
            backButton.setForeground(new Color(231, 111, 81));
            backButton.setBorder(BorderFactory.createEmptyBorder());
            backButton.addActionListener(this);
            backButton.setOpaque(true);
            backButton.setFocusable(false);

            //Setup of the button for next hint(next picture)
            nextHintButton.setBounds(280, 520, 250, 100);
            nextHintButton.setText("next hint");
            nextHintButton.setFont(new Font("Default", Font.PLAIN, 32));
            nextHintButton.setHorizontalTextPosition(JButton.LEFT);
            nextHintButton.setBackground(new Color(231, 111, 81));
            nextHintButton.setForeground(new Color(233, 196, 106));
            nextHintButton.setBorder(BorderFactory.createEmptyBorder());
            nextHintButton.setOpaque(true);
            nextHintButton.setFocusable(false);
            nextHintButton.addActionListener(this);

            //Setup of the button for going to the guess page(to take a guess)
            guessButton.setBounds(550, 520, 250, 100);
            guessButton.setText("Take a guess");
            guessButton.setFont(new Font("Default", Font.PLAIN, 32));
            guessButton.setHorizontalTextPosition(JButton.LEFT);
            guessButton.setBackground(new Color(231, 111, 81));
            guessButton.setForeground(new Color(233, 196, 106));
            guessButton.setBorder(BorderFactory.createEmptyBorder());
            guessButton.setOpaque(true);
            guessButton.setFocusable(false);
            guessButton.addActionListener(this);

            // Setup of the image mode frame
            imageModeFrame.setTitle("Image Mode");
            imageModeFrame.setVisible(true);
            imageModeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            imageModeFrame.setSize(1100, 750);
            imageModeFrame.setLayout(null);
            imageModeFrame.setResizable(false);
            imageModeFrame.getContentPane().setBackground(new Color(42, 157, 143));
            imageModeFrame.add(backButton);
            imageModeFrame.add(startButton);
            imageModeFrame.add(nextHintButton);
            imageModeFrame.add(guessButton);
            imageModeFrame.add(ImagePanel);

        } else {
            imageModeFrame.dispose();
            GuessPage page = new GuessPage(new CitiesImage().getCity(numberCity));
            page.setPoints(3 - usedClues);
        }
    }
    // Action listener method for the buttons used in image mode
    @Override
    public void actionPerformed(ActionEvent e) {

        // If the back button is pressed, the mode page is opened and the image mode frame is disposed
        if (e.getSource() == backButton) {
            imageModeFrame.dispose();
            new ModePage();
        }

        // If the next hint button is pressed, the next image is opened and the image mode frame is disposed
        if (e.getSource() == nextHintButton) {
            imageModeFrame.dispose();
            listOfUsedCities.add(numberCity);
            usedClues++;
            ImageMode nextImage = new ImageMode(numberCity, numberPhoto + 1, listOfUsedCities, usedClues);
        }
        //If the guess button is pressed, the guess page is opened and the image mode frame is disposed
        if (e.getSource() == guessButton) {
            imageModeFrame.dispose();
            GuessPage page = new GuessPage(new CitiesImage().getCity(numberCity));
            page.setPoints(3 - usedClues);
        }
    }
}
