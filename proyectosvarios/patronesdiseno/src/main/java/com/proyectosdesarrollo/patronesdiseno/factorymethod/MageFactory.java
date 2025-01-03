package com.proyectosdesarrollo.patronesdiseno.factorymethod;

public class MageFactory extends EnemyFactory{

    @Override
    public Enemy creaEnemy() {
        return new Mage();
    }

}
