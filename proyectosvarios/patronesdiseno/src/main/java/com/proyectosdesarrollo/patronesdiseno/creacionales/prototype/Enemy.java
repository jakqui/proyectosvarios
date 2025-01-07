package com.proyectosdesarrollo.patronesdiseno.creacionales.prototype;

public abstract class Enemy {
    protected int health;
    protected int damage;

    //CONSTRUCTOR QUE SE CONTIENE A SÍ MISMO
    public Enemy(Enemy enemy) {
        if(enemy != null) {
            setHealth(enemy.getHealth());
            setDamage(enemy.getDamage());
        }
    }
    
    public Enemy(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public abstract Enemy clone();
    
}
