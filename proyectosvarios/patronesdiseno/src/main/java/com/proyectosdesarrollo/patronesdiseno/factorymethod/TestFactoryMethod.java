package com.proyectosdesarrollo.patronesdiseno.factorymethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Enemy warrior = new WarriorFactory().creaEnemy();
        Enemy mage = new MageFactory().creaEnemy();
        warrior.attack();
        mage.attack();
    }
}
