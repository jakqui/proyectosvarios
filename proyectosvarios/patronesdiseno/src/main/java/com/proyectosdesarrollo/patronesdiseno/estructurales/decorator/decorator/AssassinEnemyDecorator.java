package com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.decorator;

import com.proyectosdesarrollo.patronesdiseno.estructurales.decorator.Enemy;

public class AssassinEnemyDecorator extends EnemyDecorator{

    public AssassinEnemyDecorator(Enemy enemy) {
        super(enemy);
    }

    @Override
    public void attack() {
        enemy.attack();
        System.out.println("Assassin attack");
    }

}
