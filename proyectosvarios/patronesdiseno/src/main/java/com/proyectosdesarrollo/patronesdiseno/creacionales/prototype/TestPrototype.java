package com.proyectosdesarrollo.patronesdiseno.creacionales.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        /*Enemy enemy1 = new Enemy(100, 100);
        Enemy enemy2 = enemy1.clone();//new Enemy(enemy1.getHealth(), enemy1.getDamage());
        Enemy enemy3 = new Enemy();
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
        System.out.println("=========");
        enemy2.setHealth(0);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);*/

        Warrior warrior1 = new Warrior(100, 100, 100);
        Warrior warrior2 = (Warrior) warrior1.clone();
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("=========");
        warrior2.setHealth(0);
        System.out.println(warrior1);
        System.out.println(warrior2);
        System.out.println("======================================================");
        Mage mage1 = new Mage(100, 100, 100);
        Mage mage2 = (Mage) mage1.clone();
        System.out.println(mage1);
        System.out.println(mage2);
        System.out.println("=========");    
        mage2.setHealth(0);
        System.out.println(mage1);
        System.out.println(mage2);
    }
}
