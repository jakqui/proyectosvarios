package com.proyectosdesarrollo.patronesdiseno.creacionales.singleton.multihilo;

public class TestSingleton {
    public static void main(String[] args) {
        /*Player player = Player.getPlayer("Pepe");
        System.out.println(player.toString());
        player = Player.getPlayer("Manolo");
        System.out.println(player.toString());*/
        Thread threadPepe = new Thread(new RunPepe());
        Thread threadManolo = new Thread(new RunManolo());
        threadPepe.start();
        threadManolo.start();
    }

    static class RunPepe implements Runnable{
        @Override
        public void run() {
            Player player = Player.getPlayer("Pepe");
            System.out.println("Running Pepe: " + player.toString());
        }
    }

    static class RunManolo implements Runnable{
        @Override
        public void run() {
            Player player = Player.getPlayer("Manolo");
            System.out.println("Rumming Manolo: " + player.toString());
        }       
    }
}
