package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class GUI {

    // Fonts
    Font titleFont = new Font("Impact", Font.PLAIN, 70 );
    Font startFont = new Font("Impact", Font.PLAIN, 30);
    Font mainText = new Font("Times New Roman", Font.PLAIN, 40);
    Font choiceText = new Font("Times New Roman", Font.PLAIN, 50);


    // Frame
    JFrame frame = new JFrame();

    // Panels
    JPanel panel = new JPanel();
    JPanel startButtonPanel = new JPanel();
    JPanel choiceButton = new JPanel();
    JPanel playerPanel = new JPanel();

    // Label
    JLabel label = new JLabel();
    JLabel startLabel = new JLabel();
    JLabel hpLabel = new JLabel();
    JLabel hpLabelNum = new JLabel();
    JLabel potionCapLabel = new JLabel();
    JLabel potionCapNum = new JLabel();

    // Button
    JButton startButton = new JButton();
    JButton choice1 = new JButton();
    JButton choice2 = new JButton();

    // Text
    JTextArea mainTextPlace = new JTextArea();

    // Container
    Container container;

    // Handler
    TitleHandler titleScreenHandler = new TitleHandler();

    public GUI(){

        // Creating frame for GUI
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.gray);
        frame.setTitle("Adventure Quest");
        frame.setLayout(null);
        frame.setVisible(true);
        container = frame.getContentPane();

        // Set panel for Title
        panel.setBounds(100,100,600,150);
        panel.setBackground(Color.gray);
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        label = new JLabel("Adventure Quest");
        label.setForeground(Color.black);
        label.setFont(titleFont);

        // Set panel for start button
        startButtonPanel.setBounds(300,500,200,60);
        startButtonPanel.setBackground(Color.gray);

        // Create start button
        startButton = new JButton("Start Game");
        startButton.setBackground(Color.gray);
        startButton.setForeground(Color.black);
        startButton.setFont(startFont);
        //
        startButton.addActionListener(titleScreenHandler);
        panel.add(label);
        startButtonPanel.add(startButton);
        container.add(panel);
        container.add(startButtonPanel);

    }

    // Main game
    public void mainGameScreen(){

        // Setting title screen visibility to false
        panel.setVisible(false);
        startButtonPanel.setVisible(false);

        // Setting panel for main text
        JPanel mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100,100,600,250);
        mainTextPanel.setBackground(Color.darkGray);
        mainTextPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        container.add(mainTextPanel);

        // Creating main text
        mainTextPlace = new JTextArea("Welcome Brave Adventurer!\nYou wake up at a crossroad. Will you go left right?");
        mainTextPlace.setBounds(100,100,600,250);
        mainTextPlace.setBackground(Color.darkGray);
        mainTextPlace.setForeground(Color.black);
        //mainTextPlace.setBorder(BorderFactory.createLineBorder(Color.black));
        mainTextPlace.setFont(mainText);
        mainTextPlace.setLineWrap(true);
        mainTextPanel.add(mainTextPlace);

        // Setting panel for choice buttons
        choiceButton = new JPanel();
        choiceButton.setBounds(250,350,300,150);
        choiceButton.setBackground(Color.gray);
        choiceButton.setLayout(new GridLayout(2,1));
        container.add(choiceButton);

        // Creating choice buttons
        choice1 = new JButton("Left");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(choiceText);
        choiceButton.add(choice1);

        choice2 = new JButton("Continue");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(choiceText);
        choiceButton.add(choice2);

        playerPanel = new JPanel();
        playerPanel.setBounds(100,15,600,50);
        playerPanel.setBackground(Color.white);
        playerPanel.setLayout(new GridLayout(1,4));
        container.add(playerPanel);

        hpLabel = new JLabel("Health: ");
        hpLabel.setFont(mainText);
        hpLabel.setForeground(Color.black);
        playerPanel.add(hpLabel);

        hpLabelNum = new JLabel();
        hpLabelNum.setFont(mainText);
        hpLabelNum.setForeground(Color.black);
        playerPanel.add(hpLabelNum);

        potionCapLabel = new JLabel("Potions: ");
        potionCapLabel.setFont(mainText);
        playerPanel.add(potionCapLabel);

        potionCapNum = new JLabel();
        potionCapNum.setFont(mainText);
        potionCapNum.setForeground(Color.black);
        playerPanel.add(potionCapNum);

        //
    }

    // Handler
    public class TitleHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {

            mainGameScreen();
        }
    }

    public static class SoundEffects {

        public static void PlaySound(String filepath){



            try{

                File soundPath = new File(filepath);

                if(soundPath.exists()){
                    AudioInputStream audioInput = AudioSystem.getAudioInputStream(soundPath);
                    Clip clip = AudioSystem.getClip();
                    clip.open(audioInput);
                    clip.start();

                }
                else{

                    System.out.println("Cant find file");
                }
            }
            catch(Exception ex){

                ex.printStackTrace();
            }
        }

    }
}
