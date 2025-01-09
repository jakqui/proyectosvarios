package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter.AdapterEstructuraJDBC;

import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        // Crear una instancia de la clase que implementa la interfaz
        InterfaceCRUD<ModelCliente> jdbc = new JDBCTemaX();
        InterfaceTemaX temaX = new JDBCTemaX();

        // Llamar a los métodos de la interfaz
        List<ModelCliente> clientes = jdbc.consultarTodo();
        List<ModelCliente> clientesPorNumero = temaX.consultarPorNumeroCliente();
        ModelCliente cliente = jdbc.buscarPorId(0);
        jdbc.actualizar(cliente);
        jdbc.eliminar(cliente);

        // Mostrar resultados (opcional)
        System.out.println("Clientes: " + clientes);
        System.out.println("Cliente encontrado: " + cliente);
    }
}
