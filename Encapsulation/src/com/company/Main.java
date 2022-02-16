package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health " + player.healthRemaining());
//        damage = 11;
//
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("remaining health " + player.healthRemaining());

        EnchancedPlayer player = new EnchancedPlayer("Sam",50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
