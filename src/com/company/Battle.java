package com.company;

import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
// class



public class Battle {

    GUI ui = new GUI();
    Enemy enemy = new Enemy("Skeleton", 5);

    boolean testBoolean = true;
    String battleChoice;
    Scanner scan = new Scanner(System.in);
    String fightingSound = "swordAttack.wav";
    String lightningSound = "specialAttack.wav";

//---------------------------------------------------- Battle sequence ----------------------------------------------------
/*
    // Initial battle sequence
    public void battle() {

        enemy = new Enemy("Skeleton", 5);

        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // Move to attack sequence
        game.position1 = "attack";
        game.position2 = "";
        game.position3 = "";

    }

    // Attack sequence
    public void attack() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length);
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();


        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // Move to enemy attack sequence
            game.position1 = "enemyAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0" );
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // Move to win sequence
            game.position1 = "winBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    // Enemy attack sequence
    public void enemyAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(enemy.getEnemyHealth() > 0){
            ui.choice1.setText("Attack");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // Move to attack sequence
            game.position1 = "attack";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // Move to lose sequence
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    // Win sequence
    public void winBattle(){
        ui.mainTextPlace.setText("You have slain the enemy!");

        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        game.position1 = "";
        game.position2 = "";
        game.position3 = "";
    }

    // Lose sequence
    public void loseBattle(){
        ui.mainTextPlace.setText("You are dead");

        ui.choice1.setText("To Title Screen");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        game.position1 = "toTitleScreen";
        game.position2 = "";
        game.position3 = "";
    }

    // Return to title screen after death
    public void toTitleScreen() {

        defaultSetup();
    }

 */
 // ----------------------------------------- Battle sequence end --------------------------------------------------------------


    public void encounter(Player player, Enemy monster) {
        testBoolean = true;
        // While loop for battle
        while (testBoolean) {
            System.out.println("------------------------------");
            System.out.println("Press 'enter' to attack:");
            System.out.println("Press '1' for Potion:");

            // Variable for player choice in battle
            battleChoice = scan.nextLine();

            switch (battleChoice) {
                case "":
                    System.out.println("-----------***-----Player turn-----***-----------");

                    player.playerAttack = player.rand.nextInt(player.attackValues.length);
                    System.out.println("You attack for: " + player.playerAttack);

                    // Re-assigning enemy health after player attack
                    monster.enemyHealth = monster.enemyHealth - player.getPlayerAttack();
                    System.out.println("Enemy " + monster.getType() + " health is: " + monster.getEnemyHealth());

                    SoundEffects battleClip = new SoundEffects();
                    battleClip.PlaySound(fightingSound);

                    if (monster.getEnemyHealth() <= 0) {
                        System.out.println("The " + monster.type+ " is dead.");
                        testBoolean = false;
                        break;
                    }

                    System.out.println("-----------***-----" + monster.type + "'s turn-----***-----------");

                    // Random numb from attack values array assigned to variable
                    monster.enemyAttack = monster.rand.nextInt(monster.attackValues.length);
                    System.out.println(monster.type + " attacks for: " + monster.enemyAttack);

                    // Re-assigning player health after enemy attack
                    player.playerHealth = player.playerHealth - monster.getEnemyAttack();
                    System.out.println("Your health health is: " + player.getPlayerHealth());


                    if (player.getPlayerHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("You are dead.");
                        System.exit(0);

                    }
                    break;

                case "1":
                    player.usePotion();
            }
        }
    }


    public void encounterAlwaysSpecial(Player player, Enemy monster) {
        testBoolean = true;

        // While loop for battle
        while (testBoolean) {
            System.out.println("------------------------------");
            System.out.println("Press 'enter' to attack:");
            System.out.println("Press '1' for potion:");
            System.out.println("Press '2' for special X(Guaranteed to work in this battle ONLY)");

            // Variable for player choice in battle
            battleChoice = scan.nextLine();

            switch (battleChoice) {
                case "":
                    System.out.println("-----------***-----Player turn-----***-----------");
                    player.playerAttack = player.rand.nextInt(player.attackValues.length);
                    System.out.println("You attack for: " + player.getPlayerAttack());
                    // Re-assigning enemy health after player attack
                    monster.enemyHealth = monster.enemyHealth - player.getPlayerAttack();
                    System.out.println("Enemy " + monster.type + " health is: " + monster.getEnemyHealth());

                    SoundEffects battleClip = new SoundEffects();
                    battleClip.PlaySound(fightingSound);

                    if (monster.getEnemyHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("The " + monster.type + "'s are dead");
                        testBoolean = false;
                        break;

                    }

                    System.out.println("-----------***-----" + monster.type + "'s turn-----***-----------");
                    monster.enemyAttack = monster.rand.nextInt(monster.attackValues.length);
                    System.out.println(monster.type + " attacks for: " + monster.getEnemyAttack());
                    // Re-assigning player health after enemy attack
                    player.playerHealth = player.playerHealth - monster.getEnemyAttack();
                    System.out.println("Your health health is: " + player.getPlayerHealth());


                    //IF statement within loop if health drops below 0
                    // Condition
                    if (player.getPlayerHealth()<= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("You are dead.");
                        System.exit(0);

                    }
                    break;

                case "1":
                    player.usePotion();
                    break;

                case "2":

                    if (player.specialAttack == 0) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("Press enter to continue:");
                        scan.nextLine();

                        testBoolean = false;
                        break;
                    }

                    else if (player.specialAttack == 1) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
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
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        /*  This is the fail for special attack. Left it in in case i need to reference
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("You are obliterated.");
                        System.exit(0);
                        */
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("Press enter to continue:");
                        scan.nextLine();

                        testBoolean = false;
                        break;

                    }
            }
        }
    }

    public void encounterNormaL(Player player, Enemy monster) throws InterruptedException {
        testBoolean = true;
        // While loop for battle
        while (testBoolean) {
            System.out.println("------------------------------");
            System.out.println("Press 'enter' to attack:");
            System.out.println("Press '1' for potion:");
            System.out.println("Press '2' for special X");

            // Variable for player choice in battle
            battleChoice = scan.nextLine();

            switch (battleChoice) {
                case "":
                    System.out.println("-----------***-----Player turn-----***-----------");
                    player.playerAttack = player.rand.nextInt(player.attackValues.length);
                    System.out.println("You attack for: " + player.getPlayerAttack());
                    // Re-assigning enemy health after player attack
                    monster.enemyHealth = monster.enemyHealth - player.getPlayerAttack();
                    System.out.println("Enemy " + monster.type + " health is: " + monster.getEnemyHealth());

                    SoundEffects battleClip = new SoundEffects();
                    battleClip.PlaySound(fightingSound);

                    if (monster.getEnemyHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("The " + monster.type + " is dead");
                        testBoolean = false;
                        break;

                    }

                    System.out.println("-----------***-----" + monster.type + "'s turn-----***-----------");
                    monster.enemyAttack = monster.rand.nextInt(monster.attackValues.length);
                    System.out.println(monster.type + " attacks for: " + monster.getEnemyAttack());
                    // Re-assigning player health after enemy attack
                    player.playerHealth = player.playerHealth - monster.getEnemyAttack();
                    System.out.println("Your health health is: " + player.getPlayerHealth());

                    //IF statement within loop if health drops below 0
                    // Condition
                    if (player.getPlayerHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("You are dead.");
                        System.exit(0);
                        break;

                    }
                    break;

                case "1":
                    // Potion use in battle
                    player.usePotion();
                    break;


                case "2":
                    // Special attack
                    if (player.specialAttack == 0) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("Press enter to continue:");
                        scan.nextLine();

                        testBoolean = false;
                        break;
                    }

                    else if (player.specialAttack == 1) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
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
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        //This is the fail for special attack. Left it in in case i need to reference
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("You are obliterated.");
                        System.exit(0);


                        testBoolean = false;
                        break;

                    }


                default:
            }

        }
    }

    public void upgradedAttackBattle(Player player, Enemy monster) throws InterruptedException {
        testBoolean = true;
        // While loop for battle
        while (testBoolean) {
            System.out.println("------------------------------");
            System.out.println("Press 'enter' to attack:");
            System.out.println("Press '1' for potion:");
            System.out.println("Press '2' for special X");

            // Variable for player choice in battle
            battleChoice = scan.nextLine();

            switch (battleChoice) {
                case "":
                    System.out.println("-----------***-----Player turn-----***-----------");
                    player.playerAttack = player.rand.nextInt(player.attackValues.length + 1);
                    System.out.println("You attack for: " + player.getPlayerAttack());
                    // Re-assigning enemy health after player attack
                    monster.enemyHealth = monster.enemyHealth - player.getPlayerAttack();
                    System.out.println("Enemy " + monster.type + " health is: " + monster.getEnemyHealth());

                    SoundEffects battleClip = new SoundEffects();
                    battleClip.PlaySound(fightingSound);

                    if (monster.getEnemyHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("The " + monster.type + " is dead");
                        testBoolean = false;
                        break;

                    }

                    System.out.println("-----------***-----" + monster.type + "'s turn-----***-----------");
                    monster.enemyAttack = monster.rand.nextInt(monster.attackValues.length);
                    System.out.println(monster.type + " attacks for: " + monster.getEnemyAttack());
                    // Re-assigning player health after enemy attack
                    player.playerHealth = player.playerHealth - monster.getEnemyAttack();
                    System.out.println("Your health health is: " + player.getPlayerHealth());

                    //IF statement within loop if health drops below 0
                    // Condition
                    if (player.getPlayerHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("You are dead.");
                        System.exit(0);
                        break;

                    }
                    break;

                case "1":
                    // Potion use in battle
                    player.usePotion();
                    break;


                case "2":
                    // Special attack
                    if (player.specialAttack == 0) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("Press enter to continue:");
                        scan.nextLine();

                        testBoolean = false;
                        break;
                    }

                    else if (player.specialAttack == 1) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
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
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        //This is the fail for special attack. Left it in in case i need to reference
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("You are obliterated.");
                        System.exit(0);


                        testBoolean = false;
                        break;

                    }


                default:
            }

        }
    }

    public void pendantSpecialEncounter(Player player, Enemy monster) throws InterruptedException {
        testBoolean = true;
        // While loop for battle
        while (testBoolean) {
            System.out.println("------------------------------");
            System.out.println("Press 'enter' to attack:");
            System.out.println("Press '1' for potion:");
            System.out.println("Press '2' for special X");

            // Variable for player choice in battle
            battleChoice = scan.nextLine();

            switch (battleChoice) {
                case "":
                    System.out.println("-----------***-----Player turn-----***-----------");
                    player.playerAttack = player.rand.nextInt(player.attackValues.length);
                    System.out.println("You attack for: " + player.getPlayerAttack());
                    // Re-assigning enemy health after player attack
                    monster.enemyHealth = monster.enemyHealth - player.getPlayerAttack();
                    System.out.println("Enemy " + monster.type + " health is: " + monster.getEnemyHealth());

                    SoundEffects battleClip = new SoundEffects();
                    battleClip.PlaySound(fightingSound);

                    if (monster.getEnemyHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("The " + monster.type + " is dead");
                        testBoolean = false;
                        break;

                    }

                    System.out.println("-----------***-----" + monster.type + "'s turn-----***-----------");
                    monster.enemyAttack = monster.rand.nextInt(monster.attackValues.length);
                    System.out.println(monster.type + " attacks for: " + monster.getEnemyAttack());
                    // Re-assigning player health after enemy attack
                    player.playerHealth = player.playerHealth - monster.getEnemyAttack();
                    System.out.println("Your health health is: " + player.getPlayerHealth());

                    //IF statement within loop if health drops below 0
                    // Condition
                    if (player.getPlayerHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("You are dead.");
                        System.exit(0);
                        break;

                    }
                    break;

                case "1":
                    // Potion use in battle
                    player.usePotion();
                    break;


                case "2":
                    // Special attack
                    if (player.specialAttack == 0) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("You restore 5 health:");
                        player.playerHealth += player.playerHealth + 5;
                        System.out.println("Your health is: " + player.getPlayerHealth());
                        System.out.println("Press enter to continue:");
                        scan.nextLine();

                        testBoolean = false;
                        break;
                    }

                    else if (player.specialAttack == 1) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("You restore 5 health:");
                        player.playerHealth += player.playerHealth + 5;
                        System.out.println("Your health is: " + player.getPlayerHealth());
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
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        //This is the fail for special attack. Left it in in case i need to reference
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("You are obliterated.");
                        System.exit(0);


                        testBoolean = false;
                        break;

                    }


                default:
            }

        }
    }

    public void attackAndSpecialEncounter(Player player, Enemy monster) throws InterruptedException {
        testBoolean = true;
        // While loop for battle
        while (testBoolean) {
            System.out.println("------------------------------");
            System.out.println("Press 'enter' to attack:");
            System.out.println("Press '1' for potion:");
            System.out.println("Press '2' for special X");

            // Variable for player choice in battle
            battleChoice = scan.nextLine();

            switch (battleChoice) {
                case "":
                    System.out.println("-----------***-----Player turn-----***-----------");
                    player.playerAttack = player.rand.nextInt(player.attackValues.length + 1);
                    System.out.println("You attack for: " + player.getPlayerAttack());
                    // Re-assigning enemy health after player attack
                    monster.enemyHealth = monster.enemyHealth - player.getPlayerAttack();
                    System.out.println("Enemy " + monster.type + " health is: " + monster.getEnemyHealth());

                    SoundEffects battleClip = new SoundEffects();
                    battleClip.PlaySound(fightingSound);

                    if (monster.getEnemyHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("The " + monster.type + " is dead");
                        testBoolean = false;
                        break;

                    }

                    System.out.println("-----------***-----" + monster.type + "'s turn-----***-----------");
                    monster.enemyAttack = monster.rand.nextInt(monster.attackValues.length);
                    System.out.println(monster.type + " attacks for: " + monster.getEnemyAttack());
                    // Re-assigning player health after enemy attack
                    player.playerHealth = player.playerHealth - monster.getEnemyAttack();
                    System.out.println("Your health health is: " + player.getPlayerHealth());

                    //IF statement within loop if health drops below 0
                    // Condition
                    if (player.getPlayerHealth() <= 0) {
                        System.out.println("---------------------------------------------\n");
                        System.out.println("You are dead.");
                        System.exit(0);
                        break;

                    }
                    break;

                case "1":
                    // Potion use in battle
                    player.usePotion();
                    break;


                case "2":
                    // Special attack
                    if (player.specialAttack == 0) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("You restore 5 health:");
                        player.playerHealth += player.playerHealth + 5;
                        System.out.println("Your health is: " + player.getPlayerHealth());
                        System.out.println("Press enter to continue:");
                        scan.nextLine();

                        testBoolean = false;
                        break;
                    }

                    else if (player.specialAttack == 1) {
                        System.out.println("---------------Special Attack------------------");
                        System.out.println("You throw your sword up into the air!");
                        System.out.println("The sky starts to light up and growl");
                        System.out.println("Press enter to smite your enemy!");
                        scan.nextLine();
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("The enemy has been obliterated.");
                        System.out.println("You restore 5 health:");
                        player.playerHealth += player.playerHealth + 5;
                        System.out.println("Your health is: " + player.getPlayerHealth());
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
                        SoundEffects specialClip = new SoundEffects();
                        specialClip.PlaySound(lightningSound);
                        //This is the fail for special attack. Left it in in case i need to reference
                        System.out.println("You slam your sword down to the ground, followed by a crashing of lightning and thunder!");
                        System.out.println("You are obliterated.");
                        System.exit(0);


                        testBoolean = false;
                        break;

                    }


                default:
            }

        }
    }

}


