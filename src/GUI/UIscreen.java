package GUI;

import GUI.UI.ChoiceControls;
import GUI.UI.UIAdventureButton;
import GUI.UI.UIButtonChoice;
import GUI.UI.UIPlayerLabel;
import Sound.Sound;

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
        chooseAdvPanel.setBackground(backgroundColor);
        chooseAdvPanel.setLayout(new GridLayout(3,1));
        //Choose "Adventure 1" Demo adventure

        adventure1Button = new UIAdventureButton("What happened yesterday?", backgroundColor, foregroundColor, normalFont, choiceHandler, "adventure1");
        adventure2Button = new UIAdventureButton("<Coming Soon>", backgroundColor, Color.RED, normalFont, choiceHandler, "adventure2");

        chooseAdvPanel.add(adventure1Button);
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
        choice1 = new UIButtonChoice(backgroundColor, foregroundColor, normalFont, choiceHandler, "choice1");
        choice2 = new UIButtonChoice(backgroundColor, foregroundColor, normalFont, choiceHandler, "choice2");
        choice3 = new UIButtonChoice(backgroundColor, foregroundColor, normalFont, choiceHandler, "choice3");
        choice4 = new UIButtonChoice(backgroundColor, foregroundColor, normalFont, choiceHandler, "choice4");

        choiceButtonPanel.add(choice1);
        choiceButtonPanel.add(choice2);
        choiceButtonPanel.add(choice3);
        choiceButtonPanel.add(choice4);

        //Player Panel
        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,900,50);
        playerPanel.setBackground(backgroundColor);
        playerPanel.setLayout(new GridLayout(1,6));
        gameWindow.add(playerPanel);

        healthLabel = new UIPlayerLabel("Health: ", foregroundColor, normalFont);
        healthNumberLabel = new UIPlayerLabel(foregroundColor, normalFont);
        weaponLabel = new UIPlayerLabel("Weapon: ", foregroundColor, normalFont);
        weaponNameLabel = new UIPlayerLabel(foregroundColor, normalFont);
        armorLabel = new UIPlayerLabel("Armor: ", foregroundColor, normalFont);
        armorNameLabel = new UIPlayerLabel(foregroundColor, normalFont);

        playerPanel.add(healthLabel);
        playerPanel.add(healthNumberLabel);
        playerPanel.add(weaponLabel);
        playerPanel.add(weaponNameLabel);
        playerPanel.add(armorLabel);
        playerPanel.add(armorNameLabel);
    }

    public void playTheme (int n) {
        sound.setFile(n);
        sound.play();
        sound.loop();
    }
    public void stopSound(){
        sound.stop();
    }
    public void playSound(int n){
        sound.setFile(n);
        sound.play();
    }


}
