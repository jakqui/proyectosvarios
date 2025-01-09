package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter.AdapterEstructuraJDBC;

import java.util.ArrayList;
import java.util.List;

public class JDBCTemaX implements InterfaceCRUD<ModelCliente>, InterfaceTemaX{
    
    @Override
    public List<ModelCliente> consultarPorNumeroCliente() {
        List<ModelCliente> clientes = new ArrayList<>();
        ModelCliente cliente3 = ModelCliente.builder()
        .id(1)
        .nombre("Cliente 3")
        .numero(3)
        .build();

        ModelCliente cliente4 = ModelCliente.builder()
        .id(1)
        .nombre("Cliente 4")
        .numero(4)
        .build();

        clientes.add(cliente3);
        clientes.add(cliente4);
        return clientes;
    }

    @Override
    public int crear(ModelCliente objeto) {
        return 1;
    }
    
    @Override
    public List<ModelCliente> consultarTodo() {
        List<ModelCliente> clientes = new ArrayList<>();
        ModelCliente cliente1 = ModelCliente.builder()
        .id(1)
        .nombre("Cliente 1")
        .numero(1)
        .build();

        ModelCliente cliente2 = ModelCliente.builder()
        .id(1)
        .nombre("Cliente 2")
        .numero(2)
        .build();

        clientes.add(cliente1);
        clientes.add(cliente2);
        return clientes;
    }

    @Override
    public void actualizar(ModelCliente objeto) {
        System.out.println("SE ACTUALIZÓ");
    }

    @Override
    public void eliminar(ModelCliente objeto) {
        System.out.println("Se eliminó");
    }

    @Override
    public ModelCliente buscarPorId(int id) {
        ModelCliente cliente = ModelCliente.builder()
        .id(1)
        .nombre("Cliente 1")
        .numero(123)
        .build();
        return cliente;
    }

    
}
