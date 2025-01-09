package com.proyectosdesarrollo.patronesdiseno.estructurales.adapter.AdapterEstructuraJDBC;

import java.util.List;

public interface InterfaceCRUD<T> {
    public int crear(T objeto);
    public List<T> consultarTodo();
    public void actualizar(T objeto);
    public void eliminar(T objeto);
    public T buscarPorId(int id);
    
}
