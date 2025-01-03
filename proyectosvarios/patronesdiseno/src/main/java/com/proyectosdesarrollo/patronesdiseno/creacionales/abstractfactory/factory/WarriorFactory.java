package com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.factory;

import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.armor.Armor;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.armor.HeavyArmor;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Enemy;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Warrior;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.weapon.Axe;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.weapon.Weapon;

public class WarriorFactory extends EnemyAbstractFactory{

    @Override
    public Enemy createEnemy() {
        return new Warrior();
    }

    @Override
    public Armor createArmor() {
        return new HeavyArmor();
    }

    @Override
    public Weapon createWeapon() {
        return new Axe();
    }

}
