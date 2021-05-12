package com.company;

public class Story {

    // Objects
    Game game;
    GUI ui;
    VisibilityHandler vm;
    Player player = new Player();
    Enemy enemy;
    SoundEffects clip, clip1;
    int enemyRemaining = 23;


    public Story(Game g, GUI userI, VisibilityHandler visMan) {

        game = g;
        ui = userI;
        vm = visMan;
    }

    public Story() {

    }

    // Default / starting UI
    public void defaultSetup() {

        player.setPlayerMaxHealth(30);

        // Setting player health and potion capacity within the UI
        ui.hpLabelNum.setText(Integer.toString(player.setPlayerHealth(player.getPlayerMaxHealth())));
        ui.potionCapNum.setText(Integer.toString(player.setPotionCapacity(0)));


    }


    // Switch to track position and link story elements with buttons
    public void selectPosition(String position) {

        switch (position) {
            // ------------------------ Potion use -------------------------
            case "usePotionWolf":
                usePotionWolf();
                break;
            case "usePotionZom":
                usePotionZom();
                break;
            case "usePotionDeadKing":
                usePotionDeadKing();
                break;
            // ------------------------ Intro-------------------------------
            case "mainStoryIntro":
                mainStoryIntro();
                break;
            // ------------------------ Main story 2 ------------------------
            case "continueToMainStory2":
                mainStory2();
                break;
            // ------------------------ Main story 3 ------------------------
            case "continueToMainStory3":
                mainStory3();
                break;
            // ------------------------ Main story 4 -------------------------
            case "continueToMainStory4":
                mainStory4();
                break;
            //------------------------  Main story 5 -------------------------
            case "continueToMainStory5":
                mainStory5();
                break;
            case "story5LeftPath":
                story5LeftPath();
                break;
            case "battleWolf":
                battleWolf();
                break;
            case "attackWolf":
                attackWolf();
                break;
            case "enemyWolfAttack":
                enemyWolfAttack();
                break;
            case "loseBattle":
                loseBattle();
                break;
            case "toTitleScreen":
                toTitleScreen();
                break;
            case "winWolfBattle":
                winWolfBattle();
                break;
            case "story5Push":
                story5Push();
                break;
            case "story5Continue":
                story5Continue();
                break;
            // ------------------------ Main story 6 -----------------------
            case "continueToMainStory6":
                mainStory6();
                break;
            case "mainStory6Callout":
                mainStory6Callout();
                break;
            case "enemyZomAttack":
                enemyZomAttack();
                break;
            case "winZomBattle":
                winZomBattle();
                break;
            case "battleZom":
                battleZom();
                break;
            case "attackZom":
                attackZom();
                break;
            // ------------------------ Main story 7 -----------------------
            case "continueToMainStory7":
                mainStory7();
                break;
            // ------------------------ Main story 8 -----------------------
            case "continueToMainStory8":
                mainStory8();
                break;
            case "potionCollect":
                potionCollect();
                break;
            case "story8Gate":
                story8Gate();
                break;
            case "story8GuardPost":
                story8GuardPost();
                break;
            case "story8AnotherWay":
                story8AnotherWay();
                break;
            case "story8Watchtower":
                story8Watchtower();
                break;
            case "story8CastleKeep":
                story8CastleKeep();
                break;
            case "story8BeforeCastle":
                story8BeforeCastle();
                break;
            // ------------------------ Main story 9 -----------------------
            case "continueToMainStory9":
                mainStory9();
                break;
            case "story9Forward":
                story9Forward();
                break;
            case "story9Speak":
                story9Speak();
                break;
            case "battleDeadKing":
                battleDeadKing();
                break;
            case "enemyDeadKingAttack":
                enemyDeadKingAttack();
                break;
            case "attackDeadKing":
                attackDeadKing();
                break;
            case "winDeadKingBattle":
                winDeadKingBattle();
                break;
            case "deadKingLoot":
                deadKingLoot();
                break;

            // ------------------------ Main story 10 -----------------------
            case "continueToMainStory10":
                mainStory10();
                break;
            case "story10Outside":
                story10Outside();
                break;
            case "story10Wake":
                story10Wake();
                break;
            case "story10Lightning":
                story10Lightning();
                break;
            case "battleTownFolk":
                battleTownFolk();
                break;
            case "attackTownFolk":
                attackTownFolk();
                break;
            case "enemyTownFolkAttack":
                enemyTownFolkAttack();
                break;
            case "winTownFolkBattle":
                winTownFolkBattle();
                break;
            case "usePotionTownFolk":
                usePotionTownFolk();
                break;
            case "useSpecialTownFolk":
                useSpecialTownFolk();
                break;
            case "useSpecialTownFolk2":
                useSpecialTownFolk2();
                break;
            case "specialAttackResultTownFolk":
                specialAttackResultTownFolk();
                break;
            // ----------------------- Main story 11 ---------------------------
            case "continueToMainStory11":
                mainStory11();
                break;
            case "story11Exit":
                story11Exit();
                break;
            // ---------------------- Main story 12 ------------------------------
            case "continueToMainStory12":
                mainStory12();
                break;
            case "continueToMainStory12City":
                mainStory12City();
                break;
                // City
            case "continueToCity":
                continueToCity();
                break;
            case "enterCity":
                enterCity();
                break;
            case "innerCity":
                innerCity();
                break;
            case "innerCityWoman":
                innerCityWoman();
                break;
            case "innerCityHelp":
                innerCityHelp();
                break;
            case "innerCityCounter":
                innerCityCounter();
                break;
            case "innerCityBlock":
                innerCityBlock();
                break;
            case "innerCityRemainingEnemy":
                innerCityRemainingEnemy();
                break;
            case "innerCityThrowSword":
                innerCityThrowSword();
                break;
            case "innerCityDefend2":
                innerCityDefend2();
                break;
            case "innerCitySpecial":
                innerCitySpecial();
                break;
            case "innerCitySpecial2":
                innerCitySpecial2();
                break;
            case "innerCitySpecialAttackResult":
                innerCitySpecialAttackResult();
                break;
            case "innerCitySaved":
                innerCitySaved();
                break;
            case "innerCitySavedWoman":
                innerCitySavedWoman();
                break;
            case "innerCitySavedWomanSpeak":
                innerCitySavedWomanSpeak();
                break;
            case "innerCityWomanDied":
                innerCityWomanDied();
                break;
            case "innerCityRun":
                innerCityRun();
                break;
            case "innerCityBlock2":
                innerCityBlock2();
                break;
            case "innerCityHordeSpecial":
                innerCityHordeSpecial();
                break;
            case "innerCityHordeSpecial2":
                innerCityHordeSpecial2();
                break;
            case "innerCityLeft":
                innerCityLeft();
                break;
            case "innerCityRight":
                innerCityRight();
                break;
            case "innerCityAlleyLeft":
                innerCityAlleyLeft();
                break;
            case "innerCityAlleyRight":
                innerCityAlleyRight();
                break;
            case "innerCityHordeSpecialResult":
                innerCityHordeSpecialResult();
                break;
                // undead battle--------
            case "cityUndeadBattle":
                cityUndeadBattle();
                break;
            case "attackUndead":
                attackUndead();
                break;
            case "useSpecialUndead":
                useSpecialUndead();
                break;
            case "useSpecialUndead2":
                useSpecialUndead2();
                break;
            case "specialUndeadResult":
                specialUndeadResult();
                break;
            case "winUndeadBattle":
                winUndeadBattle();
                break;
            case "innerCityBackGate":
                innerCityBackGate();
                break;
            case "usePotionUndead":
                usePotionUndead();
                break;
                // troll battle -----------
            case "cityTrollBattle":
                cityTrollBattle();
                break;
            case "attackTroll":
                attackTroll();
                break;
            case "usePotionTroll":
                usePotionTroll();
                break;
            case "trollAttack":
                trollAttack();
                break;
            case "winTrollBattle":
                winTrollBattle();
                break;
            case "trollLoot":
                trollLoot();
                break;
            case "useSpecialTroll":
                useSpecialTroll();
                break;
            case "useSpecialTroll2":
                useSpecialTroll2();
                break;
            case "specialTrollResult":
                specialTrollResult();
                break;
            case "leaveCity":
                leaveCity();
                break;
            case "innerCityNothing":
                innerCityNothing();
                break;
            case "innerCityRoam":
                innerCityRoam();
                break;
            case "innerCityChurch":
                innerCityChurch();
                break;
            case "innerCityChurchMake":
                innerCityChurchMake();
                break;
            case "innerCityChurchMake2":
                innerCityChurchMake2();
                break;
            case "innerCityChurchLeave":
                innerCityChurchLeave();
                break;
            case "innerCityChurchSpeak":
                innerCityChurchSpeak();
                break;
            case "innerCityChurchSpeak2":
                innerCityChurchSpeak2();
                break;
            case "innerCityChurchSpecial":
                innerCityChurchSpecial();
                break;
            case "innerCityChurchAttack":
                innerCityChurchAttack();
                break;
            case "innerCityChurchSpeak3":
                innerCityChurchSpeak3();
                break;
            case "leaveCityLeaveChurch":
                leaveCityLeaveChurch();
                break;
                // Village
            case "continueToMainStory12Village":
                villageEdge();
                break;
            case "enterVillage":
                enterVillage();
                break;
            case "villageInvestigate":
                villageInvestigate();
                break;
            case "villageIgnore":
                villageIgnore();
                break;
            case "villageStore":
                villageStore();
                break;
            case "villageStoreTake":
                villageStoreTake();
                break;
            case "villageStoreTake2":
                villageStoreTake2();
                break;
            case "villageStoreTake3":
                villageStoreTake3();
                break;
            case "villageStoreLeave":
                villageStoreLeave();
                break;
            case "villageStoreWake":
                villageStoreWake();
                break;
            case "potionCollectStore":
                potionCollectStore();
                break;

            case "villageEnterHouse":
                villageEnterHouse();
                break;
            case "villageLookWindow":
                villageLookWindow();
                break;
            case "houseBack":
                houseBack();
                break;
            case "houseStand":
                houseStand();
                break;
            case "houseWipe":
                houseWipe();
                break;
            case "villageFight":
                villageFight();
                break;
            case "villageFight2":
                villageFight2();
                break;
            case "attackVillageFight":
                attackVillageFight();
                break;
            case "villageFightAttack":
                villageFightAttack();
                break;
            case "WinVillageFightBattle":
                winVillageFightBattle();
                break;
            case "usePotionVillageFight":
                usePotionVillageFight();
                break;
            case "useSpecialVillageFight":
                useSpecialVillageFight();
                break;
            case "useSpecialVillageFight2":
                useSpecialVillageFight2();
                break;
            case "specialVillageFightResult":
                specialVillageFightResult();
                break;
            case "villageStory":
                villageStory();
                break;
            case "villageStoryCitizen":
                villageStoryCitizen();
                break;
            case "villageStoryCitizen2":
                villageStoryCitizen2();
                break;
            case "villageStoryCitizenCall3":
                villageStoryCitizenCall3();
                break;
            case "villageStoryCitizenNothing":
                villageStoryCitizenNothing();
                break;
            case "villageStoryCitizenCall":
                villageStoryCitizenCall();
                break;
            case "villageStoryCitizenCall2":
                villageStoryCitizenCall2();
                break;
            case "villageStoryCitizenYes":
                villageStoryCitizenYes();
                break;
            case "villageStoryCitizenNo":
                villageStoryCitizenNo();
                break;
            case "villageStoryCitizenEvil":
                villageStoryCitizenEvil();
                break;
            case "villageStoryCitizenShadow":
                villageStoryCitizenShadow();
                break;
            case "villageStoryCitizenEnd":
                villageStoryCitizenEnd();
                break;
            case "villageStoryCitizenInvite":
                villageStoryCitizenInvite();
                break;
            case "villageStoryCitizenLeave":
                villageStoryCitizenLeave();
                break;
            case "villageStoryCitizenPromiseNo":
                villageStoryCitizenPromiseNo();
                break;
            case "villageStoryCitizenPromiseYes":
                villageStoryCitizenPromiseYes();
                break;
            case "villageLeave":
                villageLeave();
                break;
            case "villageLeaveNo":
                villageLeaveNo();
                break;
            case "houseOut":
                houseOut();
                break;
            case "houseHide":
                houseHide();
                break;
            case "villageChild":
                villageChild();
                break;
            case "houseFront":
                houseFront();
                break;
            case "villageRun":
                villageRun();
                break;
            case "villageChildFight":
                villageChildFight();
                break;
            case "childBattle":
                childBattle();
                break;
            case "attackUndeadChild":
                attackUndeadChild();
                break;
            case "undeadChildAttack":
                undeadChildAttack();
                break;
            case "winUndeadChildBattle":
                winUndeadChildBattle();
                break;
            case "usePotionUndeadChild":
                usePotionUndeadChild();
                break;
            case "useSpecialUndeadChild":
                useSpecialUndeadChild();
                break;
            case "useSpecialUndeadChild2":
                useSpecialUndeadChild2();
                break;
            case "specialUndeadChildResult":
                specialUndeadChildResult();
                break;
            case "villageWinChildBattle":
                villageWinChildBattle();
                break;
            case "houseSpecial":
                houseSpecial();
                break;
            case "houseSpecial2":
                houseSpecial2();
                break;
            case "houseSpecialResult":
                houseSpecialResult();
                break;
            case "houseAfterSpecial":
                houseAfterSpecial();
                break;
            // ---------------------- Main story 13 ------------------------------
            case "continueToMainStory13":
                mainStory13();
                break;
            case "roadToLeon":
                roadToLeon();
                break;
            case "leonCrossRoad":
                leonCrossRoad();
                break;
            case "crossRoadForward":
                crossRoadForward();
                break;
            case "crossRoadRight":
                crossRoadRight();
                break;
            case "forestSign":
                forestSign();
                break;
            case "forestWitchProtector":
                forestWitchProtector();
                break;
            case "forestProtectorSpeak":
                forestProtectorSpeak();
                break;
            case "forestProtectorFight":
                forestProtectorFight();
                break;
            case "enterForest":
                enterForest();
                break;
            case "entBattle":
                entBattle();
                break;
            case "entAttack":
                entAttack();
                break;
            case "attackEnt":
                attackEnt();
                break;
            case "entRun":
                entRun();
                break;
            case "crossRoadLeft":
                crossRoadLeft();
                break;


        }

    }

    // ---------------------- Potion collects --------------------------------
    public void potionCollect() {

        //Main text in UI
        ui.mainTextPlace.setText("You find a potion!");

        player.potionCapacity += 1;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        // Buttons
        ui.choice1.setText("Leave");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story8BeforeCastle";
        game.position2 = "";
        game.position3 = "";
    }

    public void potionCollectStore() {

        //Main text in UI
        ui.mainTextPlace.setText("You find a potion!");

        player.potionCapacity += 1;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        // Buttons
        ui.choice1.setText("Leave");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoreLeave";
        game.position2 = "";
        game.position3 = "";
    }




    // --------------------------- Player death ----------------------------------------
    // Lose sequence / player death
    public void loseBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You are dead");

        clip = new SoundEffects();
        clip.PlaySound("gameOver.wav");

        // Buttons
        ui.choice1.setText("Menu");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "toTitleScreen";
        game.position2 = "";
        game.position3 = "";
    }

    // Return to title screen after death
    public void toTitleScreen() {

        defaultSetup();
        vm.showTitleScreen();
    }


    // ----------------------------------- Main Story Intro ----------------------------------------------
    public void mainStoryIntro() {

        //Main text in UI
        ui.mainTextPlace.setText("This tale begins in the region of Zanarkand, in\nyour home village, Hill Tale." +
                "\n\nThe world around you is slowly decaying, friends become ill, vegetation dying and food rotting but" +
                "\nnobody seems to know why." +
                "\n\nOne night while asleep you are awoken by the" +
                "\nscreams of the villagers." +
                "\n\nYou quickly get dressed, grab your sword and" +
                "\nrush out the door to see what's going on.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory2";
        game.position2 = "";
        game.position3 = "";

    }

    // ----------------------------------- Main Story 2 ----------------------------------------------
    public void mainStory2() {

        //Main text in UI
        ui.mainTextPlace.setText("Outside is chaos." +
                "\n\nPeople are running and screaming and houses are ablaze." +
                "\n\nThe metallic smell of blood engulfs the air." +
                "\n\nBefore you can figure out what is happening you" +
                "\nfeel a heavy thud to your head." +
                "\n\n You are unconscious.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "continueToMainStory3";
        game.position2 = "";
        game.position3 = "mainStoryIntro";
    }

    // ----------------------------------- Main Story 3 ----------------------------------------------
    public void mainStory3() {

        //Main text in UI
        ui.mainTextPlace.setText(".......");

        // Buttons
        ui.choice1.setText("Awaken");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "continueToMainStory4";
        game.position2 = "";
        game.position3 = "continueToMainStory2";
    }

    // ----------------------------------- Main Story 4 ----------------------------------------------
    public void mainStory4() {

        //Main text in UI
        ui.mainTextPlace.setText("You slowly awaken..." +
                "\n\nYour sword still clutched in your hand." +
                "\nA surge of pain rushes to the back of your head" +
                "\n\n'Uhhhh my head'" +
                "\n\nSilence falls upon the village..." +
                "\n\nThe once piercing screams have gone." +
                "\n\nThe whole village is burning.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "continueToMainStory5";
        game.position2 = "";
        game.position3 = "continueToMainStory3";
    }

    // ----------------------------------- Main Story 5 ----------------------------------------------
    public void mainStory5() {

        //Main text in UI
        ui.mainTextPlace.setText("Confused and with the village burning you decide to leave quickly." +
                "\n\nYou follow the dirt path out of the village." +
                "\n\nYou walk for a while until you come across a path veering off to the left." +
                "\n\nWhich way will you go?");

        // Buttons
        ui.choice1.setText("Left");
        ui.choice2.setText("Continue");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story5LeftPath";
        game.position2 = "story5Continue";
        game.position3 = "-";
    }

    public void story5Continue(){

        //Main text in UI
        ui.mainTextPlace.setText("You continue on for some time until the path" +
                "\n narrows." +
                "\n\nThe trees and shrubs have overgrown making it" +
                "\n awkward to get through.");

        // Buttons
        ui.choice1.setText("Push through");
        ui.choice2.setText("-");
        ui.choice3.setText("Head back");

        // button assign
        game.position1 = "story5Push";
        game.position2 = "-";
        game.position3 = "continueToMainStory5";
    }

    public void story5Push() {

        //Main text in UI
        ui.mainTextPlace.setText("You force your way through the overgrown" +
                "\nshrubs..." +
                "\n\nYou get a few scratches and scrapes as you reach" +
                "\nthe opening at the other end." +
                "\n\nYou lose 2 health.");

        // Re-assigning player health
        player.playerHealth = player.playerHealth - 2;

        // Re-assigning health in the UI
        if (player.getPlayerHealth() <= 0) {
            ui.hpLabelNum.setText("0");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "-";
            game.position3 = "-";

        } else {
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "continueToMainStory6";
            game.position2 = "-";
            game.position3 = "-";

        }

    }


    public void story5LeftPath() {

        //Main text in UI
        ui.mainTextPlace.setText("You change direction and take the path going left." +
                "\n\nUp ahead you see a pack of wolves roaming along" +
                "\nthe path." +
                "\nThey notice you and freeze, staring at you..." +
                "\n\nOne of them runs straight towards you." +
                "\n\nThe others scarper into the woods." +
                "\n\nIt leaps towards you and bites your arm!" +
                "\n\nYou lose 1 health.");

        //Re-assigning player health after damage
        player.playerHealth = player.playerHealth -1;
        //Re-assigning health in the UI
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "battleWolf";
        game.position2 = "";
        game.position3 = "";
    }

    // Initialise wolf battle sequence
    public void battleWolf() {
        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        enemy = new Enemy("Wolf", 2);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "attackWolf";
        game.position2 = "usePotionWolf";
        game.position3 = "";

    }

    public void attackWolf() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length);
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "enemyWolfAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winWolfBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void enemyWolfAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "attackWolf";
            game.position2 = "usePotionWolf";
            game.position3 = "";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winWolfBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType());

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory6";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionWolf(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // Button assign
        game.position1 = "attackWolf";
        game.position2 = "usePotionWolf";
        game.position3 = "";
    }


    // ----------------------------------- Main Story 6 ----------------------------------------------
    public void mainStory6() {

        //Main text in UI
        ui.mainTextPlace.setText("As you continue along the road you start to see" +
                "\nFenwyn castle in the distance." +
                "\n\n 'There must be someone at the castle who can tell" +
                "\nme what's going on'." +
                "\n\nAs you get closer you notice there is someone" +
                "\nahead on the path." +
                "\n\nThey seem to be stumbling. Are they injured" +
                "\nperhaps?");

        // Buttons
        ui.choice1.setText("Call out");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "mainStory6Callout";
        game.position2 = "";
        game.position3 = "";
    }

    public void mainStory6Callout() {

        //Main text in UI
        ui.mainTextPlace.setText(" 'Hey!'" +
                "\n\nYou catch the attention of the figure ahead." +
                "\n\nAs they turn around you notice their eyes lifeless" +
                "\nand dull." +
                "\n\nThey scream and charge at you.");

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "battleZom";
        game.position2 = "";
        game.position3 = "";
    }


    public void battleZom() {

        enemy = new Enemy("Zombie", 5);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        clip = new SoundEffects();
        clip.PlaySound("zombieNoise.wav");

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "attackZom";
        game.position2 = "usePotionZom";
        game.position3 = "";

    }

    // Attack sequence
    public void attackZom() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length);
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            // Buttons
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "enemyZomAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            //Assigning health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winZomBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    // Enemy attack sequence
    public void enemyZomAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Setting player health within UI
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieGrunt.wav");

        // statements to catch player death
        if(player.getPlayerHealth() > 0){

            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "attackZom";
            game.position2 = "usePotionZom";
            game.position3 = "";
        }
        else{
            // Setting health to 0 to stop it showing negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }


    // Win sequence
    public void winZomBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType());

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory7";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionZom(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // Button assign
        game.position1 = "attackZom";
        game.position2 = "usePotionZom";
        game.position3 = "";
    }

    // ----------------------------------- Main Story 7 ----------------------------------------------
    public void mainStory7() {

        //Main text in UI
        ui.mainTextPlace.setText("'What was that... that thing?'" +
                "\n\n'I need to find out what is happening.'" +
                "\n\nMaybe i can get some answers at the castle.'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory8";
        game.position2 = "";
        game.position3 = "";

    }

    // ----------------------------------- Main Story 8 ----------------------------------------------
    public void mainStory8() {

        //Main text in UI
        ui.mainTextPlace.setText("You continue onwards until you come to Fenwyn Castle." +
                "\n\nThe outer gate is open and unguarded." +
                "\n\n'That's strange. Where are the guards?'" +
                "\n\nMaybe i should find another way in that's not so" +
                "\non display'.");

        // Buttons
        ui.choice1.setText("Outer gate");
        ui.choice2.setText("Another way");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "story8Gate";
        game.position2 = "story8AnotherWay";
        game.position3 = "continueToMainStory7";

    }

    public void story8Gate() {

        //Main text in UI
        ui.mainTextPlace.setText("You slowly enter through the gate." +
                "\n\nAs you enter you look around the castle keep." +
                "\n\nIt is eerily silent. There is nobody around." +
                "\n\nYou can see the castle entrance across the castle" +
                "\nkeep grounds." +
                "\n\n'Maybe i should try and find the guards at the" +
                "\nguard post?");

        // Buttons
        ui.choice1.setText("Castle");
        ui.choice2.setText("Guard post");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story8BeforeCastle";
        game.position2 = "story8GuardPost";
        game.position3 = "";
    }

    public void story8GuardPost() {

        //Main text in UI
        ui.mainTextPlace.setText("You head into the Guards post." +
                "\n\n'Hello? Is anyone here?'" +
                "\n\n....." +
                "\nNothing." +
                "\n\nYou search the Guards post, rummaging through wooden crates and old clothes.");


        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "potionCollect";
        game.position2 = "";
        game.position3 = "";
    }


    public void story8AnotherWay() {

        //Main text in UI
        ui.mainTextPlace.setText("You decide to find another way into the castle." +
                "\n\nYou follow the outer wall you looking for another way in." +
                "\n\nConveniently you see a ladder leading up to the" +
                "\nwatchtower." +
                "\n\nWill you climb it?");
        // Buttons
        ui.choice1.setText("Climb");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "story8Watchtower";
        game.position2 = "-";
        game.position3 = "continueToMainStory8";
    }

    public void story8Watchtower() {

        //Main text in UI
        ui.mainTextPlace.setText("You climb up the rickety ladder." +
                "\n\nAs you reach up and climb through the window" +
                "\nyou see the watchtower has been wrecked. It" +
                "\nlooks like a fight has gone on here." +
                "\n\nYou climb through the window and drop to the" +
                "\nfloor. There is a huge crash!"+
                "\n\nThe damaged floor gives way beneath you and" +
                "\nyou fall into the castle keep."+
                "\n\nYou lose 2 health.");

        // Re-assigning player health
        player.playerHealth -= 2;
        // Re-assigning health in the UI
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story8CastleKeep";
        game.position2 = "";
        game.position3 = "";

    }

    public void story8CastleKeep() {

        //Main text in UI
        ui.mainTextPlace.setText("'Ughh that hurt.'" +
                "\n\nYou brush yourself off." +
                "\n\n'So much for wanting to be discreet'." +
                "\n\nAmong the rubble you landed in you see a red" +
                "\nflask, surprisingly undamaged.");


        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "potionCollect";
        game.position2 = "";
        game.position3 = "";

    }

    public void story8BeforeCastle() {

        //Main text in UI
        ui.mainTextPlace.setText("Across the castle keep you see an entrance into" +
                "\nthe main castle chamber." +
                "\n\n'Where is everyone?!'" +
                "\n\n'Has the King gone too...?'" +
                "\n\nA feeling of dread consumes you as you prepare" +
                "\nto enter the castle.");


        // Buttons
        ui.choice1.setText("Enter Castle");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "continueToMainStory9";
        game.position2 = "";
        game.position3 = "story8Gate";
    }


    // ----------------------------------- Main Story 9 ----------------------------------------------
    public void mainStory9() {

        //Main text in UI
        ui.mainTextPlace.setText("You head into the castle." +
                "" +
                "\n\nYou walk through the narrow halls and enter the main chamber room." +
                "\n\nThe room is huge and cold.." +
                "\n\nThe pillars tower above you." +
                "\n\nYou see the throne ahead of you." +
                "\n\nSomeone is sat in it..." +
                "\n\n'Is it the king?!'");

        // Buttons
        ui.choice1.setText("Forward");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story9Forward";
        game.position2 = "";
        game.position3 = "";

    }

    public void story9Forward() {

        //Main text in UI
        ui.mainTextPlace.setText("As you get closer you notice it is the King but" +
                "\nhe looks like he's been dead for quite some time." +
                "\n\nYou feel a sense of sadness.." +
                "\n\nIt is quickly drown out by fear as the dead Kings" +
                "\neyes start to glow." +
                "\n\nHe slowly rises from his throne.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story9Speak";
        game.position2 = "";
        game.position3 = "";

    }

    public void story9Speak() {

        //Main text in UI
        ui.mainTextPlace.setText("'Your grace, are you alright?! What has happened here?!'" +
                "\n\nThe Kings jaw pops to the left and hangs down." +
                "\n\nHe lets our a piercing scream and charges at you." +
                "\n\nReady yourself!");

        // Buttons
        ui.choice1.setText("Ready");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "battleDeadKing";
        game.position2 = "";
        game.position3 = "";

    }



    public void battleDeadKing() {

        //Sound effect
        clip = new SoundEffects();
        clip.PlaySound("screech.wav");

        enemy = new Enemy("Dead King", 10);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "attackDeadKing";
        game.position2 = "usePotionDeadKing";
        game.position3 = "";

    }

    public void attackDeadKing() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length);
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "enemyDeadKingAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winDeadKingBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void enemyDeadKingAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "attackDeadKing";
            game.position2 = "usePotionDeadKing";
            game.position3 = "";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winDeadKingBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType() +
                "\n\nHe drops his infamous sword." +
                "\n\nIt's name is 'Death Stalker' - " +
                "\nYour attacks now have higher attack range");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Loot");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "deadKingLoot";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionDeadKing(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("-");

        // Button assign
        game.position1 = "attackDeadKing";
        game.position2 = "usePotionDeadKing";
        game.position3 = "";
    }

    public void deadKingLoot(){

        clip = new SoundEffects();
        clip.PlaySound("");

        //Main text in UI
        ui.mainTextPlace.setText("        *******************" +
                "\n        *                                *" +
                "\n        *   You receive loot:    *" +
                "\n        *                                *" +
                "\n        *   Death stalker x 1    *" +
                "\n        *   (upgraded attack)   *" +
                "\n        *                                *" +
                "\n        *   Potion x1               *" +
                "\n        *                                *" +
                "\n        *******************");

        player.potionCapacity += 1;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory10";
        game.position2 = "";
        game.position3 = "";
    }

    // ----------------------------------- Main Story 10 ----------------------------------------------
    public void mainStory10() {

        //Main text in UI
        ui.mainTextPlace.setText("A moment of silence comes and goes." +
                "\n\nBefore you even have time to gather yourself," +
                "\nscreeches make their way to the main chamber" +
                "\nroom along the narrow corridors." +
                "\n\n 'I think it's time to get out of here!'");

        // Buttons
        ui.choice1.setText("Run");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story10Outside";
        game.position2 = "";
        game.position3 = "";

    }

    public void story10Outside() {

        //Main text in UI
        ui.mainTextPlace.setText("Back outside you slam the door behind you." +
                "\nThe sun has set and night crawls in." +
                "\nThe sky gives off a flash followed by a crash of" +
                "\nthunder." +
                "\n\n 'The dead are somehow back from the dead?!'" +
                "\n\n 'I need to find someone who is actually alive" +
                "\nand find out what is happening!'" +
                "\n\nSomething starts banging at the door behind you.");

        // Buttons
        ui.choice1.setText("Run");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story10Lightning";
        game.position2 = "";
        game.position3 = "";

    }

    public void story10Lightning() {

        //Main text in UI
        ui.mainTextPlace.setText("As you head for the keep exit the sky flashes.." +
                "\n\nLightning crashes down and strikes you!" +
                "\n\nYou are thrown back slamming into the castle" +
                "\nwall." +
                "\n\nYou are unconscious.");

        // Buttons
        ui.choice1.setText("Wake");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story10Wake";
        game.position2 = "";
        game.position3 = "";

    }

    public void story10Wake() {

        //Main text in UI
        ui.mainTextPlace.setText(" 'Ughh what happened...?'" +
                "\n\nYou stand up, feeling surprisingly energized." +
                "\n\nA blue surge rushes through your hand." +
                "\n\nAs you stand up you notice you are slowly being" +
                "\nsurrounded by the town folk," +
                "\nor so they used to be." +
                "\n\nThis is one fight you cannot win...");

        // Re-assigning player health
        player.playerHealth = player.playerHealth + 5;
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "battleTownFolk";
        game.position2 = "";
        game.position3 = "";

    }



    public void battleTownFolk() {


        enemy = new Enemy("Town Folk", 666);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "attackTownFolk";
        game.position2 = "usePotionTownFolk";
        game.position3 = "useSpecialTownFolk";

    }

    public void attackTownFolk() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length) + 1;
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "enemyTownFolkAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTownFolkBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void enemyTownFolkAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("Special");

            // button assign
            game.position1 = "attackTownFolk";
            game.position2 = "usePotionTownFolk";
            game.position3 = "useSpecialTownFolk";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winTownFolkBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory11";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionTownFolk(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // Button assign
        game.position1 = "attackTownFolk";
        game.position2 = "usePotionTownFolk";
        game.position3 = "useSpecialTownFolk";
    }

    public void useSpecialTownFolk(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "useSpecialTownFolk2";
        game.position2 = "";
        game.position3 = "";
    }

    public void useSpecialTownFolk2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "specialAttackResultTownFolk";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void specialAttackResultTownFolk() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "continueToMainStory11";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "continueToMainStory11";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "continueToMainStory11";
            game.position2 = "";
            game.position3 = "";
        }


    }


    // ----------------------------------- Main Story 11 ----------------------------------------------
    public void mainStory11() {

        //Main text in UI
        ui.mainTextPlace.setText("All of the enemies have been defeated." +
                "\n\n 'Wow, that was incredible. I can feel the power " +
                "\nrushing through me.'" +
                "\n\n 'But I don't have time to question this, I must flee" +
                "\nbefore more come.'" +
                "\n\nYou now have access to your Special ability." +
                "\nYou can call forth the strength of the gods to" +
                "\ninstantly kill any enemy." +
                "\n\nHowever, it comes at a cost...");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "story11Exit";
        game.position2 = "";
        game.position3 = "";

    }

    public void story11Exit() {

        //Main text in UI
        ui.mainTextPlace.setText("Using such power is not safe and has a 1/3" +
                "\nchance of failing. If it fails, you die.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory12";
        game.position2 = "";
        game.position3 = "";

    }

    // ----------------------------------- Main Story 12 ----------------------------------------------
    public void mainStory12() {

        //Main text in UI
        ui.mainTextPlace.setText("You flee as quickly as possible back out of the" +
                "\ncastle keep and head along the path south " +
                "\nof the castle." +
                "\n\nAfter walking for some time you come to a split in the road." +
                "\n\nThere is a sign..." +
                "\n\n <---CITY | VILLAGE--->");

        // Buttons
        ui.choice1.setText("City");
        ui.choice2.setText("Village");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory12City";
        game.position2 = "continueToMainStory12Village";
        game.position3 = "";

    }

    // Story 12 VILLAGE----------------------------------------------------------------
    public void villageEdge() {

        //Main text in UI
        ui.mainTextPlace.setText("You travel along the path to the village." +
                "\n\nAs you approach the village you notice bodies" +
                "\nscattered all over." +
                "\n\nIt seems as if the village suffered the same fate as" +
                "\nyours." +
                "\n\n'I must continue with caution.'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "enterVillage";
        game.position2 = "";
        game.position3 = "";

    }

    public void enterVillage() {

        //Main text in UI
        ui.mainTextPlace.setText("You slowly make your way into the center of" +
                "\nthe village, avoiding the bodies as you pass." +
                "\n\nAs you reach the center see something move" +
                "\nquickly from the corner of your eye." +
                "\n\nYou turn to see a door on one of the houses" +
                "\nslowing to a stop.");

        // Buttons
        ui.choice1.setText("Investigate");
        ui.choice2.setText("Ignore");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageInvestigate";
        game.position2 = "villageIgnore";
        game.position3 = "";

    }

    public void villageInvestigate () {

        //Main text in UI
        ui.mainTextPlace.setText("'I have a bad feeling about this...'" +
                "\n\nYou quietly approach the house, sword at the" +
                "\nready." +
                "\n\n'Maybe I should look through the window first?'");

        // Buttons
        ui.choice1.setText("Enter");
        ui.choice2.setText("Window");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "villageEnterHouse";
        game.position2 = "villageLookWindow";
        game.position3 = "enterVillage";

    }

    public void villageEnterHouse() {

        //Main text in UI
        ui.mainTextPlace.setText("The door creaks as you open it and head in." +
                "\n\nYou look around the room but it has been trashed." +
                "\n\nThere is nothing here." +
                "\n\nAs you go to head out you notice someone" +
                "\nstanding outside through the window." +
                "\n\nIt seems to be a child.");

        // Buttons
        ui.choice1.setText("Head out");
        ui.choice2.setText("Hide");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageChildFight";
        game.position2 = "houseHide";
        game.position3 = "";

    }

    public void villageChildFight() {

        //Main text in UI
        ui.mainTextPlace.setText("You step out through the door and without" +
                "\nhesitation the child runs towards you and attacks!" +
                "\n\nTaken off guard by it being a child you freeze." +
                "\n\nShe jumps towards you, scratching and biting." +
                "\n\nYou lose 1 health.");

        // Re-assigning player health
        player.playerHealth = player.playerHealth - 1;


        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "childBattle";
        game.position2 = "";
        game.position3 = "";

    }


    public void childBattle() {

// Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieNoise.wav");

        enemy = new Enemy("Undead Child", 5);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "attackUndeadChild";
        game.position2 = "usePotionUndeadChild";
        game.position3 = "useSpecialUndeadChild";

    }

    public void attackUndeadChild() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length) + 1;
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "undeadChildAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winUndeadChildBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void undeadChildAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieGrunt.wav");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("Special");

            // button assign
            game.position1 = "attackUndeadChild";
            game.position2 = "usePotionUndeadChild";
            game.position3 = "useSpecialUndeadChild";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winUndeadChildBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType());


        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageWinChildBattle";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionUndeadChild(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // Button assign
        game.position1 = "attackUndeadChild";
        game.position2 = "usePotionUndeadChild";
        game.position3 = "useSpecialUndeadChild";
    }

    public void useSpecialUndeadChild(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "useSpecialUndeadChild2";
        game.position2 = "";
        game.position3 = "";
    }

    public void useSpecialUndeadChild2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "specialUndeadChildResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void specialUndeadChildResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageWinChildBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageWinChildBattle";
            game.position2 = "";
            game.position3 = "";
        }


    }

    public void villageWinChildBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("'That was just a child! Does this evil have no" +
                "\nlimit?'" +
                "\n\nThe noise from the fight has attracted some" +
                "\nunwanted attention." +
                "\n\nThe bodies around the village have started to" +
                "\nrise." +
                "\n\nThis is bad...'");


        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseOut";
        game.position2 = "";
        game.position3 = "";
    }


    public void houseHide() {

        //Main text in UI
        ui.mainTextPlace.setText("You duck down and hide against the wall and" +
                "\npeer through the open door." +
                "\n\n'It seems to be a child..." +
                "\n\n'What is she doing just standing there?'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageChild";
        game.position2 = "";
        game.position3 = "";

    }


    public void villageChild() {

        //Main text in UI
        ui.mainTextPlace.setText("She lets out a piercing screech!" +
                "\n\nThe bodies around the village start to twitch." +
                "\n\nOne by one they rise from the ground." +
                "\n\n'This is bad...'" +
                "\n\n'I need to find a way out of here.'");

        clip = new SoundEffects();
        clip.PlaySound("childScream.wav");

        // Buttons
        ui.choice1.setText("Front");
        ui.choice2.setText("Back");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseFront";
        game.position2 = "houseBack";
        game.position3 = "";

    }

    public void houseFront() {

        //Main text in UI
        ui.mainTextPlace.setText("You decide to go out the front door in plain sight." +
                "\n\nThe bodies that have risen all turn and look at you." +
                "\n\n'This is really bad...'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseOut";
        game.position2 = "";
        game.position3 = "";

    }

    public void houseBack() {

        //Main text in UI
        ui.mainTextPlace.setText("You try to slip out the back way but the door" +
                "\nis blocked by broken furniture." +
                "\n\n'Guess that only leaves the front then...'" +
                "\n\nUnless I clear a path. But the noise will surely" +
                "\nattract attention.");

        // Buttons
        ui.choice1.setText("Front");
        ui.choice2.setText("Special");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseFront";
        game.position2 = "houseSpecial";
        game.position3 = "";

    }

    public void houseSpecial(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseSpecial2";
        game.position2 = "";
        game.position3 = "";
    }

    public void houseSpecial2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseSpecialResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void houseSpecialResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The house has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "houseAfterSpecial";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("You, and the house have been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The house has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "houseAfterSpecial";
            game.position2 = "";
            game.position3 = "";
        }


    }

    public void houseAfterSpecial() {

        //Main text in UI
        ui.mainTextPlace.setText("The house has been completely destroyed." +
                "\n\n'Well that didn't go quite as planned.'" +
                "\n\nYou turn to see them looking at you..." +
                "\n\nThat definitely attracted some attention");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseOut";
        game.position2 = "";
        game.position3 = "";

    }


    public void houseOut() {

        //Main text in UI
        ui.mainTextPlace.setText("One by one they start to run at you." +
                "\n\nYou know you need to make a quick decision.");

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("Run");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageFight";
        game.position2 = "villageRun";
        game.position3 = "";

    }

    public void villageLookWindow() {

        //Main text in UI
        ui.mainTextPlace.setText("You peer through the window just to the side of" +
                "\nthe door." +
                "\n\nYou see something but the dust makes it hard to" +
                "\nsee.");

        // Buttons
        ui.choice1.setText("Wipe");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseWipe";
        game.position2 = "";
        game.position3 = "";

    }

    public void houseWipe() {

        //Main text in UI
        ui.mainTextPlace.setText("Something crashes through the window!" +
                "\n\nIt grabs you, biting and scratching." +
                "\n\nYou lose 1 health" +
                "\n\nYou fall back onto the ground and throw it off." +
                "\n\n'Was that a child?! That is a child no more.' ");

        clip = new SoundEffects();
        clip.PlaySound("windowShatter.wav");

        // Re-assigning player health
        player.playerHealth = player.playerHealth - 1;

        // Buttons
        ui.choice1.setText("Stand");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseStand";
        game.position2 = "";
        game.position3 = "";

    }

    public void houseStand() {

        //Main text in UI
        ui.mainTextPlace.setText("You stand up and ready your sword." +
                "\n\nThe noise from that attack seems to have" +
                "\nattracted some unwanted attention." +
                "\n\nThe bodies around the village have started to" +
                "\nrise." +
                "\n\n'This is bad...'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseOut";
        game.position2 = "";
        game.position3 = "";

    }


    public void villageFight() {

// Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieNoise.wav");

        enemy = new Enemy("Undead", 5);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "attackVillageFight";
        game.position2 = "usePotionVillageFight";
        game.position3 = "useSpecialVillageFight";

    }

    public void attackVillageFight() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length) + 1;
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageFightAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageFight2";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void villageFightAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieGrunt.wav");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("Special");

            // button assign
            game.position1 = "attackVillageFight";
            game.position2 = "usePotionVillageFight";
            game.position3 = "useSpecialVillageFight";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winVillageFightBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("");


        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionVillageFight(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // Button assign
        game.position1 = "attackVillageFight";
        game.position2 = "usePotionVillageFight";
        game.position3 = "useSpecialVillageFight";
    }

    public void useSpecialVillageFight(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "useSpecialVillageFight2";
        game.position2 = "";
        game.position3 = "";
    }

    public void useSpecialVillageFight2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "specialVillageFightResult";
        game.position2 = "";
        game.position3 = "";
    }


    public void specialVillageFightResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageStory";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageStory";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "villageStory";
            game.position2 = "";
            game.position3 = "";
        }


    }

    public void villageFight2() {


        enemyRemaining = enemyRemaining - 1;

        //Main text in UI
        ui.mainTextPlace.setText("There are too many of them, they keep coming." +
                "\n\nEnemy remaining: " + enemyRemaining );

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageFight";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStory() {

        //Main text in UI
        ui.mainTextPlace.setText("You have decimated all the undead." +
                "\n\nHeat rises from the skin on your arms." +
                "\n\n'That was intense.'" +
                "\n\nYou sit down on the ground, exhausted from" +
                "\nthat attack." +
                "\n\n'Something moves in the corner of your eye.." +
                "\n\n'Not again...''");

        // Buttons
        ui.choice1.setText("Look");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizen";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizen() {

        //Main text in UI
        ui.mainTextPlace.setText("You see an old man looking at you from behind a barrel." +
                "\n\nIs he alive?!");

        // Buttons
        ui.choice1.setText("Call out");
        ui.choice2.setText("Do nothing");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenCall";
        game.position2 = "villageStoryCitizenNothing";
        game.position3 = "";

    }

    public void villageStoryCitizenNothing() {

        //Main text in UI
        ui.mainTextPlace.setText("You sit still and watch." +
                "\n\nThe old man slowly comes from behind the barrel." +
                "\n\nHis mouth pops open..." +
                "\n\n'Why hello there!' he says with a cheerful tone.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenCall3";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizen2() {

        //Main text in UI
        ui.mainTextPlace.setText("' You're alive?!'");

        // Buttons
        ui.choice1.setText("Call out");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenCall";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizenCall() {

        //Main text in UI
        ui.mainTextPlace.setText("'Hey old man!'");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenCall2";
        game.position2 = "";
        game.position3 = "";

    }
    public void villageStoryCitizenCall2() {

        //Main text in UI
        ui.mainTextPlace.setText("'Who r' ya callin old, boy?'" +
                "\n\n'You're alive?!' you gasp." +
                "\n\n'Well o' course I am. Haven't tried to kill you" +
                "\nyet, av I?' he replies." +
                "\n\n'But how have you stayed alive?' you ask." +
                "\n\n'I hid in me basement. But when i heard you" +
                "\nmakin all that commotion I came to see.'");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenCall3";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizenCall3() {

        //Main text in UI
        ui.mainTextPlace.setText("'I been hidin in me basement waiting for help.'" +
                "\n\n'I done never seen nobody with powers like that.'" +
                "\n\n'That power you possess. Are you a god?'" +
                "\nhe asks.'");

        // Buttons
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenYes";
        game.position2 = "villageStoryCitizenNo";
        game.position3 = "";

    }

    public void villageStoryCitizenYes() {

        //Main text in UI
        ui.mainTextPlace.setText("'Well i'll be damned! The gods have sent" +
                "\none of their own to save us!'" +
                "\n\n'The world must know this evil will be stopped.'");

        player.setGodStatus(1);

        // Buttons
        ui.choice1.setText("Evil?");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenEvil";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizenNo() {

        //Main text in UI
        ui.mainTextPlace.setText("'Sure looked godly to me, boy.'" +
                "\n\n'But to hear you say no... can't say I aint" +
                "\ndisappointed.'" +
                "\n\n'There is an evil plaguing the land you see.'");

        // Buttons
        ui.choice1.setText("Evil?");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenEvil";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizenEvil() {

        //Main text in UI
        ui.mainTextPlace.setText("'I don't know to much about nothin, but what" +
                "\nI do know about anything I know somthin," +
                "\nyou see?'" +
                "\n\n'Somthin I do know is we were attacked by a" +
                "\nshadow. It killed everyone in it's path, except" +
                "\nthey didn't stay dead.'" +
                "\n\n'Some sort o' magic if I do say so myself.'");

        // Buttons
        ui.choice1.setText("Shadow?");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenShadow";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizenShadow() {

        //Main text in UI
        ui.mainTextPlace.setText("'Yes yes a shadow. Moved like nothin I seen" +
                "\nbefore. It had a dark aura illuminating from it.'" +
                "\n\n'I got a good look at it I did...'" +
                "\n\n'The aura would glow red before the dead would" +
                "\nrise.'" +
                "\n\n'It got to be the cause if I do so say myself.'");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenEnd";
        game.position2 = "";
        game.position3 = "";


    }
    public void villageStoryCitizenEnd() {

        //Main text in UI
        ui.mainTextPlace.setText("'I came here to try and find out what's going on." +
                "\nYou are the only living person i have come across so far.'" +
                "\n\n'Well boy. Seems like you and those powers could" +
                "\nfix this. What's next?' he asks." +
                "\n\nI'm going to head to the next town.' you reply." +
                "\nA friend of mine lives there, Leon.'");

        // Buttons
        ui.choice1.setText("Invite");
        ui.choice2.setText("Leave");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenInvite";
        game.position2 = "villageStoryCitizenLeave";
        game.position3 = "";

    }

    public void villageStoryCitizenInvite() {

        //Main text in UI
        ui.mainTextPlace.setText("'Do you want to come with me, old man? you ask." +
                "\n\n'Keep at it with the old man, boy and the" +
                "\nundead will not be the only thing you need" +
                "\nto worry about.'" +
                "\n\n'But no, I'll only slow yer down.'" +
                "\n\n'Promise to come back and get me, you hear?'");

        // Buttons
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenPromiseYes";
        game.position2 = "villageStoryCitizenPromiseNo";
        game.position3 = "";

    }


    public void villageStoryCitizenLeave() {

        //Main text in UI
        ui.mainTextPlace.setText("'I need to head out. Are you going to be alright" +
                "\nhere old man?'" +
                "\n\n'Yes, yes i'll be fine.' he replied." +
                "\nYou cleared out most of those creatures and i have" +
                "\nenough food in my basement to last a lifetime!" +
                "\n\n'Just promise to come back and get me once all" +
                "\nthis is over.'");

        // Buttons
        ui.choice1.setText("Yes");
        ui.choice2.setText("No");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoryCitizenPromiseYes";
        game.position2 = "villageStoryCitizenPromiseNo";
        game.position3 = "";

    }

    public void villageStoryCitizenPromiseYes() {

        //Main text in UI
        ui.mainTextPlace.setText("'Okay don't forget now.'" +
                "\n\nThe old man walks back to his basement, saying" +
                "\nhe's glad you're alive and mumbling about" +
                "\ncoming back for him." +
                "\n\nHe turns a corner and is out of sight.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageLeaveNo";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoryCitizenPromiseNo() {

        //Main text in UI
        ui.mainTextPlace.setText("'Well How rude. I don't need yer anyways." +
                "\n\nI'll outlive this evil and i'll outlive you!'" +
                "\n\n'Running around blowing things up with lightning.'" +
                "\n\n'You'll blow yer self up before too long. HA!'" +
                "\n\nThe old man walks away mumbling until he" +
                "\nturns a corner and is out of sight.");

        // Buttons
        ui.choice1.setText("Leave");
        ui.choice2.setText("");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageLeaveNo";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageLeaveNo() {

        //Main text in UI
        ui.mainTextPlace.setText("'What a funny old man'. you think to yourself.'" +
                "\n\nYou are glad to find someone who is alive." +
                "\n\n'Hopefully Leon is alive too.'");

        // Buttons
        ui.choice1.setText("Leave");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory13";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageLeave() {

        //Main text in UI
        ui.mainTextPlace.setText("'I need to head out. Are you going to be alright" +
                "\nhere old man?'" +
                "\n\n'Yes yes i'll be fine. You cleared out most of" +
                "\nthose creatures and i have enough food in" +
                "\nmy basement to last a lifetime!" +
                "\n\n'Just promise to come back and get me once all this" +
                "\nis over.'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "continueToMainStory13";
        game.position2 = "";
        game.position3 = "";

    }


    public void villageRun() {

        //Main text in UI
        ui.mainTextPlace.setText("'There are too many to fight head on.' you say to" +
                "\nyourself." +
                "\n\nYou make a run for it out of the village!" +
                "\n\nAs you turn around to run you notice you are" +
                "\nsurrounded." +
                "\n\n'I guess I have no choice...'" +
                "\n\nYou reach for your sword.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseOut";
        game.position2 = "";
        game.position3 = "";

    }

    public void nothing () {

        //Main text in UI
        ui.mainTextPlace.setText("You travel along the path to the village.");

        // Buttons
        ui.choice1.setText("");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "";
        game.position2 = "";
        game.position3 = "";

    }



    public void villageIgnore () {

        //Main text in UI
        ui.mainTextPlace.setText("You decide to ignore it and head into the local" +
                "\nstore." +
                "\n\n'Maybe I can find some supplies in here.'");

        // Buttons
        ui.choice1.setText("Enter");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "villageStore";
        game.position2 = "";
        game.position3 = "enterVillage";

    }

    public void villageStore() {

        //Main text in UI
        ui.mainTextPlace.setText("In the store you find it has been trashed." +
                "\n\nIn the back you find the remains of a villager." +
                "\n\nThey seem to be holding onto something." +
                "\n\n'It is not wise to steal from the dead.' you say" +
                "\nto yourself.");

        // Buttons
        ui.choice1.setText("Take");
        ui.choice2.setText("Leave");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoreTake";
        game.position2 = "villageStoreLeave";
        game.position3 = "";

    }

    public void villageStoreTake() {

        //Main text in UI
        ui.mainTextPlace.setText("You decide to check the corpse remains and" +
                "\nsee what they are holding." +
                "\n\nIt seems to be some sort of necklace." +
                "\n\nAs you reach in and grab it your whole body" +
                "\nbecomes cold." +
                "\n\nYou become disorientated and your surroundings" +
                "\nseem to change.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoreTake2";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoreTake2() {

        //Main text in UI
        ui.mainTextPlace.setText("You have a vision of a shadowy figure rising" +
                "\nfrom a crypt." +
                "\n\nYou see images of people suffering followed by" +
                "\nflashes or darkness." +
                "\n\nYour whole body itches." +
                "\n\nA high pitch screech pierces your ears until you" +
                "\ncannot take it any more.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoreTake3";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoreTake3() {

        //Main text in UI
        ui.mainTextPlace.setText("You scream in pain wishing it would stop." +
                "\n\nThe pain is getting worse." +
                "\n\nJust as you think you're about to die," +
                "\neverything stops and a voice inside your head" +
                "\nwhispers..." +
                "\n\n'Your soul is mine." +
                "\n\nYou collapse unconscious.");

        player.setPlayerSoul(0);

        // Buttons
        ui.choice1.setText("Wake");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "villageStoreWake";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoreWake() {

        //Main text in UI
        ui.mainTextPlace.setText("You wake up, dazed and confused." +
                "\n\n''Ughh what was that?'" +
                "\n\nYou can't help but feel a sense of emptiness." +
                "\n\nYou rise to your feet and notice the necklace" +
                "\non the floor next to a potion." +
                "\n\n'I knew nothing good would come of that'.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "potionCollectStore";
        game.position2 = "";
        game.position3 = "";

    }

    public void villageStoreLeave() {

        //Main text in UI
        ui.mainTextPlace.setText("You decide to head back out.." +
                "\n\nBack outside you see the sky has darkened." +
                "\n\nVisions of death haunt your memories." +
                "\n\nWith each flash of these vivid images you" +
                "\nnotice the bodies around the village start to" +
                "\ntwitch and rise to their feet.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "houseOut";
        game.position2 = "";
        game.position3 = "";

    }



    // Story 12 CITY-------------------------------------------------------------
    public void mainStory12City() {

        //Main text in UI
        ui.mainTextPlace.setText("The city is large. You may have a better chance" +
                "\nof finding answers from someone who is alive." +
                "\n\nOr find more undead...");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "continueToCity";
        game.position2 = "";
        game.position3 = "continueToMainStory12";

    }

    public void continueToCity() {

        //Main text in UI
        ui.mainTextPlace.setText("As you get close to the city you can see the city" +
                "\nhas been badly damaged." +
                "\n\nIt looks like a hard fought war has gone on here." +
                "\n\nYou approach the city gates." +
                "\n\nIt's quiet...");

        // Buttons
        ui.choice1.setText("Enter city");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "enterCity";
        game.position2 = "";
        game.position3 = "mainStory12";

    }

    public void enterCity() {

        //Main text in UI
        ui.mainTextPlace.setText("You enter the city." +
                "\n\nThe city is derelict." +
                "\n\nBefore you can look around a haunting scream" +
                "\n\ntravels through the air.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCity";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCity() {

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("womanScream.wav");

        //Main text in UI
        ui.mainTextPlace.setText(" 'That sounds like the screams of a woman!'" +
                "\n\n 'I must help them, quickly!'" +
                "\n\nYou take off in the direction of the scream." +
                "\n\nRunning through the street you hear the scream" +
                "\nagain, this time much closer.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityWoman";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityWoman() {

        //Main text in UI
        ui.mainTextPlace.setText("As you turn the corner of the street you see a" +
                "\nwoman being cornered by 3 undead!" +
                "\n\nShe needs help, quickly.");

        // Buttons
        ui.choice1.setText("Help");
        ui.choice2.setText("Do nothing");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityHelp";
        game.position2 = "innerCityNothing";
        game.position3 = "";

    }

    public void innerCityHelp() {

        //Main text in UI
        ui.mainTextPlace.setText("Without hesitation you let out a roar and charge" +
                "\nin!" +
                "\n\nYou rush the first enemy and slam into them" +
                "\nsending them flying through the air." +
                "\n\nThe remaining 2 run towards you and attack!");

        // Buttons
        ui.choice1.setText("Counter");
        ui.choice2.setText("Block");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "innerCityCounter";
        game.position2 = "innerCityBlock";
        game.position3 = "innerCitySpecial";

    }

    public void innerCityCounter() {

        //Main text in UI
        ui.mainTextPlace.setText("Before the first enemy can attack you, you dash" +
                "\nforward and strike them down with a forceful" +
                "\nswing of your sword." +
                "\n\nThis leaves you open and the second enemy" +
                "\nslashes at you!" +
                "\n\nYou loose 1 health.");

        // Re-assigning player health
        player.playerHealth = player.playerHealth - 1;
        if(player.playerHealth <= 0){
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityRemainingEnemy";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityBlock() {

        //Main text in UI
        ui.mainTextPlace.setText("Both enemies attack you from each side." +
                "\n\nYou block each attack in quick succession from" +
                "\nleft to right but you lose grip of your sword" +
                "\nfrom the force and drop it." +
                "\n\nThey attack again!" +
                "\n\nYou are defenseless.");

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("Special");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityBlock2";
        game.position2 = "innerCitySpecial";
        game.position3 = "";

    }

    public void innerCityBlock2() {

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("Without a sword you are defenseless." +
                "\n\nYou manage to dodge one attack but the other hits you." +
                "\n\nYou loose 2 health." +
                "\n\nIt's useless to fight without your sword.");

        player.playerHealth = player.playerHealth - 2;
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("Special");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityBlock2";
        game.position2 = "innerCitySpecial";
        game.position3 = "";

    }


    public void innerCitySpecial(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySpecial2";
        game.position2 = "";
        game.position3 = "";
    }

    public void innerCitySpecial2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySpecialAttackResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider
    public void innerCitySpecialAttackResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "innerCitySavedWoman";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("You have been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "innerCitySavedWoman";
            game.position2 = "";
            game.position3 = "";
        }


    }

    public void innerCityRemainingEnemy() {

        //Main text in UI
        ui.mainTextPlace.setText("The remaining enemy charges at you!");

        // Buttons
        ui.choice1.setText("Throw wep");
        ui.choice2.setText("Defend");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "innerCityThrowSword";
        game.position2 = "innerCityDefend2";
        game.position3 = "innerCitySpecial";

    }

    public void innerCityThrowSword() {

        //Main text in UI
        ui.mainTextPlace.setText("You wind you arm back and hurl your sword" +
                "\nThrough the air!" +
                "\n\nIt impales the enemy pinning them to the ground." +
                "\n\nThe first enemy you knocked down rises from the" +
                "\nground and thrusts its sword towards your back!");


        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySaved";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityDefend2() {

        //Main text in UI
        ui.mainTextPlace.setText("You parry the incoming attack and strike" +
                "\nthe enemy down with ease.");



        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySaved";
        game.position2 = "";
        game.position3 = "";

    }


    public void innerCitySaved() {

        //Main text in UI
        ui.mainTextPlace.setText("As the blade is about to pierce you" +
                "\nthe enemy erupts into a ball of flames and turns " +
                "\nto ash." +
                "\n\nYou look around to your surprise and see the" +
                "\nsmoke coming from the woman's hands..." +
                "\n\nThis is no ordinary woman.");


        // Buttons
        ui.choice1.setText("Help");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySavedWoman";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCitySavedWoman() {

        player.setSavedElla(1);

        //Main text in UI
        ui.mainTextPlace.setText("You rush over to the woman and catch her as" +
                "\nshe collapses." +
                "\n\n'Who are you?!'" +
                "\n\nShe lets out a breath of relief." +
                "\n\n'My name is Ella. I am the sorceress of this land...'" +
                "\n\nShe coughs up blood and is starting lose colour" +
                "\nin her skin.");


        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySavedWomanSpeak";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCitySavedWomanSpeak() {

        //Main text in UI
        ui.mainTextPlace.setText("'Please hold on!'" +
                "\nShe doesn't have much time left..." +
                "\n\n'Can you tell me what is happening here?'" +
                "\nThe woman tries to speak but cannot gather" +
                "\nthe energy." +
                "\n\nWith her final breath she manages to whisper..." +
                "\n\n'Calyx. n...n...necroman...'" +
                "\n\nShe has died.");


        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityWomanDied";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityWomanDied() {

        //Main text in UI
        ui.mainTextPlace.setText("'Calyx? Who is that?'" +
                "\n'I should try and find this Calyx for answers.'" +
                "\n\n'It was important enough for Ella to say" +
                "\nwith her dying breath.'" +
                "\n\nBefore you can decide what to do from here" +
                "\nyou see a roaming horde of undead heading" +
                "\ntowards you.");

        // Buttons
        ui.choice1.setText("Run");
        ui.choice2.setText("Special");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityRun";
        game.position2 = "innerCityHordeSpecial";
        game.position3 = "";

    }

    public void innerCityHordeSpecial(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCitySpecial2";
        game.position2 = "";
        game.position3 = "";
    }

    public void innerCityHordeSpecial2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityHordeSpecialResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void innerCityHordeSpecialResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "innerCityHordeDefeat";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("You have been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "innerCityHordeDefeat";
            game.position2 = "";
            game.position3 = "";
        }


    }

    public void innerCityHordeDefeat() {

        //Main text in UI
        ui.mainTextPlace.setText("The power of the gods saved you this time." +
                "\nYou decide to leave the city and head for the city gates.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityBackGate";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityRun() {

        //Main text in UI
        ui.mainTextPlace.setText("You make a brake for it into the side streets." +
                "\n\nWill you go down the left street or the right street?");

        // Buttons
        ui.choice1.setText("Left");
        ui.choice2.setText("Right");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityLeft";
        game.position2 = "innerCityRight";
        game.position3 = "";

    }

    public void innerCityLeft() {

        //Main text in UI
        ui.mainTextPlace.setText("You quickly dash left through the narrow alley." +
                "\n\nThe alley splits again and you can only go left or" +
                "\nright.");

        // Buttons
        ui.choice1.setText("Left");
        ui.choice2.setText("Right");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityAlleyLeft";
        game.position2 = "innerCityAlleyRight";
        game.position3 = "";
    }
    public void innerCityAlleyLeft() {

        //Main text in UI
        ui.mainTextPlace.setText("You dart left but it is blocked by a house." +
                "\n\nYou run at full speed through the door and crash" +
                "\nthrough taking minor damage as you do." +
                "\n\nYou lose 1 health." +
                "\n\nYou happen to see potions on the table and grab" +
                "\nthem as you leave." +
                "\n\nYou receive potion x2!");

        //Re-assigning player health after damage
        player.playerHealth = player.playerHealth -1;
        //Re-assigning health in the UI
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        player.potionCapacity += 2;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityBackGate";
        game.position2 = "";
        game.position3 = "";
    }
    public void innerCityAlleyRight() {

        //Main text in UI
        ui.mainTextPlace.setText("You quickly turn right and crash into a vendor" +
                "\nstall." +
                "\n\nThe stall happens to be full of remedies and" +
                "\npotions!" +
                "\n\nYou receive 2x potion!");

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        player.potionCapacity += 2;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityBackGate";
        game.position2 = "";
        game.position3 = "";
    }

    public void innerCityRight() {

        //Main text in UI
        ui.mainTextPlace.setText("You dash right to avoid the undead." +
                "\nThe long road to the gate is clear!" +
                "\n\nAs you are running towards the gates an undead" +
                "\ncrashes through a house door and attacks you!");

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "cityUndeadBattle";
        game.position2 = "";
        game.position3 = "";

    }

    public void cityUndeadBattle() {

// Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieNoise.wav");

        enemy = new Enemy("Undead", 5);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "attackUndead";
        game.position2 = "usePotionUndead";
        game.position3 = "useSpecialUndead";

    }

    public void attackUndead() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length) + 1;
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "undeadAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winUndeadBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void undeadAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length);
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("zombieGrunt.wav");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("Special");

            // button assign
            game.position1 = "attackUndead";
            game.position2 = "usePotionUndead";
            game.position3 = "useSpecialUndead";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winUndeadBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType() +
                "\n\nYou receive 2x Potion.");

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        player.potionCapacity += 2;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityBackGate";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionUndead(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // Button assign
        game.position1 = "attackUndead";
        game.position2 = "usePotionUndead";
        game.position3 = "useSpecialUndead";
    }

    public void useSpecialUndead(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "useSpecialUndead2";
        game.position2 = "";
        game.position3 = "";
    }

    public void useSpecialUndead2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "specialUndeadResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void specialUndeadResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winUndeadBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winUndeadBattle";
            game.position2 = "";
            game.position3 = "";
        }


    }


    public void innerCityBackGate() {

        //Main text in UI
        ui.mainTextPlace.setText("You make it to the back gates!" +
                "\n\nBefore you can exit you feel the ground shake." +
                "\n\nYou turn around to see a troll come crashing" +
                "\nthrough the houses and coming towards you!" +
                "\n\nReady yourself!");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "cityTrollBattle";
        game.position2 = "";
        game.position3 = "";

    }

    public void cityTrollBattle() {

// Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        enemy = new Enemy("Troll", 15);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "attackTroll";
        game.position2 = "usePotionTroll";
        game.position3 = "useSpecialTroll";

    }

    public void attackTroll() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length) + 1;
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "trollAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTrollBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void trollAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length) + 1;
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("Special");

            // button assign
            game.position1 = "attackTroll";
            game.position2 = "usePotionTroll";
            game.position3 = "useSpecialTroll";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winTrollBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType() + "."
        + "\n\nYou have found leather armour. You now take" +
                "\n\nless damage from enemies.");


        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Loot");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "trollLoot";
        game.position2 = "";
        game.position3 = "";
    }

    public void trollLoot(){

        clip = new SoundEffects();
        clip.PlaySound("");

        player.potionCapacity += 1;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        //Main text in UI
        ui.mainTextPlace.setText("        *******************" +
                "\n        *                                *" +
                "\n        *   You receive loot:    *" +
                "\n        *                                *" +
                "\n        *   Leather Arm x1       *" +
                "\n        *   (Max HP + 2)   *" +
                "\n        *                                *" +
                "\n        *   Potion x1               *" +
                "\n        *                                *" +
                "\n        *******************");

        player.playerHealth = player.playerHealth + 2;
        player.playerMaxHealth += 2;

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "leaveCity";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionTroll(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // Button assign
        game.position1 = "attackTroll";
        game.position2 = "usePotionTroll";
        game.position3 = "useSpecialTroll";
    }

    public void useSpecialTroll(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "useSpecialUndead2";
        game.position2 = "";
        game.position3 = "";
    }

    public void useSpecialTroll2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "specialTrollResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void specialTrollResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTrollBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTrollBattle";
            game.position2 = "";
            game.position3 = "";
        }


    }

    public void innerCityNothing() {

        //Main text in UI
        ui.mainTextPlace.setText("You decide to do nothing and slip away" +
                "\nwhile the undead monsters are distracted." +
                "\n\nAs you move over to the next street the screams" +
                "\ngradually fade and suddenly stop." +
                "\n\nHer screams will haunt you forever...");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityRoam";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityRoam() {

        //Main text in UI
        ui.mainTextPlace.setText("You decide look around. Careful as not to" +
                "\nattract any unwanted attention." +
                "\n\nYou slip between houses looking for some sign of" +
                "\nlife." +
                "\n\nYou come across the city church. The graves in" +
                "\nthe graveyard accompanying it have all been dug" +
                "\nup." +
                "\n\nWill you enter?");

        // Buttons
        ui.choice1.setText("Church");
        ui.choice2.setText("Continue");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurch";
        game.position2 = "innerCityChurchMake";
        game.position3 = "";

    }

    public void innerCityChurchMake() {

        //Main text in UI
        ui.mainTextPlace.setText("As you go to walk past you feel drawn to it." +
                "\n\nYou think to yourself, 'Am i sure i don't want to" +
                "\ngo in?'");

        // Buttons
        ui.choice1.setText("Church");
        ui.choice2.setText("Continue");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurch";
        game.position2 = "innerCityChurchMake2";
        game.position3 = "";

    }

    public void innerCityChurchMake2() {

        //Main text in UI
        ui.mainTextPlace.setText("The overwhelming urge to enter is too much." +
                "\n\nYou enter the church.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurch";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityChurch() {

        //Main text in UI
        ui.mainTextPlace.setText("The church hall is tall." +
                "\n\nBroken benches lay on the floor and blood" +
                "\nstains the walls." +
                "\n\nAs you walk towards the altar the room starts to" +
                "\ndim. Light fades and a feeling of dread" +
                "\nencumbers you.." +
                "\n\nA shadowy figure seems to be standing at by the altar.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("Leave");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurchSpeak";
        game.position2 = "innerCityChurchLeave";
        game.position3 = "";

    }

    public void innerCityChurchLeave() {

        //Main text in UI
        ui.mainTextPlace.setText("You can't bring yourself to leave.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurchSpeak";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityChurchSpeak() {

        //Main text in UI
        ui.mainTextPlace.setText("'Who are you?'" +
                "\n\nThe shadowy figure replies in a long and strained" +
                "\nvoice: 'Death'" +
                "\n\nSuddenly you start to feel how empty this room is." +
                "\n\nFog comes from your breath as the air turns ice" +
                "\ncold.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurchSpeak2";
        game.position2 = "";
        game.position3 = "";

    }

    public void innerCityChurchSpeak2() {

        //Main text in UI
        ui.mainTextPlace.setText("'Why are you here? What has happened to this" +
                "\nland?!" +
                "\n\nThe shadowy figure does not respond" +
                "\n\nYou reach for your sword..." +
                "\n\n'ANSWER ME!'");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("Attack");
        ui.choice3.setText("Special");

        // button assign
        game.position1 = "innerCityChurchSpeak3";
        game.position2 = "innerCityChurchAttack";
        game.position3 = "innerCityChurchSpecial";

    }

    public void innerCityChurchSpecial() {

        //Main text in UI
        ui.mainTextPlace.setText("You are unable to summon the power of the gods.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("Attack");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurchSpeak3";
        game.position2 = "innerCityChurchAttack";
        game.position3 = "";

    }

    public void innerCityChurchAttack() {

        //Main text in UI
        ui.mainTextPlace.setText("You draw your sword and leap forward" +
                "\nswinging it overhead at the shadowy figure." +
                "\n\nYour sword strikes down and crashes against some" +
                "\nsort of barrier, stopping just before the shadowy" +
                "\nfigure." +
                "\n\nA burst of energy erupts throwing you back into" +
                "\nthe middle of the room." +
                "\n\nAs your back hits the floor the shadowy figure lets out" +
                "\na screech and the shadow morphs and manifests over you.");

        // Buttons
        ui.choice1.setText("Speak");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityChurchSpeak3";
        game.position2 = "";
        game.position3 = "";

    }


    public void innerCityChurchSpeak3() {

        //Main text in UI
        ui.mainTextPlace.setText("Before you can speak all light escapes the hall." +
                "\n\nYou cannot see." +
                "\n\nA whisper in your right ear..." +
                "\n\nI'm alive as you but without breath," +
                "\nAs cold in my life as in my death." +
                "\nNever a thirst though i always drink," +
                "\nDressed in mail but never clink." +
                "\n\nThe darkness fades and the shadowy figure is" +
                "\ngone.");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "leaveCityLeaveChurch";
        game.position2 = "";
        game.position3 = "";

    }

    public void leaveCityLeaveChurch() {

        //Main text in UI
        ui.mainTextPlace.setText("'What does that even mean? Is it some sort of" +
                "\nriddle?'" +
                "\n\n'Seems odd that whatever that was, stopped by" +
                "\nto tell me a riddle...'" +
                "\n\nThe back door of the church busts open and" +
                "\nundead come pouring in!");

        // Buttons
        ui.choice1.setText("Run");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "innerCityRun";
        game.position2 = "";
        game.position3 = "";

    }


    public void leaveCity() {

        //Main text in UI
        ui.mainTextPlace.setText("You leave the city through the gates." +
                "\n\n'The city is over run. It's certain death if" +
                "\nI stay there any longer.'" +
                "\n\n'The next town is a few miles north from here.'" +
                "\n\n'My good friend Leon lives there'.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "mainStory13Road";
        game.position2 = "";
        game.position3 = "";

    }


    // ----------------------------------- Main Story 13 ----------------------------------------------
    public void mainStory13() {

        //Main text in UI
        ui.mainTextPlace.setText("You head off to try and find Leon." +
                "\n\nWhile traveling you wonder if Leon is alive." +
                "\n\nYou can't help but think the worst." +
                "\n\n'So far everything has been destroyed.'" +
                "\n\n'What is behind all this?'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "roadToLeon";
        game.position2 = "";
        game.position3 = "";

    }

    public void roadToLeon() {

        //Main text in UI
        ui.mainTextPlace.setText("Some time down the path you come to a cross road." +
                "\n\nThere is no sign post but you know that forward" +
                "\nleads to Leon.");

        // Buttons
        ui.choice1.setText("Choose");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "leonCrossRoad";
        game.position2 = "";
        game.position3 = "continueToMainStory13";

    }

    public void leonCrossRoad() {

        //Main text in UI
        ui.mainTextPlace.setText("'Hmm which way shall i go?'");

        // Buttons
        ui.choice1.setText("Forward");
        ui.choice2.setText("Left");
        ui.choice3.setText("Right");

        // button assign
        game.position1 = "crossRoadForward";
        game.position2 = "crossRoadLeft";
        game.position3 = "crossRoadRight";

    }

    public void crossRoadForward() {

        //Main text in UI
        ui.mainTextPlace.setText("THIS LEADS TO LEON");

        // Buttons
        ui.choice1.setText("Forward");
        ui.choice2.setText("Left");
        ui.choice3.setText("Right");

        // button assign
        game.position1 = "crossRoadForward";
        game.position2 = "crossRoadLeft";
        game.position3 = "crossRoadRight";

    }

    public void crossRoadLeft() {

        //Main text in UI
        ui.mainTextPlace.setText("THIS LEADS LEFT");

        // Buttons
        ui.choice1.setText("Forward");
        ui.choice2.setText("Left");
        ui.choice3.setText("Right");

        // button assign
        game.position1 = "crossRoadForward";
        game.position2 = "crossRoadLeft";
        game.position3 = "crossRoadRight";

    }

    public void crossRoadRight() {

        //Main text in UI
        ui.mainTextPlace.setText("You head right." +
                "\n\nThe path veers off and bends around a lake" +
                "\nand into the forest." +
                "\n\nYou come to the edge of the forest." +
                "\n\nThe trees tower over you making the whole forest dark." +
                "\n\nAn strange moan travels along the wind.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "enterForest";
        game.position2 = "";
        game.position3 = "leonCrossRoad";

    }

    public void enterForest() {

        //Main text in UI
        ui.mainTextPlace.setText("You cautiously make your way deeper into" +
                "\nthe forest." +
                "\n\nYou feel as though you are being watched." +
                "\n\nTrying to stay on the faded path, you come" +
                "\nacross an old sign." +
                "\n\nIt reads:" +
                "\n\nThe Witch, The Witch & The Witch.");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "forestSign";
        game.position2 = "-";
        game.position3 = "-";

    }

    public void forestSign() {

        //Main text in UI
        ui.mainTextPlace.setText("'A witch?!' you say to yourself." +
                "\n'My past experiences with witches have" +
                "\nnever ended pleasantly.'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("Back");

        // button assign
        game.position1 = "forestWitchProtector";
        game.position2 = "";
        game.position3 = "enterForest";

    }

    public void forestWitchProtector() {

        //Main text in UI
        ui.mainTextPlace.setText("what little path there was disappears and" +
                "\nis not just forest floor." +
                "\n\nYou see a small hut, hidden between the trees." +
                "\n\nBefore you can take another step one of the trees" +
                "\ncomes to life and blocks your path!");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "forestProtectorSpeak";
        game.position2 = "";
        game.position3 = "";

    }

    public void forestProtectorSpeak() {

        //Main text in UI
        ui.mainTextPlace.setText("'Leaf this place intruder!'" +
                "'To see the witches three you have to get through me.'");

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "forestProtectorFight";
        game.position2 = "";
        game.position3 = "";

    }

    public void forestProtectorFight() {

        enemy = new Enemy("Ent", 20);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("Run");

        // button assign
        game.position1 = "entBattle";
        game.position2 = "";
        game.position3 = "entRun";

    }

    public void entRun() {

        enemy = new Enemy("Ent", 20);

        //Main text in UI
        ui.mainTextPlace.setText("You run into a " + enemy.getType() + "!\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Buttons
        ui.choice1.setText("Fight");
        ui.choice2.setText("-");
        ui.choice3.setText("Run");

        // button assign
        game.position1 = "entBattle";
        game.position2 = "";
        game.position3 = "entRun";

    }

    public void entBattle() {

        // Assigning player attack value and re-assigning enemy health
        player.playerAttack = player.rand.nextInt(player.attackValues.length) + 1;
        enemy.enemyHealth = enemy.enemyHealth - player.getPlayerAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("swordAttack.wav");

        //Main text in UI
        ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: " + enemy.getEnemyHealth());

        // Statements to catch enemy death
        if (enemy.getEnemyHealth() > 0) {
            ui.choice1.setText("Defend");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "trollAttack";
            game.position2 = "";
            game.position3 = "";
        } else {
            // Setting health to 0 to stop displaying negative numbers
            ui.mainTextPlace.setText("You attack for: " + player.playerAttack + "\n\n" + enemy.getType() + " HP: 0");
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTrollBattle";
            game.position2 = "";
            game.position3 = "";
        }
    }

    public void trollAttack(){

        // Assigning enemy attack value and re-assigning player health
        enemy.enemyAttack = enemy.rand.nextInt(enemy.attackValues.length) + 1;
        player.playerHealth = player.playerHealth - enemy.getEnemyAttack();

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("");

        //Main text in UI
        ui.mainTextPlace.setText("The " + enemy.getType() + " attacks you for: " + enemy.getEnemyAttack());
        // Re-assigning player health
        ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));

        // statements to catch player death
        if(player.getPlayerHealth() > 0){
            // Buttons
            ui.choice1.setText("Attack");
            ui.choice2.setText("Potion");
            ui.choice3.setText("Special");

            // button assign
            game.position1 = "attackTroll";
            game.position2 = "usePotionTroll";
            game.position3 = "useSpecialTroll";
        }
        else{
            // Setting health to 0 to stop displaying negative numbers
            ui.hpLabelNum.setText(Integer.toString(0));
            // Buttons
            ui.choice1.setText(">");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }

    }

    public void winTrollBattle(){

        //Main text in UI
        ui.mainTextPlace.setText("You have slain the " + enemy.getType() + "."
                + "\n\nYou have found leather armour. You now take" +
                "\n\nless damage from enemies.");


        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("winFight.wav");

        // Buttons
        ui.choice1.setText("Loot");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "trollLoot";
        game.position2 = "";
        game.position3 = "";
    }

    public void trollLoot(){

        clip = new SoundEffects();
        clip.PlaySound("");

        player.potionCapacity += 1;
        ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

        clip = new SoundEffects();
        clip.PlaySound("potionCollect.wav");

        //Main text in UI
        ui.mainTextPlace.setText("        *******************" +
                "\n        *                                *" +
                "\n        *   You receive loot:    *" +
                "\n        *                                *" +
                "\n        *   Leather Arm x1       *" +
                "\n        *   (Max HP + 2)   *" +
                "\n        *                                *" +
                "\n        *   Potion x1               *" +
                "\n        *                                *" +
                "\n        *******************");

        player.playerHealth = player.playerHealth + 2;
        player.playerMaxHealth += 2;

        // Buttons
        ui.choice1.setText("Continue");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "leaveCity";
        game.position2 = "";
        game.position3 = "";
    }

    public void usePotionTroll(){

        if (player.potionCapacity > 0) {
            //Re-assigning player health
            player.playerHealth += 5;
            ui.hpLabelNum.setText(Integer.toString(player.getPlayerHealth()));
            player.potionCapacity -= 1;
            ui.potionCapNum.setText(Integer.toString(player.potionCapacity));

            ui.mainTextPlace.setText("You use a potion!");


        } else {
            ui.mainTextPlace.setText("You have " + player.getPotionCapacity() + " potions.");

        }

        // Buttons
        ui.choice1.setText("Attack");
        ui.choice2.setText("Potion");
        ui.choice3.setText("Special");

        // Button assign
        game.position1 = "attackTroll";
        game.position2 = "usePotionTroll";
        game.position3 = "useSpecialTroll";
    }

    public void useSpecialTroll(){

        //Main text in UI
        ui.mainTextPlace.setText("The sky growls and lights up." +
                "\n\nA blue surge runs through your veins." +
                "\n\nYou throw your sword into the air.");


        // Buttons
        ui.choice1.setText("Strike");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "useSpecialUndead2";
        game.position2 = "";
        game.position3 = "";
    }

    public void useSpecialTroll2(){

        //Main text in UI
        ui.mainTextPlace.setText("You catch your sword and slam it into the ground." +
                "\n\nLightning comes crashing down around you.");

        // Sound effect
        clip = new SoundEffects();
        clip.PlaySound("specialAttack.wav");

        // Buttons
        ui.choice1.setText(">");
        ui.choice2.setText("-");
        ui.choice3.setText("-");

        // button assign
        game.position1 = "specialTrollResult";
        game.position2 = "";
        game.position3 = "";
    }

    // Special attack Random decider (Guaranteed to be successful this instance)
    public void specialTrollResult() {

        if(player.specialAttack == 0){


            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTrollBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else if(player.specialAttack == 1){

            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "loseBattle";
            game.position2 = "";
            game.position3 = "";
        }
        else{
            //Main text in UI
            ui.mainTextPlace.setText("The enemy has been obliterated.");

            // Buttons
            ui.choice1.setText("Continue");
            ui.choice2.setText("-");
            ui.choice3.setText("-");

            // button assign
            game.position1 = "winTrollBattle";
            game.position2 = "";
            game.position3 = "";
        }


    }




}
