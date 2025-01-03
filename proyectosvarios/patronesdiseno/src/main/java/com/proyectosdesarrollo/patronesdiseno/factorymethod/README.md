# **Clase Abstracta en Java**
Una **clase abstracta** en Java es una clase que sirve como base o plantilla para 
otras clases. No puede ser instanciada directamente y puede contener tanto métodos 
abstractos (sin implementación) como métodos concretos (con implementación). 

## **Características de una clase abstracta**
1.-No se puede instanciar: Solo puede ser extendida por clases derivadas.
```java
abstract class Animal { }
    Animal animal = new Animal(); // ERROR

2.-Métodos abstractos: Define métodos sin cuerpo que las subclases deben 
implementar obligatoriamente.
```java
    abstract void hacerSonido(); // Método sin implementación

3.-Métodos concretos: Puede incluir métodos con lógica compartida entre todas 
las subclases.
```java
void dormir() {
    System.out.println("El animal duerme.");
}
    
4.- Puede tener atributos y constructores: Aunque no puede instanciarse, 
las subclases pueden usar estos atributos y constructores.


¿Para qué sirve?
-Proveer una estructura común: Define comportamientos y atributos compartidos 
entre subclases.
-Forzar implementación específica: Obliga a las subclases a implementar 
ciertos métodos clave.
-Reutilizar código: Métodos concretos permiten compartir lógica entre subclases.

// Clase abstracta
abstract class Animal {
    // Método abstracto (sin implementación)
    abstract void hacerSonido();

    // Método concreto (con implementación)
    void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}

// Subclase que extiende la clase abstracta
class Perro extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El perro ladra: ¡Guau!");
    }
}

// Subclase que extiende la clase abstracta
class Gato extends Animal {
    @Override
    void hacerSonido() {
        System.out.println("El gato maúlla: ¡Miau!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro();
        perro.hacerSonido(); // Salida: El perro ladra: ¡Guau!
        perro.dormir();      // Salida: El animal está durmiendo.

        Animal gato = new Gato();
        gato.hacerSonido();  // Salida: El gato maúlla: ¡Miau!
    }
}
