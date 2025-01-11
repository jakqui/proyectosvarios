package com.proyectosdesarrollo.patronesdiseno.estructurales.decorator;

import com.proyectosdesarrollo.patronesdiseno.creacionales.factorymethod.Warrior;
import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.decorator.AssassinEnemyDecorator;
import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.decorator.MageEnemyDecorator;
import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.decorator.WarriorEnemyDecorator;
import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.race.Elf;
import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.race.Human;

public class TestDecorator {
    public static void main(String[] args) {
        System.out.println("============ HUMAN WARRIOR ============");
        Enemy humanWarrior = new WarriorEnemyDecorator(new Human());
        humanWarrior.attack();

        System.out.println("============ HUMAN WARRIOR MAGE============");
        Enemy humanWarriorMage = new WarriorEnemyDecorator(new MageEnemyDecorator(new Human()));
        humanWarriorMage.attack();

        System.out.println("============ Elf WARRIOR MAGE Assassin============");
        Enemy elfWarriorMageAssasion = new AssassinEnemyDecorator(
            new MageEnemyDecorator(
                new WarriorEnemyDecorator(
                    new Elf()
                )
            )
        );
        elfWarriorMageAssasion.attack();
    }
}
