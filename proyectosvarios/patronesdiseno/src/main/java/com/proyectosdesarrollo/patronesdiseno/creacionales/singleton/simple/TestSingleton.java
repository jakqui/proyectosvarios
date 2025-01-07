package com.proyectosdesarrollo.patronesdiseno.creacionales.singleton.simple;

public class TestSingleton {
    public static void main(String[] args) {
        Player player = Player.getPlayer("Juan");
        System.out.println(player.toString());
        player = Player.getPlayer("Pedro");
        System.out.println(player.toString());
    }
}
