package com.company;


import java.util.Random;
// class
public class Enemy {

    String type;
    int enemyHealth;
    int attackValues[] = {0, 1, 2, 3, 4, 5};

    Random rand = new Random();

    int enemyAttack = rand.nextInt(attackValues.length);



    public Enemy(String type, int enemyHealth) {
        this.type = type;
        this.enemyHealth = enemyHealth;
    }

    ///////////////////////// Getters and setters//////////////////////

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyAttack() {
        return enemyAttack;
    }

    public void setEnemyAttack(int enemyAttack) {
        this.enemyAttack = enemyAttack;
    }
}