package com.company;

/**
 * created by s.a.miroshnychenko 9/3/2018
 */

public class EnahancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnahancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player died");
        }
    }

    public int getHealth() {
        return health;
    }
}
