package com.proyectosdesarrollo.patronesdiseno.creacionales.singleton.simple;

public class Player {
    private String nombre;
    //VARIABLE ESTÁTICA QUE CONTIENE LA INSTANCIA
    private static Player player;

    //EL CONSTRUCTOR DEBE SER PRIVADO
    private Player(String name){
        this.nombre = name;
    }

    //PARA RECUPERAR LA INSTANCIA
    public static Player getPlayer(String name){
        //SI ES NULL LO INICIALIZA
        if(player == null)
            player = new Player(name);
        //SI NO ES NULL REGRESA LA INSTANCIA
        return player;
    }

    @Override
    public String toString() {
        return "Player [nombre=" + nombre + "]";
    }
}
