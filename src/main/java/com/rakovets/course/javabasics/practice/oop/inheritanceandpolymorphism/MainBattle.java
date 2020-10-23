package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

public class MainBattle {
    public static void main(String[] args) {
        Hero warrior = new Warrior("a");
        warrior.setHeath(1000);
        Zombie zombie = new Zombie(200);
        for (int i = 1; warrior.isAlive(); i++) {
            if (zombie.isAlive() == false) {
                ((Zombie) zombie).reincarnation();
                System.out.println("zombie reincarnated");
            }
            warrior.attackEnemy(zombie);
            if (zombie.enemyHealth < (-50)) {
                System.out.println("zombie is down");
                break;
            }
            zombie.attackHero(warrior);
            System.out.println("zombie HP: " + zombie.enemyHealth + ", Hero HP: " + warrior.heroHealth);

        }
        if (warrior.isAlive()){
            System.out.println("Hero won");
        }else{
            System.out.println("Hero is down");
        }
    }
}
