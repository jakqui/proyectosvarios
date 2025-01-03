package com.proyectosdesarrollo.patronesdiseno.creacionales.builder.lombok;

import lombok.Builder;

@Builder
public class Enemy {
    
    private String name;
    private String type;
    private int health;
    private int damage;
    private int endurance;
    
}
