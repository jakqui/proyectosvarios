package com.proyectosdesarrollo.patronesdiseno.creacionales.prototype;

public class Enemy {
    private int health;
    private int damage;
    
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

    @Override
    public String toString() {
        return "Enemy [health=" + health + ", damage=" + damage + "]";
    }
    
}
