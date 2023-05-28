

package base;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ClueMode implements ActionListener {

    // All the frame components used in the clue mode page
    JPanel cluePanel = new JPanel();
    JLabel clueLabel = new JLabel();
    JButton backButton = new JButton();
    JFrame clueModeFrame = new JFrame();
    JButton nextHintButton = new JButton();
    JButton guessButton = new JButton();
    GeneratingClues clue = new GeneratingClues(); //instance of the class generating clues

    City city = clue.randomCity();

    //variable for counting the number of clues
    private int numberOfClues;


    ClueMode(int numberOfClues) {


        this.numberOfClues = numberOfClues;
        String firstClue = city.getClues().get(numberOfClues).getText();

        // Setup of the panel for the clues
        cluePanel.setBackground(new Color(38, 70, 83));
        cluePanel.setBounds(125, 80, 920, 250);
        cluePanel.setBorder(BorderFactory.createEmptyBorder());
        cluePanel.setOpaque(true);
        cluePanel.add(clueLabel);

        // Setup of the label for the clues
        clueLabel.setForeground(new Color(233, 196, 106));
        clueLabel.setFont(new Font("Default", Font.PLAIN, 22));
        clueLabel.setText(firstClue);
        cluePanel.setOpaque(true);

        // Setup of button for going back to the mode page
        backButton.setBounds(880, 650, 200, 50);
        backButton.setText("Back to mode page");
        backButton.setFont(new Font("Default", Font.PLAIN, 18));
        backButton.setBackground(new Color(38, 70, 83));
        backButton.setForeground(new Color(231, 111, 81));
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
        backButton.setOpaque(true);
        backButton.setFocusable(false);

        // Setup of button for going to the next clue
        nextHintButton.setBounds(300, 390, 250, 100);
        nextHintButton.setText("next hint");
        nextHintButton.setFont(new Font("Default", Font.PLAIN, 32));
        nextHintButton.setBackground(new Color(231, 111, 81));
        nextHintButton.setForeground(new Color(233, 196, 106));
        nextHintButton.setBorder(BorderFactory.createEmptyBorder());
        nextHintButton.setOpaque(true);
        nextHintButton.setFocusable(false);
        nextHintButton.addActionListener(this);

        // Setup of button for going to the guess page
        guessButton.setBounds(620, 390, 250, 100);
        guessButton.setText("Take a guess");
        guessButton.setFont(new Font("Default", Font.PLAIN, 32));
        guessButton.setHorizontalTextPosition(JButton.LEFT);
        guessButton.setBackground(new Color(231, 111, 81));
        guessButton.setForeground(new Color(233, 196, 106));
        guessButton.setBorder(BorderFactory.createEmptyBorder());
        guessButton.setOpaque(true);
        guessButton.setFocusable(false);
        guessButton.addActionListener(this);

        // Setup of the frame for the clue mode page
        clueModeFrame.setTitle("Clue Mode");
        clueModeFrame.setVisible(true);
        clueModeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clueModeFrame.setSize(1100, 750);
        clueModeFrame.setLayout(null);
        clueModeFrame.getContentPane().setBackground(new Color(42, 157, 143));
        clueModeFrame.add(cluePanel);
        clueModeFrame.add(backButton);
        clueModeFrame.add(nextHintButton);
        clueModeFrame.add(guessButton);
    }

    public ClueMode() {
    }

    // Action listener method for the buttons in the clue mode page
    @Override
    public void actionPerformed(ActionEvent e) {

        // If the back button is pressed, the mode page is opened and the clue mode page is closed
        if (e.getSource() == backButton) {
            ModePage modePage = new ModePage();
            clueModeFrame.dispose();
        }
        // If the next hint button is pressed, the next clue is displayed
        if (e.getSource() == nextHintButton) {

            if(numberOfClues < 2)
            {
                numberOfClues++;
                String nextClue = city.getClues().get(numberOfClues).getText();
                clueLabel.setText(nextClue);
            }else{
                GuessPage guessPage = new GuessPage(city.getCityName());
                guessPage.setPoints(city.getClues().get(numberOfClues).getPoints());
                clueModeFrame.dispose();
            }
        }

        // If the guess button is pressed, the guess page is opened and the clue mode page is closed
        if (e.getSource() == guessButton) {
            clueModeFrame.dispose();
            GuessPage page = new GuessPage(city.getCityName());
            page.setPoints(city.getClues().get(numberOfClues).getPoints());

        }
    }
}