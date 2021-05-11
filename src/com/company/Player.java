package com.company;

import java.util.Random;
import java.util.Scanner;

//class
public class Player {

    // Variables
    String playerName;
    int playerHealth;
    int playerAttack;
    int potionCapacity;
    int necklaceOfLife = 0;
    int attackValues[] = {0, 1, 2, 3, 4, 5};
    int specialAttackValues[] = {0, 1, 2};
    int potion = 5;
    boolean upgradeAttack = false;
    boolean upgradeSpecial = false;

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();

    // Random value generators
    int specialAttack =  rand.nextInt(specialAttackValues.length);
    //int potionAmount = rand.nextInt(potion.length);


    public void greetPlayer(String playerName) {
        System.out.println("Welcome " + playerName + "!");

    }

    /*
    // Sequential potion use and special attack use (Not being used)

    public void usePotion(){
        boolean testBoolean = true;

        if(potionCapacity > 0) {

            playerHealth = playerHealth + potion;
            // Re-assigning potion capacity after use
            potionCapacity = potionCapacity - 1;
            System.out.println("You use a potion.");
            System.out.println("Your health is " + playerHealth);
            System.out.println("You have " + potionCapacity + ".");
        }
        else{
            System.out.println("You have 0 potions");
        }
    }



    public void useSpecialAttack() {
        boolean testBoolean = true;
        while (testBoolean) {
            if (specialAttack == 0) {
                System.out.println("---------------Special Attack------------------");
                System.out.println("You throw your sword up into the air!");
                System.out.println("The sky starts to light up and growl");
                System.out.println("Press enter to smite your enemy!");
                scan.nextLine();
                System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                System.out.println("The enemy has been obliterated.");
                System.out.println("Press enter to continue:");
                scan.nextLine();
                testBoolean = false;
                break;

            } else if (specialAttack == 1) {
                System.out.println("---------------Special Attack------------------");
                System.out.println("You throw your sword up into the air!");
                System.out.println("The sky starts to light up and growl");
                System.out.println("Press enter to smite your enemy!");
                scan.nextLine();
                System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                System.out.println("The enemy has been obliterated.");
                System.out.println("Press enter to continue:");
                scan.nextLine();

                testBoolean = false;
                break;

            }
            else {
                System.out.println("---------------Special Attack------------------");
                System.out.println("You throw your sword up into the air!");
                System.out.println("The sky starts to light up and growl");
                System.out.println("Press enter to smite your enemy!");
                scan.nextLine();
                //This is the fail for special attack. Left it in in case i need to reference
                System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                System.out.println("You are obliterated.");
                System.exit(0);

                testBoolean = false;

            }
            break;
        }

    }

*/




    ///////////////// Getters and setters


    public String getPlayerName() {
        return playerName; }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public int setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
        return playerHealth;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }

    public int getPotionCapacity() {
        System.out.println("You have " + potionCapacity + " potions.");;
        return 0;
    }

    public int setPotionCapacity(int potionCapacity) {
        this.potionCapacity = potionCapacity;
        return potionCapacity;
    }

    public int getPotion() {
        return potion;
    }

    public void setPotion(int potion) {
        this.potion = potion;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public void setSpecialAttack(int specialAttack) {
        this.specialAttack = specialAttack;
    }
}

