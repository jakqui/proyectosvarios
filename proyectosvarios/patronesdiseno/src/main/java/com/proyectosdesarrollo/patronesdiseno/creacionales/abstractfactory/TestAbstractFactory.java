package com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory;

import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.armor.Armor;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Enemy;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.factory.EnemyAbstractFactory;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.factory.MageFactory;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.factory.WarriorFactory;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.weapon.Weapon;

public class TestAbstractFactory {
    public static void main(String[] args) {
        EnemyAbstractFactory factory = new WarriorFactory();
        Enemy warrior = factory.createEnemy();
        Armor HeavyArmor = factory.createArmor();
        Weapon axe = factory.createWeapon();
        warrior.attack();
        HeavyArmor.protect();
        axe.damage();


        factory = new MageFactory();
        Enemy mage = factory.createEnemy();
        Armor robe = factory.createArmor();
        Weapon wizardStaff = factory.createWeapon();
        mage.attack();
        robe.protect();
        wizardStaff.damage();


    }
}
