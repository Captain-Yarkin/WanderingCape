package GUI;

import GUI.UI.ChoiceControls;
import Music.Sound;
import Player.Player;

import javax.swing.*;
import java.awt.*;

public class UIscreen {

    JFrame gameWindow;
    public JPanel titleNamePanel, startButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel, adventureNamePanel,chooseAdvPanel;
    public JLabel titleNameLabel, healthLabel, healthNumberLabel, weaponLabel, weaponNameLabel, armorLabel, armorNameLabel, adventureNameLabel;
    public JButton startButton, choice1, choice2, choice3, choice4, adventure1Button, adventure2Button;
    public JTextArea mainTextArea;
    String title = "Wandering Cape";
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font adventureFont = new Font ("Times New Roman", Font.PLAIN, 90);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 28);
    Color backgroundColor = Color.BLACK;
    Color foregroundColor = Color.WHITE;
    Sound sound = new Sound();


    /**
     * This creates the user interface for how the screen parameters are and how the user sees the game.
     * @param choiceHandler takes in the choice of a player after button is pressed.
     */
    //This build currently does not support fullscreen
    public void createScreen(ChoiceControls choiceHandler) {
        int height = 800;
        int width = 1100;

        // GAME WINDOW
        gameWindow = new JFrame();
        gameWindow.setSize(width, height);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(backgroundColor);
        gameWindow.setLayout(null);
        gameWindow.setTitle(title);
        gameWindow.setVisible(true);
        gameWindow.setResizable(false);

        // TITLE SCREEN
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(250,250,600,100);
        titleNamePanel.setBackground(backgroundColor);
        titleNameLabel = new JLabel(title.toUpperCase());
        titleNameLabel.setForeground(foregroundColor);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
            //Start button panel and button
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(425,500, 250, 150);
        startButtonPanel.setBackground(backgroundColor);
        startButton = new JButton("START GAME");
        startButton.setBackground(backgroundColor);
        startButton.setForeground(foregroundColor);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");
        startButtonPanel.add(startButton);

        gameWindow.add(titleNamePanel);
        gameWindow.add(startButtonPanel);

        //CHOOSE ADVENTURE
        adventureNamePanel = new JPanel();
        adventureNamePanel.setBounds(200,200,700,100);
        adventureNamePanel.setBackground(backgroundColor);
        adventureNameLabel = new JLabel("Adventures".toUpperCase());
        adventureNameLabel.setForeground(foregroundColor);
        adventureNameLabel.setFont(adventureFont);
        adventureNamePanel.add(adventureNameLabel);
        gameWindow.add(adventureNamePanel);
            //Choose buttons
        chooseAdvPanel = new JPanel();
        chooseAdvPanel.setBounds(350,400,400,200);
        chooseAdvPanel.setBackground(Color.BLUE);
        chooseAdvPanel.setLayout(new GridLayout(2,1));
            //Choose "Adventure 1" Demo adventure
        adventure1Button = new JButton("What happened yesterday...");
        adventure1Button.setBackground(backgroundColor);
        adventure1Button.setForeground(foregroundColor);
        adventure1Button.setFont(normalFont);
        adventure1Button.setFocusPainted(false);
        adventure1Button.addActionListener(choiceHandler);
        adventure1Button.setActionCommand("adventure1");
        chooseAdvPanel.add(adventure1Button);
            //Choose "Adventure 2" First Adventure
        adventure2Button = new JButton("Adventure: Pirate Haven");
        adventure2Button.setBackground(backgroundColor);
        adventure2Button.setForeground(foregroundColor);
        adventure2Button.setFont(normalFont);
        adventure2Button.setFocusPainted(false);
        adventure2Button.addActionListener(choiceHandler);
        adventure2Button.setActionCommand("adventure2");
        chooseAdvPanel.add(adventure2Button);


        gameWindow.add(chooseAdvPanel);




        //CHOICE WINDOW

            //Where the text appears to describe the scene
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(150,100,800,350);
        mainTextPanel.setBackground(backgroundColor);
        gameWindow.add(mainTextPanel);

        mainTextArea = new JTextArea("Testing the main text Area. Are we good houston?");
        mainTextArea.setBounds(100,100,800,350);
        mainTextArea.setBackground(backgroundColor);
        mainTextArea.setForeground(foregroundColor);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

            //Choice box with buttons
        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(400,500,300,150);
        choiceButtonPanel.setBackground(backgroundColor);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        gameWindow.add(choiceButtonPanel);

            //Choice box buttons
                //Choice 1
        choice1 = new JButton("1");
        choice1.setBackground(backgroundColor);
        choice1.setForeground(foregroundColor);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(choiceHandler);
        choice1.setActionCommand("choice1");
        choiceButtonPanel.add(choice1);
                //Choice 2
        choice2 = new JButton("2");
        choice2.setBackground(backgroundColor);
        choice2.setForeground(foregroundColor);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(choiceHandler);
        choice2.setActionCommand("choice2");
        choiceButtonPanel.add(choice2);
                //Choice 3
        choice3 = new JButton("3");
        choice3.setBackground(backgroundColor);
        choice3.setForeground(foregroundColor);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(choiceHandler);
        choice3.setActionCommand("choice3");
        choiceButtonPanel.add(choice3);
                //Choice 4
        choice4 = new JButton("4");
        choice4.setBackground(backgroundColor);
        choice4.setForeground(foregroundColor);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(choiceHandler);
        choice4.setActionCommand("choice4");
        choiceButtonPanel.add(choice4);
            //Player Panel
        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,900,50);
        playerPanel.setBackground(backgroundColor);
        playerPanel.setLayout(new GridLayout(1,6));
        gameWindow.add(playerPanel);
            //Health label name
        healthLabel = new JLabel("Health: ");
        healthLabel.setFont(normalFont);
        healthLabel.setForeground(foregroundColor);
        playerPanel.add(healthLabel);
            //Health Label number
        healthNumberLabel = new JLabel();
        healthNumberLabel.setFont(normalFont);
        healthNumberLabel.setForeground(foregroundColor);
        playerPanel.add(healthNumberLabel);
            //Weapon Label name
        weaponLabel = new JLabel("Weapon: ");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(foregroundColor);
        playerPanel.add(weaponLabel);
            //Weapon Label name type
        weaponNameLabel = new JLabel();
        weaponNameLabel.setFont(normalFont);
        weaponNameLabel.setForeground(foregroundColor);
        playerPanel.add(weaponNameLabel);
            //Armor Label name
        armorLabel = new JLabel("Armor: ");
        armorLabel.setFont(normalFont);
        armorLabel.setForeground(foregroundColor);
        playerPanel.add(armorLabel);
            //Armor label name type
        armorNameLabel = new JLabel();
        armorNameLabel.setFont(normalFont);
        armorNameLabel.setForeground(foregroundColor);
        playerPanel.add(armorNameLabel);

    }

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
