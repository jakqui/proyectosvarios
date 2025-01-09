package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter.AdapterEstructuraJDBC;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class ModelCliente {
    private int id;
    private String nombre;
    private int numero;
}
