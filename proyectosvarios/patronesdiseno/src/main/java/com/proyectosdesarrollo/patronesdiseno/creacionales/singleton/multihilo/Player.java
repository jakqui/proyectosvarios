package com.proyectosdesarrollo.patronesdiseno.creacionales.singleton.multihilo;

public class Player {
    private String nombre;
    //VARIABLE ESTÁTICA QUE CONTIENE LA INSTANCIA
    //ESTO SIRVE PARA QUE NO GUARDE EN CACHE EL VALOR, 
    //SINO EN LA RAM, PARA QUE TODOS LOS HILOS APUNTEN A LA MISMA DIRECCIÓN DE MEMORIA
    private static volatile Player player;

    //EL CONSTRUCTOR DEBE SER PRIVADO
    private Player(String name){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.nombre = name;
    }

    //PARA RECUPERAR LA INSTANCIA
    public static synchronized Player getPlayer(String name){
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
