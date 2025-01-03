package com.proyectosdesarrollo.patronesdiseno.creacionales.factory;

public class TestFactory {
    public static void main(String[] args) {
        EnemyFactory enemyFactory = new EnemyFactory();
        Enemy warrior = enemyFactory.creaEnemy("warrior");
        Enemy mage = enemyFactory.creaEnemy("mage");
        warrior.attack();
        mage.attack();
    }
}
