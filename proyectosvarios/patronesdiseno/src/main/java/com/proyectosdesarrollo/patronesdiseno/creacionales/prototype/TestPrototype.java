package com.proyectosdesarrollo.patronesdiseno.creacionales.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Enemy enemy1 = new Enemy(100, 100);
        Enemy enemy2 = enemy1;
        Enemy enemy3 = enemy1;
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
        System.out.println("=========");
        enemy2.setHealth(0);
        System.out.println(enemy1);
        System.out.println(enemy2);
        System.out.println(enemy3);
    }
}
