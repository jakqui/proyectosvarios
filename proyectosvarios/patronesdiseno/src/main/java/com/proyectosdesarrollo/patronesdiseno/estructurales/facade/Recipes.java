package com.proyectosdesarrollo.patronesdiseno.estructurales.facade;

public interface Recipes {
    static boolean getRecipes(String name, boolean make){
        String action = make ? "make" : "improve";
        if(Math.random() > 0.5){
            System.out.println("You have the necessary skills to  " + action + " the " + name);
            return true;
        } else {
            System.out.println("You don't have the necessary skills to  " + action + " the " + name);
            return false;
        }
    }
}
