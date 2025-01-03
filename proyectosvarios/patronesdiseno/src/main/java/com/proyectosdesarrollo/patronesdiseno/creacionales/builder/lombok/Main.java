package com.proyectosdesarrollo.patronesdiseno.creacionales.builder.lombok;

public class Main {
    public static void main(String[] args) {
        // Usar el builder dentro de un método válido
        Enemy enemy = Enemy.builder()
            .name("JJ")
            .type("Goblin")
            .health(100)
            .damage(15)
            .endurance(50)
            .build();

        // Ejemplo de impresión de valores (agregar getters si es necesario)
        System.out.println("Enemy creado: " + enemy);
    }
}
