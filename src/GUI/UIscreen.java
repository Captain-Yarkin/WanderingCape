package GUI;

import GUI.UI.ChoiceControls;
import Music.Sound;

import javax.swing.*;
import java.awt.*;

/**
 * This is where everything that is shown to the user is created from title screen to choice buttons
 */
public class UIscreen {

    JFrame gameWindow;
    public JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;
    public JLabel titelNameLabel, healthLabel, healthNumberLabel, weaponLabel, weaponNameLabel;
    public JButton startButton, choice1, choice2, choice3, choice4;
    public JTextArea mainTextArea;
    String title = "Wandering Cape";
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font noramlFont = new Font("Times New Roman", Font.PLAIN, 28);
    Color backgroundColor = Color.BLACK;
    Color foregroundColor = Color.WHITE;
    Sound sound = new Sound();

    /**
     * This creates the user interface for how the screen parametars are and how the user sees the game.
     * @param choiceHandler
     */
    //This build currently does not support fullscreen
    public void createScreen(ChoiceControls choiceHandler) {
        int height = 1000;
        int width = 800;

        // GAME WINDOW
        gameWindow = new JFrame();
        gameWindow.setSize(height, width);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(backgroundColor);
        gameWindow.setLayout(null);
        gameWindow.setTitle(title);
        gameWindow.setVisible(true);

        // TITLE SCREEN
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(200,250,600,100);
        titleNamePanel.setBackground(backgroundColor);
        titelNameLabel = new JLabel(title.toUpperCase());
        titelNameLabel.setForeground(foregroundColor);
        titelNameLabel.setFont(titleFont);
        titleNamePanel.add(titelNameLabel);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(400,500, 200, 100);
        startButtonPanel.setBackground(backgroundColor);
        startButton = new JButton("START GAME");
        startButton.setBackground(backgroundColor);
        startButton.setForeground(foregroundColor);
        startButton.setFont(noramlFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

        gameWindow.add(titleNamePanel);
        gameWindow.add(startButtonPanel);

        //CHOICE WINDOW

            //Where the text appears to describe the scene
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,800,350);
        mainTextPanel.setBackground(backgroundColor);
        gameWindow.add(mainTextPanel);

        mainTextArea = new JTextArea("Testing the main text Area. Are we good houston?");
        mainTextArea.setBounds(100,100,800,350);
        mainTextArea.setBackground(backgroundColor);
        mainTextArea.setForeground(foregroundColor);
        mainTextArea.setFont(noramlFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

            //Choice box with buttons
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(350,500,300,150);
        choiceButtonPanel.setBackground(backgroundColor);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        gameWindow.add(choiceButtonPanel);

            //Choice box buttons
                //Choice 1
        choice1 = new JButton("1");
        choice1.setBackground(backgroundColor);
        choice1.setForeground(foregroundColor);
        choice1.setFont(noramlFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("choice1");
        choiceButtonPanel.add(choice1);
                //Choice 2
        choice2 = new JButton("2");
        choice2.setBackground(backgroundColor);
        choice2.setForeground(foregroundColor);
        choice2.setFont(noramlFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("choice2");
        choiceButtonPanel.add(choice2);
                //Choice 3
        choice3 = new JButton("3");
        choice3.setBackground(backgroundColor);
        choice3.setForeground(foregroundColor);
        choice3.setFont(noramlFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("choice3");
        choiceButtonPanel.add(choice3);
                //Choice 4
        choice4 = new JButton("4");
        choice4.setBackground(backgroundColor);
        choice4.setForeground(foregroundColor);
        choice4.setFont(noramlFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("choice4");
        choiceButtonPanel.add(choice4);
            //Player Panel
        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,900,50);
        playerPanel.setBackground(backgroundColor);
        playerPanel.setLayout(new GridLayout(1,4));
        gameWindow.add(playerPanel);
            //Health label name
        healthLabel = new JLabel("Health: ");
        healthLabel.setFont(noramlFont);
        healthLabel.setForeground(foregroundColor);
        playerPanel.add(healthLabel);
            //Health Label number
        healthNumberLabel = new JLabel();
        healthNumberLabel.setFont(noramlFont);
        healthNumberLabel.setForeground(foregroundColor);
        playerPanel.add(healthNumberLabel);
            //Weapon Label name | "Current bug this label is gray and not white"
        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(noramlFont);
        weaponLabel.setForeground(foregroundColor);
        playerPanel.add(weaponLabel);
            //Weapon Label name type
        weaponNameLabel = new JLabel();
        weaponNameLabel.setFont(noramlFont);
        weaponNameLabel.setForeground(foregroundColor);
        playerPanel.add(weaponNameLabel);

    }

    /**
     * choose a theme via a number starting with 0
     * @param n
     */
    public void playTheme (int n) {
        sound.setFile(n);
        sound.play();
        sound.loop();
    }
    public void stopSound(int n){
        sound.setFile(n);
        sound.stop();
    }
    public void playSound(int n){
        sound.setFile(n);
        sound.play();
    }


}
