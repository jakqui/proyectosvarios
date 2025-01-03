package com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.factory;

import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.armor.Armor;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.armor.Robe;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Enemy;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Mage;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.weapon.Weapon;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.weapon.WizarsStaff;

public class MageFactory extends EnemyAbstractFactory{

    @Override
    public Enemy createEnemy() {
        return new Mage();
    }

    @Override
    public Armor createArmor() {
        return new Robe();
    }

    @Override
    public Weapon createWeapon() {
        return new WizarsStaff();
    }

}
