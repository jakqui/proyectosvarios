package com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.factory;

import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.armor.Armor;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.enemy.Enemy;
import com.proyectosdesarrollo.patronesdiseno.creacionales.abstractfactory.weapon.Weapon;

public abstract class EnemyAbstractFactory {
    public abstract Enemy createEnemy();
    public abstract Armor createArmor();
    public abstract Weapon createWeapon();
}
