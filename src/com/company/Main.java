package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {





       /*
        // Variables
        int trap = 5;
        boolean testBoolean = true;

        // Sound clips //////////////////////////////
        String screechSound = "screech.wav";
        String trapSound = "trap.wav";
        String screamingSound = "womanScream.wav";
        String potionSound = "sigh.wav";
        String zombieSound = "zombieNoise.wav";
        String skeletonSound = "skeletonSound.wav";
        String childSound = "childScream.wav";
        String doorSound = "doorCreek.wav";
        String windowSound = "windowShatter.wav";
        // Sound clips //////////////////////////////

        Scanner scan = new Scanner(System.in);
        Player player = new Player();


        // ---------------------------- Intro -----------------------------------//
        System.out.println("\nThis game was created by: Lee Maunder\nPlease enjoy!");
        System.out.println("--------------------------************--------------------------------");

        System.out.println("Welcome brave adventurer!");
        System.out.println("What is your name?:");
        System.out.println("--------------------------************--------------------------------");

        // Assigning player name
        player.playerName = scan.nextLine();

        ////////////////////////// Main story start \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("--------------------------************--------------------------------");

        // Greet player with capitalised name.
        player.greetPlayer(player.playerName.substring(0,1).toUpperCase() + player.playerName.substring(1).toLowerCase());

        System.out.println("This tale begins with you waking up at the side of a dirt road.\n");
        System.out.println("You have a sword at your hip.\n");

        System.out.println("Confused, you decide to walk on and follow the dirt road.");
        System.out.println("You come to a cross road. Will you go 'left', or 'right'?: ");
        System.out.println("--------------------------************--------------------------------");


        while (testBoolean) {

            // User input assigned to variable
            String choice = scan.nextLine().toLowerCase();

            // IF statement for left/right choice
            if (choice.equals("left")) {
                // Sound effect
                SoundEffects skeletonClip = new SoundEffects();
                skeletonClip.PlaySound(skeletonSound);

                System.out.println("You take the left path and run into a skeleton!");

                // Battle
                Battle skeletonBattle = new Battle();
                Enemy skeleton = new Enemy("Skeleton", 5);
                skeletonBattle.encounter(player, skeleton);
                // End battle

                System.out.println("--------------------------************--------------------------------");
                System.out.println("The skeleton drops a potion!");
                System.out.println("Press enter to collect potion:");
                scan.nextLine();

                // Sound effect
                SoundEffects potionClip = new SoundEffects();
                potionClip.PlaySound(potionSound);

                System.out.println("--------------------------************--------------------------------");

                // Adding potion to player potion capacity and returning amount
                player.potionCapacity = player.potionCapacity +1;
                player.getPotionCapacity();
                System.out.println("Your health is :" + player.playerHealth + "\n");
                break;

            }


            else if (choice.equals("right")) {
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You walk for quite some time until you the path narrows leading through a small patch of forest.");
                System.out.println("You carefully walk through but it's to overgrown to see much ahead of you.");
                System.out.println("Press enter to continue:");
                scan.nextLine();

                // Sound effect
                SoundEffects trapClip = new SoundEffects();
                trapClip.PlaySound(trapSound);

                System.out.println("--------------------------************--------------------------------");
                System.out.println("You fall into a hole and hurt yourself. You climb out and brush yourself off.\n");

                // Assigning player health for trap damage
                player.playerHealth = player.playerHealth - trap;
                System.out.println("You loose " + trap + " health\nYour health is: " + player.playerHealth + "\n");
                System.out.println("Press enter to continue:");
                scan.nextLine();
                break;


                // Validation check and output message
            } else {
                System.out.println("You must choose 'left' or 'right'.");

            }
        }

        ////////////////////////// Main story path continue \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("--------------------------************--------------------------------");
        System.out.println("You continue onwards until you come to a castle.");
        System.out.println("The front gate is wide open....");
        System.out.println("Will you enter through the front 'gate'? or Find another 'way'?:");

        // Re-assigning testBoolean to true ready for while loop
        testBoolean = true;

        // While loop for castle/inn choice
        while (testBoolean) {

            // Variable for user input
            String castleChoice = scan.nextLine();

            // If condition for player choice
            if (castleChoice.equals("gate")) {
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You enter through the gate.\n");
                System.out.println("You find a potion on the floor!");
                System.out.println("Press enter to collect potion:");
                scan.nextLine();

                // Sound effect
                SoundEffects potionClip = new SoundEffects();
                potionClip.PlaySound(potionSound);

                System.out.println("--------------------------************--------------------------------");

                // Adding potion to player potion capacity and returning amount
                player.potionCapacity = player.potionCapacity +1;
                player.getPotionCapacity();
                System.out.println("Your health is :" + player.playerHealth + "\n");
                System.out.println("--------------------------************--------------------------------");
                testBoolean = false;
                break;

            } else if (castleChoice.equals("way")) {
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You decide to find another way into the castle.");
                System.out.println("You find a ladder around the side leading through a window and climb up.");
                System.out.println("Press enter to climb through:");
                scan.nextLine();

                // Sound effect
                SoundEffects trapClip = new SoundEffects();
                trapClip.PlaySound(trapSound);

                System.out.println("As you climb down, the wooden floor gives way beneath you and you fall below into the keep!\n");
                System.out.println("You take " + trap + " damage.");
                System.out.println("press enter to pick yourself up:");
                System.out.println("You just so happen to land on a potion!");
                System.out.println("Press enter to collect potion:");
                scan.nextLine();
                System.out.println("Potion added to your inventory");

                // Sound effect
                SoundEffects potionClip = new SoundEffects();
                potionClip.PlaySound(potionSound);

                // Adding potion and returning amount
                player.potionCapacity = player.potionCapacity +1;
                player.getPotionCapacity();

                // Re-assigning player health due to trap damage
                player.playerHealth = player.playerHealth - trap;
                // Checking if player died from trap
                if (player.playerHealth <= 0) {
                    System.exit(0);
                } else {
                    System.out.println("Your health is :" + player.playerHealth + "\n");
                    System.out.println("Press enter to continue:");
                    scan.nextLine();
                    testBoolean = false;
                    break;

                }
                // Validation check and output to user before looping back to input choice
            } else {
                System.out.println("You must choose 'gate' or 'way':");
            }
        }

        ////////////////////////// Main story path continue \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        System.out.println("The keep of the castle is empty.");
        System.out.println("You decide to look around to see if anyone is here.");
        System.out.println("Will you go into the 'castle' or into the local 'inn'?");

        // Re-assigning testBoolean to true ready for while loop
        testBoolean = true;

        // While loop for choice
        while (testBoolean) {
            // Variable for use choice of looking around castle or inn
            String lookAround = scan.nextLine();

            // If statement for player choice
            if (lookAround.equals("castle")) {
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You head into the castle.");
                System.out.println("You walk into the main chamber room...\nThe room is huge, empty and eerie.\nThe pillars tower over you.");
                System.out.println("You see the throne. Someone is sat in it! Is it the king?!...");
                System.out.println("Press enter to move forward.");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("As you get closer you notice it is the king... But it looks like he's been dead for quite some time.");
                System.out.println("The dead King's eyes start to glow...");
                System.out.println("He slowly rises from his throne...");
                System.out.println("--------------------------************--------------------------------");
                System.out.println("Press enter to speak.");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("'Your grace, Are you alright? What has happened here?!'");
                System.out.println("The dead Kings jaw pops to the left and falls down...");
                System.out.println("--------------------------************--------------------------------");
                System.out.println("Ready yourself!");
                System.out.println("Press enter:");
                scan.nextLine();
                System.out.println("He let's out a piercing screech and charges at you!");

                // Sound effect
                SoundEffects screechClip = new SoundEffects();
                screechClip.PlaySound(screechSound);

                // Battle
                Battle deadKingBattle = new Battle();
                Enemy deadKing = new Enemy("Dead King", 10);
                deadKingBattle.encounter(player, deadKing);
                // End battle

                System.out.println("--------------------------************--------------------------------");
                System.out.println("You have slain the " + deadKing.type + ".");
                System.out.println("He drops his infamous sword. It's name is 'Death Stalker' - Your attacks now have a higher attack range.\n");
                System.out.println("************************");
                System.out.println("You receive Death Stalker x1");
                System.out.println("You receive potion x1");
                System.out.println("************************");

                // Assigning upgrade to players attack
                player.upgradeAttack = true;

                System.out.println("Screeches come from the next room!");
                System.out.println("Press enter to run");
                scan.nextLine();
                testBoolean = false;
                break;

            } else if (lookAround.equals("inn")) {
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You head into the inn.");
                System.out.println("You walk in to find the floor covered with bodies.");
                System.out.println("One rises and charges at you!\n");
                TimeUnit.MILLISECONDS.sleep(2000);

                // Sound effect
                SoundEffects zombieClip  = new SoundEffects();
                zombieClip.PlaySound(zombieSound);

                // Battle
                Battle zombieBattle = new Battle();
                Enemy zombie = new Enemy("Zombie", 6);
                zombieBattle.encounter(player, zombie);
                // End battle

                System.out.println("..... again.");
                System.out.println("Other bodies start to twitch...");
                System.out.println("You quickly exit the inn before the dead consume you.");
                System.out.println("Press enter to exit the inn");
                scan.nextLine();
                testBoolean = false;
                break;

            }
            // Validation loop
            else{
                System.out.println( "You must choose 'castle' or 'inn'");
            }

        }

        //////////////////////////////// Main story path continue \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        System.out.println("--------------------------************--------------------------------");
        System.out.println("Back outside you decide to get the hell out of this place...");
        System.out.println("'The dead are somehow back from the dead?!' You think to yourself.");
        System.out.println("'I need to find someone who is actually alive to find out what is happening!'");
        System.out.println("You run for the keep exit");
        System.out.println("Press enter to exit:");
        scan.nextLine();

        System.out.println("--------------------------************--------------------------------");
        System.out.println("As you get outside you see 3 bears staring at you");
        System.out.println("You CANNOT win.");
        System.out.println("Press enter to summon your might!");
        scan.nextLine();

        System.out.println("--------------------------************--------------------------------");
        System.out.println("You now have access to your 'Special' move. You call forth the strength of the gods to instantly kill any enemy in one hit.");
        System.out.println("However, it comes at a cost. Using such power is not safe and has a 1/3 chance of failing. If it fails, You die.");
        System.out.println("Press enter to battle");
        scan.nextLine();

        // Battle
        Battle bearBattle = new Battle();
        Enemy unbeatableBears = new Enemy("Bears", 100);
        bearBattle.encounterAlwaysSpecial(player, unbeatableBears);
        // End battle

        System.out.println("--------------------------************--------------------------------");
        System.out.println("With this new found power you head forward to search for answers.");
        System.out.println("After walking for some time you come to a split in a pathway. There is a sign...");
        System.out.println("It reads\n<--City--|||||||||||||--Village -->");
        System.out.println("Which way will you go? 'city' or 'village'?");

        // Re-assigning true
        testBoolean = true;

        // While loop for player choice
        while(testBoolean){
            // Assigning choice to variable
            String cityVillage = scan.nextLine();

            if (cityVillage.equals("city")){
                System.out.println("--------------------------************--------------------------------");
                System.out.println("The city is large. You may have more chance of finding some answers from the living... or find more undead.");
                System.out.println("As you get close you can see the city has been badly damaged. It looks like a hard fought war has gone on here.");
                System.out.println("Press enter to continue:");

                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You approach the city gates.");
                System.out.println("It's quiet....");
                System.out.println("You enter the city.");
                System.out.println("Press enter to continue:");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("This city is derelict.");
                System.out.println("A haunting scream travels along the wind..");
                TimeUnit.MILLISECONDS.sleep(2000);

                // Sound effect
                SoundEffects womanScreamClip = new SoundEffects();
                womanScreamClip.PlaySound(screamingSound);

                System.out.println("--------------------------************--------------------------------");
                System.out.println("'That scream sounds like a scream of fear, from a woman!'");
                System.out.println("Press enter to investigate:");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You run in the direction of the scream!");
                System.out.println("As you pass an old tower you hear the scream again. This time much closer.");
                System.out.println("As you turn the corner you see a woman being pinned to a wooden beam by the undead.");
                System.out.println("Without hesitation you charge in and let out a roar!!");
                System.out.println("Press enter to charge");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You charge in and shoulder smash the first enemy!");
                System.out.println("**CRASH**");
                System.out.println("It lifts up clean off it's feet and flies through the air");
                System.out.println("Press enter");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("The nearest enemy brings its club crashing down on you!");

                // Re-assigning true
                testBoolean = true;
                while(testBoolean){

                    System.out.println("Will you 'block' or 'charge' again?");
                    String blockAttack = scan.nextLine();

                    // If statement for player choice
                    if(blockAttack.equals("block")){
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You raise your sword and your weapons smash together!");
                        System.out.println("With your other hand you grab the enemy around its torso, lift up. And SLAM it to the ground!");
                        System.out.println("Press enter:");
                        scan.nextLine();
                        testBoolean = false;
                        break;
                    }
                    else if(blockAttack.equals("charge")){
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You charge into it's attack!");
                        System.out.println("Its club strikes you across the shoulder as you try to turn into the charge - loose 1 health");
                        // Re-assigning player health for enemy damage
                        player.playerHealth = player.playerHealth - 1;
                        System.out.println("You skid to your knees and swing your sword around to decapitate it's legs at the knee caps.");
                        System.out.println("Your health is " + player.getPlayerHealth());
                        System.out.println("Press enter:");
                        scan.nextLine();
                        testBoolean = false;
                        break;
                    }
                    // Validation check for loop
                    else{
                        System.out.println("You must enter 'block' or 'charge':");
                    }
                }

                ////////////////////////// Main story path continue \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
                System.out.println("--------------------------************--------------------------------");
                System.out.println("As you turn to face the remaining two enemies, one charges at you!");
                System.out.println("Will you attack from 'Long' distance or 'bait' the enemy to get in close?");
                testBoolean = true;
                while(testBoolean){

                    // Assigning player choice to variable
                    String longDistance = scan.nextLine();

                    // If statement for player choice
                    if(longDistance.equals("long")){
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You launch your sword through the air which impales the enemy's face.");
                        System.out.println("The force knocks it back pinning it to the ground.");
                        System.out.println("Press enter:");
                        scan.nextLine();
                        testBoolean = false;
                        break;
                    }
                    if(longDistance.equals("bait")){
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You wait as it charges towards you screeching!");
                        System.out.println("You take a giant step forward and sparta kick the enemy in the chest!");
                        System.out.println("The force lifts it up off its feet throwing it through the air and landing on it's own sword. ");
                        System.out.println("Press enter:");
                        scan.nextLine();
                        testBoolean = false;
                        break;
                    }
                    // Validation for check loop
                    else{
                        System.out.println("You must choose 'long' or 'bait':");
                    }

                }

                ///////////////////////// Main story path continue /////////////////////////////////////
                System.out.println("--------------------------************--------------------------------");
                System.out.println("It rips out the weapon from itself, stands up and charges!");

                // Battle
                Enemy InjuredUndeadSoldier = new Enemy("Injured Undead Soldier", 4);
                Battle InjuredUndeadSoldierBattle = new Battle();
                // End battle

                // If statement to choose battle if player has upgrade attack
                if(player.upgradeAttack == true) {
                    InjuredUndeadSoldierBattle.upgradedAttackBattle(player, InjuredUndeadSoldier);
                }
                else{
                    InjuredUndeadSoldierBattle.encounterNormaL(player, InjuredUndeadSoldier);
                }

                //////////////////// Main story path continued ////////////////////////////////////
                System.out.println("--------------------------************--------------------------------");
                System.out.println("The final enemy lunges at you!");

                // Battle
                Enemy undeadSoldier = new Enemy("Undead Soldier", 8);
                Battle undeadSoldierBattle = new Battle();
                // End battle

                // If statement to choose battle if player has upgrade attack
                if(player.upgradeAttack == true) {
                    undeadSoldierBattle.upgradedAttackBattle(player, undeadSoldier);
                }
                else{
                    undeadSoldierBattle.encounterNormaL(player, undeadSoldier);
                }

                //////////////////// Main story path continued from 'city' choice ////////////////////////////////////
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You slay the final enemy.");
                System.out.println("you turn around to attend to the woman pinned to the beams.");
                System.out.println("She is succumbing to the pain and no longer screaming... She doesn't have long left..");
                System.out.println("Press enter to speak:");

                scan.nextLine();

                System.out.println("--------------------------************--------------------------------");
                System.out.println("'Please, what's happened here?!'");
                System.out.println("The woman gives out a breath of relief");
                System.out.println("Press enter:");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("'Hold on!'");
                System.out.println("Are there other survivors?!");
                System.out.println("The woman tries to speak, but lets out a chesty cough, spitting up blood.");
                System.out.println("'please help me' she says softly");
                System.out.println("Press enter:");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You know there is nothing you can do to help...");
                System.out.println("'I will help you. But please you must tell me what happened. Why are these monsters plaguing us?'");
                System.out.println("She manages to draw a breath.");
                System.out.println("Press enter to to get closer:");
                scan.nextLine();
                System.out.println("'Calyx'");
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println("'n....n....necromanc....'");
                TimeUnit.MILLISECONDS.sleep(2000);
                System.out.println("The woman has died.");
                System.out.println("Press enter:");
                scan.nextLine();

                testBoolean = false;
                break;



            }else if(cityVillage.equals("village")){
                System.out.println("--------------------------************--------------------------------");
                System.out.println("You travel along the path to a village.");
                System.out.println("There are dead villagers everywhere.");
                System.out.println("Men, woman and children. Nobody was spared.");
                System.out.println("You continue with caution.");
                System.out.println("Press enter:");
                scan.nextLine();
                System.out.println("--------------------------************--------------------------------");
                System.out.println("As you approach the center if the village you see something move quickly from the corner of your eye.");
                System.out.println("You turn to see a door on one of the buildings slowing to a stop.");
                System.out.println("Will you 'investigate' or 'continue' onwards?:");

                // Assigning player choice to variable
                String choice = scan.nextLine().toLowerCase();

                // Assigning true
                testBoolean = true;
                while(testBoolean) {

                    // If statement for player choice
                    if (choice.equals("investigate")) {
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You quietly walk over to the building, sword at the ready.");
                        System.out.println("Will you open the 'door' or peer through the 'window'?");
                        choice = scan.nextLine().toLowerCase();
                        while(testBoolean) {

                            // Nested if statement for player choice
                            if (choice.equals("door")) {
                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("You carefully open the door.");

                                // Sound effect
                                SoundEffects doorClip = new SoundEffects();
                                doorClip.PlaySound(doorSound);

                                TimeUnit.MILLISECONDS.sleep(2000);
                                System.out.println("You peer into the room but can't see anything.");
                                System.out.println("You enter the building.");
                                System.out.println("Press enter:");
                                scan.nextLine();

                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("You look around the room. It's bare. Just an old table flipped onto its side and some rubble scattered around.");
                                System.out.println("No sign of anyone.");
                                System.out.println("You head back out.");
                                System.out.println("Press enter:");
                                scan.nextLine();
                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("Before you head outside you notice someone standing outside through the window.");
                                System.out.println("You hide yourself against the wall, watching through the window to see who it is.");
                                System.out.println("It seems to be a child...");
                                System.out.println("Press enter:");
                                scan.nextLine();
                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("It lets out a piercing screech.");

                                // Sound effect
                                SoundEffects childScreamClip = new SoundEffects();
                                childScreamClip.PlaySound(childSound);

                                TimeUnit.MILLISECONDS.sleep(2000);
                                System.out.println("The dead start to twitch..");
                                System.out.println("One by one they rise from the ground.");
                                System.out.println("There are way to many to fight.");
                                System.out.println("");
                                break;

                            }
                            if(choice.equals("window")){
                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("You peer through the window.");
                                TimeUnit.MILLISECONDS.sleep(2000);

                                //Sound effect
                                SoundEffects windowClip = new SoundEffects();
                                windowClip.PlaySound(windowSound);

                                System.out.println("A child crashes through the window!");
                                TimeUnit.MILLISECONDS.sleep(2000);
                                System.out.println("It grabs you, biting and scratching.");
                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("You loose 1 health:");

                                // Re-assigning player health from enemy damage and returning it
                                player.playerHealth = player.playerHealth - 1;
                                System.out.println("Your health is: "+ player.getPlayerHealth());

                                System.out.println("Press enter:");
                                scan.nextLine();
                                System.out.println("--------------------------************--------------------------------");
                                System.out.println("You fall back onto the ground. Grabbing the child and throwing it off.");
                                System.out.println("'This is no child' you say to yourself.");
                                System.out.println("You quickly get to your feet, your sword ready to strike");
                                System.out.println("Before you can attack you look up and freeze.");
                                System.out.println("The dead have risen...");
                                break;


                            }
                        }
                        break;
                    }
                    if (choice.equals("continue")) {
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You continue onwards until you come to the local store.");
                        System.out.println("There might be some useful supplies in there.");
                        System.out.println("'Might be worth checking out' you think to yourself.");
                        System.out.println("Press enter:");
                        scan.nextLine();
                        System.out.println("--------------------------************--------------------------------");
                        System.out.println("You enter the store");
                        System.out.println("The shelves have been stripped bare.");
                        System.out.println("You see an old steel box. It's too thick to break open.");
                        System.out.println("Will you use your special attack to open it? (You may die.)");
                        System.out.println("'Yes' or 'no':");

                        // Assigning player choice to variable
                        String yesNo = scan.nextLine().toLowerCase();

                        // Assigning true
                        testBoolean = true;
                        while(testBoolean){

                            // If statement for player choice
                            if(yesNo.equals("yes")){

                                // Using special attack method
                                player.useSpecialAttack();

                                System.out.println("************************");
                                System.out.println("You receive magical pendant x1");
                                System.out.println("************************");
                                ///////////////////////// Insert chime sound effect /////////////////////////////////////////////////////
                                System.out.println("Upon a successful special attack you now regain 5 health.");
                                break;
                            }
                            if(yesNo.equals("no")){
                                break;
                            }
                            // Validation for check loop
                            else{
                                System.out.println("You must choose 'yes' or 'no':");
                            }

                        }
                        System.out.println("You decide to leave.");
                        System.out.println("As you pass the window you notice someone standing outside in the path.");

                        break;
                    }
                    // Validation for check loop
                    else{
                        System.out.println("You must choose 'investigate' or 'continue':");
                    }
                    break;
                }
                System.out.println("");

            }

            // Validation for check loop
            else{
                System.out.println("You must enter 'city' or 'village'");
            }

        }

        //////////////////// Main story path continued ////////////////////////////////////
        System.out.println("--------------------------************--------------------------------");
        System.out.println("************Continue here for break after village and city*********");


*/





}