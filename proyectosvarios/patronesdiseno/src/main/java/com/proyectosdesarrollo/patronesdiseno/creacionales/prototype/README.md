# **Patrón Prototype**
Prototype sirve para hacer copias de objetos de forma rapida y eficiente.
Se necesita un constructor que se contiene a sí mismo.
Sirve para crear clones de una instancia de una manera muy muy rapida

El patrón Prototype es un patrón de diseño creacional que permite clonar objetos en lugar de crearlos desde cero. Esto es útil cuando la creación de un objeto es costosa en términos de tiempo o recursos, o cuando necesitas crear múltiples instancias con configuraciones similares.

## **¿Qué es el patrón Prototype?**
El patrón Prototype se basa en la idea de proporcionar un mecanismo para copiar (o clonar) un objeto existente, llamado prototipo, para crear nuevas instancias. Estas copias pueden ser completas (clonación profunda) o superficiales (clonación superficial).

## **Características principales del patrón Prototype**
Clonación de objetos: Los nuevos objetos se crean copiando un prototipo existente.
Alta personalización: Los objetos clonados pueden ser modificados después de la clonación sin afectar al prototipo original.
Reducción de costos de creación: Evita la inicialización costosa al reutilizar un objeto existente.
Ventajas del patrón Prototype
Reducción del acoplamiento: No necesitas especificar explícitamente la clase del objeto que estás clonando.
Mejora del rendimiento: Útil cuando la creación de un objeto es costosa.
Flexibilidad: Permite crear objetos dinámicamente en tiempo de ejecución.
Cuándo usar el patrón Prototype
Creación costosa: Si crear un objeto desde cero consume muchos recursos.
Necesidad de múltiples instancias similares: Si necesitas varias copias de un objeto con configuraciones iniciales similares.
Composición dinámica: Cuando las instancias pueden ser configuradas o modificadas en tiempo de ejecución.
## **Implementación en Java**
En Java, puedes implementar el patrón Prototype utilizando la interfaz Cloneable y el método clone(). Aquí tienes un ejemplo:

```java
Copiar código
// Clase prototipo que implementa Cloneable
public class Enemigo implements Cloneable {
    private String tipo;
    private int salud;

    public Enemigo(String tipo, int salud) {
        this.tipo = tipo;
        this.salud = salud;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    // Implementación del método clone()
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Enemigo{" +
                "tipo='" + tipo + '\'' +
                ", salud=" + salud +
                '}';
    }
}

// Clase cliente que utiliza el patrón Prototype
public class Main {
    public static void main(String[] args) {
        try {
            // Crear un objeto prototipo
            Enemigo prototipo = new Enemigo("Orco", 100);

            // Clonar el prototipo
            Enemigo clon1 = (Enemigo) prototipo.clone();
            clon1.setTipo("Orco Guerrero");
            clon1.setSalud(150);

            Enemigo clon2 = (Enemigo) prototipo.clone();
            clon2.setTipo("Orco Mago");
            clon2.setSalud(80);

            // Mostrar los objetos clonados
            System.out.println(prototipo);
            System.out.println(clon1);
            System.out.println(clon2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
```