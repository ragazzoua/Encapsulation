package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        Player player = new Player();
//
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Ramaining health = " + player.healthRemaining());
//
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Ramaining health = " + player.healthRemaining());

        EnahancedPlayer player = new EnahancedPlayer("Tim",50,"Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
