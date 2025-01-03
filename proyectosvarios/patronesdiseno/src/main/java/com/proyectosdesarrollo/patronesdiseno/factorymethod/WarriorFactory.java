package com.proyectosdesarrollo.patronesdiseno.factorymethod;

/*ESTA ES UNA CLASE DERIVADA PORQUE
 * Una clase derivada es una clase que hereda de otra clase, llamada clase base
 * o superclase, en programación orientada a objetos. Al derivarse, obtiene los 
 * atributos y métodos de la clase base, y puede agregar o sobrescribir (modificar)
 *  su propio comportamiento.
 * 
 * 
Características de una clase derivada:
-Hereda propiedades y métodos: Reutiliza el código de la clase base.
-Puede extender funcionalidad: Agrega nuevos métodos o atributos específicos.
-Sobrescribe métodos: Modifica el comportamiento de métodos existentes en la clase base usando @Override en Java.
-Se define con extends en Java.
 */
public class WarriorFactory extends EnemyFactory{

    @Override
    public Enemy creaEnemy() {
        return new Warrior();
    }

}
