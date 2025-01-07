# **Clase sealed en Java**
En Java, la palabra clave sealed se introdujo en Java 15 como parte de la característica de clases selladas. Una clase sellada es una clase cuyo comportamiento está restringido en términos de qué otras clases pueden extenderla. Esto proporciona más control sobre la jerarquía de clases, ya que el desarrollador puede especificar explícitamente qué clases pueden heredar de una clase sellada.

## **Características de una Clase Sealed**
1. Restricción de Herencia: Puedes controlar qué clases pueden heredar de una clase sellada.
2. Uso de la palabra clave permits: Se utiliza la palabra clave permits en la declaración de la clase para especificar qué clases pueden extenderla.
3. Compuesta con Clases Finales: Las clases selladas también pueden tener subclases que sean final, lo que significa que no pueden ser extendidas más.
4. Restricciones en los abstract o non-abstract: Puedes crear jerarquías de clases selladas tanto con clases abstractas como concretas.

## **Beneficios del Uso de Clases Sealed**
1. Control sobre la jerarquía de clases: Puedes restringir qué clases pueden ser subclases de una clase sellada, lo que reduce el riesgo de extensiones indeseadas.
2. Mejor seguridad y claridad: Evitar subclases no deseadas puede ser útil para garantizar un comportamiento más predecible y controlado de las clases en tu programa.
3. Simplicidad en la herencia: Se evita que la jerarquía de clases se vuelva compleja e impredecible, proporcionando un enfoque más claro y controlado para el diseño orientado a objetos.
4. Soporte para patrones como el patrón de diseño Visitor: Es útil en situaciones donde quieres asegurarte de que un conjunto limitado de clases herede de una clase base, como en la implementación de patrones de diseño.

## **Sintaxis de una Clase Sellada**
```java
Copiar código
public sealed class Animal permits Perro, Gato {
    // Atributos y métodos comunes
}

public final class Perro extends Animal {
    // Implementación de Perro
}

public final class Gato extends Animal {
    // Implementación de Gato
}
```

```java
Clase Sellada
public sealed class Animal permits Perro, Gato {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Método común para todos los animales
    public void dormir() {
        System.out.println(name + " está durmiendo.");
    }
}

// Subclase final que extiende Animal
public final class Perro extends Animal {
    public Perro(String name, int age) {
        super(name, age);
    }

    // Comportamiento específico de Perro
    public void ladrar() {
        System.out.println(getName() + " está ladrando.");
    }
}

// Otra subclase final que extiende Animal
public final class Gato extends Animal {
    public Gato(String name, int age) {
        super(name, age);
    }

    // Comportamiento específico de Gato
    public void maullar() {
        System.out.println(getName() + " está maullando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Rex", 3);
        perro.dormir();  // Salida: Rex está durmiendo.

        Perro perroReal = (Perro) perro;  // Se puede hacer el cast ya que perro es un Perro
        perroReal.ladrar();  // Salida: Rex está ladrando.

        Animal gato = new Gato("Whiskers", 2);
        gato.dormir();  // Salida: Whiskers está durmiendo.

        Gato gatoReal = (Gato) gato;  // Se puede hacer el cast ya que gato es un Gato
        gatoReal.maullar();  // Salida: Whiskers está maullando.
    }
}
```


## **Resumen:**
* sealed permite controlar explícitamente qué clases pueden extender una clase.
* Utiliza permits para enumerar las clases permitidas.
* Subclases final no pueden ser extendidas, pero aún pueden ser utilizadas.
Este patrón es muy útil para diseñar jerarquías de clases bien controladas y predecibles.