package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter;

public class ZombieAdapter implements Enemy {
    //CLASE INTERMEDIA QUE ADAPTA LA CLASE ZOMBIE A LA INTERFAZ ENEMY
    private Zombie zombie; 

    public ZombieAdapter(){
        this.zombie = new Zombie();
    }

    @Override
    public void attack() {
        int value = (int) Math.random() * 10;
        if(value % 2 == 0)
            zombie.bite();
        else    
            zombie.hit();
    }

    @Override
    public void damage() {
        int value = (int) Math.random() * 10;
        if(value % 2 == 0)
            zombie.headDamage();
        else    
            zombie.bodyDamage();
    }

}
