package com.company;

/**
 * created by s.a.miroshnychenko 9/3/2018
 */

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player died");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
