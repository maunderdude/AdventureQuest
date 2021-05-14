package com.company;

public class VisibilityHandler {

    GUI gui;

    public VisibilityHandler(GUI userInterface) {

        gui = userInterface;

    }

    public void showTitleScreen() {
        // Show title screen
        gui.panel.setVisible(true);
        gui.startButtonPanel.setVisible(true);

        // Hide game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButton.setVisible(false);
        gui.playerPanel.setVisible(false);

    }

    public void titleScreenToMain1() {

        // Hide title screen
        gui.panel.setVisible(false);
        gui.startButtonPanel.setVisible(false);

        // Show game screen
        gui.mainTextPanel.setVisible(true);
        gui.choiceButton.setVisible(true);
        gui.playerPanel.setVisible(true);
    }


}
