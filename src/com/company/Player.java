package com.company;

import java.util.Random;
import java.util.Scanner;

//class
public class Player {

    // Variables
    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    String playerName;
    int playerHealth;
    int playerMaxHealth;
    int playerAttack;
    int potionCapacity;
    int[] attackValues = {0, 1, 2, 3, 4, 5};
    int[] specialAttackValues = {0, 1, 2};
    int[] shieldBlockChance = {0,1,2,3,4};
    int potion = 5;
    int shieldBlock;
    boolean upgradeAttack = false;
    boolean upgradeSpecial = false;

    // Player states for story change
    int necklaceOfLife = 0;
    int savedElla = 0;
    int godStatus = 0;
    int playerSoul = 0;
    int shadowyFigure = 0;
    int defeatGuardian = 0;
    int witchCounter = 0;
    int merchantLie = 0;
    int merchantItem = 0;
    int fishItem = 0;
    int shield = 0;

    // Random value generators
    int specialAttack = rand.nextInt(specialAttackValues.length);
    int shieldValue = rand.nextInt(shieldBlockChance.length);

    //Random potion heal  (not used)
    //int potionAmount = rand.nextInt(potion.length);



    // Getters and setters

    public String getPlayerName() {
        return playerName;
    }

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
        System.out.println("You have " + potionCapacity + " potions.");
        ;
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

    public int getPlayerMaxHealth() {
        return playerMaxHealth;
    }

    public void setPlayerMaxHealth(int playerMaxHealth) {
        this.playerMaxHealth = playerMaxHealth;
    }

    public int getNecklaceOfLife() {
        return necklaceOfLife;
    }

    public void setNecklaceOfLife(int necklaceOfLife) {
        this.necklaceOfLife = necklaceOfLife;
    }

    public int getSavedElla() {
        return savedElla;
    }

    public void setSavedElla(int savedElla) {
        this.savedElla = savedElla;
    }

    public int getShadowyFigure() {
        return shadowyFigure;
    }

    public void setShadowyFigure(int shadowyFigure) {
        this.shadowyFigure = shadowyFigure;
    }

    public int getGodStatus() {
        return godStatus;
    }

    public void setGodStatus(int godStatus) {
        this.godStatus = godStatus;
    }

    public int getPlayerSoul() {
        return playerSoul;
    }

    public void setPlayerSoul(int playerSoul) {
        this.playerSoul = playerSoul;
    }

    public int getDefeatGuardian() {
        return defeatGuardian;
    }

    public void setDefeatGuardian(int defeatGuardian) {
        this.defeatGuardian = defeatGuardian;
    }

    public int getWitchCounter() {
        return witchCounter;
    }

    public void setWitchCounter(int witchCounter) {
        this.witchCounter = witchCounter;
    }

    public int getMerchantLie() {
        return merchantLie;
    }

    public void setMerchantLie(int merchantLie) {
        this.merchantLie = merchantLie;
    }

    public int[] getShieldBlockChance() {
        return shieldBlockChance;
    }

    public void setShieldBlockChance(int[] shieldBlockChance) {
        this.shieldBlockChance = shieldBlockChance;
    }

    public int getMerchantItem() {
        return merchantItem;
    }

    public void setMerchantItem(int merchantItem) {
        this.merchantItem = merchantItem;
    }

    public int getFishItem() {
        return fishItem;
    }

    public void setFishItem(int fishItem) {
        this.fishItem = fishItem;
    }

    public int getShield() {
        return shield;
    }

    public void setShield(int shield) {
        this.shield = shield;
    }

    public int getShieldValue() {
        return shieldValue;
    }

    public void setShieldValue(int shieldValue) {
        this.shieldValue = shieldValue;
    }
}


