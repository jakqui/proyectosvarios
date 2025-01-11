package com.proyectosdesarrollo.patronesdiseno.estructurales.composite;

public class Item extends BaseItem {

    public Item(String name, int value) {
        super(name, value);
    }

    @Override
    public void add(BaseItem baseItem) {
        System.out.println("No se permiten items");
    }

    @Override
    public void remove(BaseItem baseItem) {
        System.out.println("No se permiten items");
    }

    @Override
    public int getValue() {
        return value;
    }

}
