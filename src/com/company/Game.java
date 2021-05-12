
package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class Game {


    ChoiceHandler cHandler = new ChoiceHandler();
    GUI gui = new GUI();
    VisibilityHandler vm = new VisibilityHandler(gui);
    Story story = new Story(this, gui, vm);

    String position1, position2, position3;


   public static void main(String[] args) {

        new Game();
    }




    public Game(){

        try {
            gui.createGUI(cHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
        story.defaultSetup();
        vm.showTitleScreen();
    }




    public class ChoiceHandler implements ActionListener{

        public void actionPerformed(ActionEvent event){

            String playerChoice = event.getActionCommand();

            switch(playerChoice){
                case "start": vm.titleScreenToMain1(); story.mainStoryIntro(); break;
                case "ch1": story.selectPosition(position1);  break;
                case "ch2": story.selectPosition(position2);  break;
                case "ch3": story.selectPosition(position3); break;
            }
        }
    }


}

