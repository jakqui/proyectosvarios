## **El patrón Singleton**
El patrón Singleton es un patrón de diseño creacional que garantiza que una clase tenga una única instancia y proporciona un punto de acceso global a esa instancia. Es ampliamente utilizado cuando se necesita una única representación de un recurso, como un administrador de configuración, registro de logs, o conexión a una base de datos.

# **¿Qué es el patrón Singleton?**
El patrón Singleton se asegura de que una clase solo pueda tener una única instancia y que esta instancia sea accesible desde cualquier parte de la aplicación. Se logra restringiendo la creación de objetos e implementando un método que devuelve siempre la misma instancia.

# **Características principales del patrón Singleton**
1. *Única instancia:* Garantiza que solo exista una instancia de la clase durante el ciclo de vida de la aplicación.
2. *Acceso global:* Permite acceder a la instancia única desde cualquier lugar del código.
3. *Control de recursos compartidos:* Útil para gestionar recursos que deben ser únicos, como bases de datos, sockets o configuraciones.

# **Ventajas del patrón Singleton**
1. *Consistencia global:* Se asegura de que el estado compartido sea único y consistente en toda la aplicación.
2. *Fácil acceso:* La instancia es accesible de manera global sin necesidad de pasarla explícitamente como parámetro.
3. *Control de recursos:* Reduce la sobrecarga al evitar múltiples instancias de recursos pesados.

# **Cuándo usar el patrón Singleton**
* Cuando necesitas exactamente una instancia de una clase para coordinar acciones.
* Para administrar recursos compartidos, como archivos de configuración, conexión a bases de datos o administración de logs.
* Cuando necesitas un punto de acceso único para datos o configuraciones globales.


Implementación del patrón Singleton en Java
Versión básica (no thread-safe)
```java
public class Singleton {
    // Instancia única de la clase
    private static Singleton instancia;

    // Constructor privado para evitar la creación de objetos desde fuera
    private Singleton() {}

    // Método público para obtener la única instancia
    public static Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    public void mostrarMensaje() {
        System.out.println("Instancia única de Singleton");
    }
}
```

Uso del Singleton
```java
public class Main {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstancia();
        Singleton singleton2 = Singleton.getInstancia();

        singleton1.mostrarMensaje();

        // Verificar que ambas referencias apuntan al mismo objeto
        System.out.println(singleton1 == singleton2); // true
    }
}
```

Versión thread-safe
Para aplicaciones multihilo, es importante garantizar que solo se cree una instancia incluso si varios hilos intentan acceder al método simultáneamente.

Uso de synchronized
```java
public class Singleton {
    private static Singleton instancia;

    private Singleton() {}

    public static synchronized Singleton getInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }
}
```

Versión más eficiente: Inicialización con doble verificación
```java
public class Singleton {
    private static volatile Singleton instancia;

    private Singleton() {}

    public static Singleton getInstancia() {
        if (instancia == null) {
            synchronized (Singleton.class) {
                if (instancia == null) {
                    instancia = new Singleton();
                }
            }
        }
        return instancia;
    }
}
```

## **Problemas que resuelve el patrón Singleton**
* Duplicación de objetos: Evita que se creen múltiples instancias innecesarias.
* Control centralizado: Proporciona un único punto de acceso global a la instancia.
* Consistencia en estados compartidos: Permite coordinar estados y recursos compartidos a través de la aplicación.
## **Ejemplos de uso común del patrón Singleton**
* Administración de logs: Crear un único gestor de registros para toda la aplicación.
* Configuraciones globales: Cargar y acceder a configuraciones compartidas.
* Gestión de conexiones a bases de datos: Asegurar que solo exista una conexión a la base de datos para evitar conflictos.
* El patrón Singleton es poderoso, pero debe usarse con cuidado para evitar acoplamiento excesivo y problemas de testabilidad en tu código.
