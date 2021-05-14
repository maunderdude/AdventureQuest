package com.company;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class GUI {


    // Fonts
    Font titleFont = new Font("Impact", Font.PLAIN, 70);
    Font startFont = new Font("Impact", Font.PLAIN, 30);
    Font mainText = new Font("Times New Roman", Font.PLAIN, 30);
    Font choiceText = new Font("Times New Roman", Font.PLAIN, 50);


    // Frame
    JFrame frame = new JFrame();

    // Panels
    JPanel panel = new JPanel();
    JPanel startButtonPanel = new JPanel();
    JPanel choiceButton = new JPanel();
    JPanel playerPanel = new JPanel();
    JPanel mainTextPanel = new JPanel();

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
    JButton choice3 = new JButton();

    private Font buttonFont, mainTextFont;

    // Text
    JTextArea mainTextPlace = new JTextArea();

    // Container
    Container container;

    Player player = new Player();

    // --------------------------------------------------------------------------------------------

    public void createGUI(Game.ChoiceHandler cHandler) throws IOException {


        // Creating frame for GUI
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.gray);
        frame.setTitle("Adventure Quest");
        frame.setLayout(null);
        frame.setVisible(true);
        container = frame.getContentPane();
        frame.setResizable(false);

        // ------------------ Image within JPanel (Not working correctly) ----------------------
        // frame.getContentPane().add(new JPanelWithBackground("sample.jpeg"));

        // Set panel for Title
        panel.setBounds(100, 100, 600, 150);
        panel.setBackground(Color.gray);
        panel.setBorder(BorderFactory.createRaisedBevelBorder());
        label = new JLabel("Adventure Quest");
        label.setForeground(Color.black);
        label.setFont(titleFont);

        // Set panel for start button
        startButtonPanel.setBounds(300, 500, 200, 60);
        startButtonPanel.setBackground(Color.gray);

        // Create start button
        startButton = new JButton("Start Game");
        startButton.setBackground(Color.gray);
        startButton.setForeground(Color.black);
        startButton.setFont(startFont);
        startButton.setFocusPainted(false);
        // Action Listener
        startButton.addActionListener(cHandler);
        startButton.setActionCommand("start");
        panel.add(label);
        startButtonPanel.add(startButton);
        container.add(panel);
        container.add(startButtonPanel);


        // Setting player HP and potion labels
        Border blackLine = BorderFactory.createLineBorder(Color.black); //BorderLine
        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.white);
        playerPanel.setLayout(new GridLayout(1, 4));
        container.add(playerPanel);

        //Importing Image Icons
        ImageIcon heartIcon = new ImageIcon("heartImage.jpg"); // load the image to a imageIcon
        Image image = heartIcon.getImage(); // transform it
        Image newing = image.getScaledInstance(18, 18, Image.SCALE_SMOOTH); // scale it the smooth way
        heartIcon = new ImageIcon(newing); // transform it back

        ImageIcon potionIcon = new ImageIcon("potionImage.jpg"); // load the image to a imageIcon
        Image potionImage = potionIcon.getImage(); // transform it
        Image newing2 = potionImage.getScaledInstance(20, 20, Image.SCALE_SMOOTH); // scale it the smooth way
        potionIcon = new ImageIcon(newing2); // transform it back

        /*
        // Sword icon not used
        ImageIcon swordIcon = new ImageIcon("swordGame.jpg");
        Image image1 = swordIcon.getImage();
        Image newing1 = image1.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        swordIcon = new ImageIcon(newing1);
         */

        // HP label
        hpLabel = new JLabel("Health: ");
        hpLabel.setIcon(heartIcon);
        hpLabel.setFont(mainText);
        hpLabel.setForeground(Color.black);
        playerPanel.add(hpLabel);
        hpLabelNum = new JLabel();
        hpLabelNum.setFont(mainText);
        hpLabelNum.setForeground(Color.black);
        playerPanel.add(hpLabelNum);

        // Potion label
        potionCapLabel = new JLabel("Potions: ");
        potionCapLabel.setIcon(potionIcon);
        potionCapLabel.setFont(mainText);
        playerPanel.add(potionCapLabel);
        potionCapNum = new JLabel();
        potionCapNum.setFont(mainText);
        potionCapNum.setForeground(Color.black);
        playerPanel.add(potionCapNum);


        // Setting panel for main text
        mainTextFont = new Font("Arial", Font.ITALIC, 20);
        mainTextPanel.setBounds(100, 100, 600, 375);
        mainTextPanel.setBackground(Color.darkGray);
        mainTextPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        container.add(mainTextPanel);
        mainTextPlace = new JTextArea("This is main text area");
        mainTextPlace.setBounds(100, 100, 600, 475);
        mainTextPlace.setBackground(Color.darkGray);
        mainTextPlace.setForeground(Color.black);
        //mainTextPlace.setBorder(BorderFactory.createLineBorder(Color.black));
        mainTextPlace.setFont(mainTextFont);
        mainTextPlace.setLineWrap(true);
        mainTextPlace.setWrapStyleWord(true);
        mainTextPanel.add(mainTextPlace);

        // Setting panel for choice buttons
        buttonFont = new Font("Arial", Font.ITALIC, 30);
        choiceButton = new JPanel();
        choiceButton.setBounds(250, 475, 300, 150);
        choiceButton.setBackground(Color.gray);
        choiceButton.setLayout(new GridLayout(3, 1));
        container.add(choiceButton);

        // Creating choice buttons
        choice1 = new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(choiceText);
        choiceButton.add(choice1);
        choice1.setFont(buttonFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(cHandler);
        choice1.setActionCommand("ch1");


        choice2 = new JButton("choice2");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(choiceText);
        choiceButton.add(choice2);
        choice2.setFont(buttonFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(cHandler);
        choice2.setActionCommand("ch2");
        ;


        choice3 = new JButton("choice3");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(choiceText);
        choiceButton.add(choice3);
        choice3.setFont(buttonFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(cHandler);
        choice3.setActionCommand("ch3");


    }
}













