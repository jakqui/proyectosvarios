## **Resumen de los patrones utilizados:**
Adapter: JDBCTemaX adapta las interfaces InterfaceCRUD<ModelCliente> y InterfaceTemaX.
Builder: ModelCliente.builder() usa el patrón Builder para crear objetos complejos.
Singleton (posiblemente en el futuro, si se aplica a la conexión a la base de datos).
Factory: Implícito en la forma en que ModelCliente.builder() construye objetos.
DTO (Data Transfer Object): ModelCliente actúa como un DTO para transferir datos del cliente.