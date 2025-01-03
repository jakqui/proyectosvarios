package com.proyectosdesarrollo.patronesdiseno.creacionales.factorymethod;

public class MageFactory extends EnemyFactory{

    @Override
    public Enemy creaEnemy() {
        return new Mage();
    }

}
