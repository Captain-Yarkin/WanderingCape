package GUI;

import Music.Sound;

import javax.swing.*;
import java.awt.*;


public class Titlescreen {

    JFrame gameWindow;
    Container con;
    String title = "Wandering Cape";
    JPanel titleNamePanel, startButtonPanel;
    JLabel titelNameLabel;
    JButton startButton;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font noramlFont = new Font("Times New Roman", Font.PLAIN, 30);
    Color backgroundColor = Color.BLACK;
    Sound sound = new Sound();

    public void screen() {
        int height = 800;
        int width = 600;

        gameWindow = new JFrame();
        gameWindow.setSize(height, width);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.getContentPane().setBackground(backgroundColor);
        gameWindow.setLayout(null);
        gameWindow.setVisible(true);
        gameWindow.setTitle(title);
        con = gameWindow.getContentPane();

        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100,150,600,100);
        titleNamePanel.setBackground(backgroundColor);
        titelNameLabel = new JLabel(title.toUpperCase());
        titelNameLabel.setForeground(Color.WHITE);
        titelNameLabel.setFont(titleFont);

        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(300,400, 200, 100);
        startButtonPanel.setBackground(backgroundColor);

        startButton = new JButton("START GAME");
        startButton.setBackground(Color.BLACK);
        startButton.setForeground(Color.WHITE);
        startButton.setFont(noramlFont);


        titleNamePanel.add(titelNameLabel);
        startButtonPanel.add(startButton);

        con.add(titleNamePanel);
        con.add(startButtonPanel);
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
