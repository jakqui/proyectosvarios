## **El patrón Bridge **
El patrón Bridge es un patrón de diseño estructural que desacopla una abstracción de su implementación, permitiendo que ambas puedan variar independientemente. Este patrón es especialmente útil cuando tenemos una jerarquía de clases y queremos dividir la abstracción (interfaz) y su implementación en diferentes clases, de forma que cada parte pueda evolucionar sin que se afecte la otra.

# ** ¿Qué es el patrón Bridge? **
El patrón Bridge permite separar una abstracción de su implementación, proporcionando una forma de usar la misma interfaz con diferentes implementaciones. Este patrón es utilizado para evitar un "explosión de clases", cuando se combinan varias jerarquías de clases que pueden producir una cantidad de clases excesiva.

# **Estructura del patrón Bridge**
El patrón se compone de los siguientes elementos:
1. Abstraction (Abstracción): Mantiene una referencia al objeto de implementación y define la interfaz de alto nivel que se utilizará por los clientes. La clase abstracta puede delegar operaciones a la implementación.
2. RefinedAbstraction (Abstracción Refinada): Extiende la clase de abstracción y proporciona una implementación más específica de la interfaz.
3. Implementor (Implementador): Define la interfaz que será implementada por las clases concretas de implementación. Generalmente, tiene métodos de bajo nivel.
4. ConcreteImplementor (Implementación Concreta): Implementa los métodos definidos en el implementor.

# **¿Por qué usar el patrón Bridge?**
1. El patrón Bridge es útil cuando:
2. Se necesita cambiar la implementación sin afectar a las abstracciones.
3. Existen múltiples implementaciones de una misma interfaz y queremos poder combinarlas de diferentes maneras.
4. Queremos evitar una jerarquía de clases grande y compleja.
5. Queremos mejorar la escalabilidad del sistema separando los detalles de implementación de la interfaz.

# **Ventajas del patrón Bridge**
1. Desacoplamiento de la implementación y la abstracción: Las dos pueden evolucionar de manera independiente.
2. Mejora la escalabilidad: Al poder combinar diferentes implementaciones sin necesidad de combinar cada clase de la jerarquía.
3. Facilita el mantenimiento del código: Si se modifican las implementaciones, no es necesario cambiar las clases abstractas.

# **Ejemplo de implementación del patrón Bridge**
Imaginemos que estamos trabajando con un sistema para controlar diferentes tipos de formas geométricas (por ejemplo, círculos y rectángulos) y para cada forma, queremos dibujarla en diferentes plataformas (por ejemplo, Windows y Linux). Sin el patrón Bridge, podríamos terminar con muchas clases (por ejemplo, CircleWindows, CircleLinux, RectangleWindows, RectangleLinux).

# **Paso 1: Definimos la interfaz de implementación**
Primero definimos la interfaz que manejará los detalles de dibujo, independientemente de la forma:

```java
// Implementor
public interface DrawAPI {
    void drawCircle(int radius, int x, int y);
    void drawRectangle(int length, int width, int x, int y);
}
```

# **Paso 2: Creamos las implementaciones concretas**
Ahora implementamos la interfaz DrawAPI para diferentes plataformas:

```java
// Concrete Implementor 1: Windows
public class WindowsDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Dibujando un círculo en Windows con radio: " + radius);
    }

    @Override
    public void drawRectangle(int length, int width, int x, int y) {
        System.out.println("Dibujando un rectángulo en Windows con dimensiones: " + length + "x" + width);
    }
}

// Concrete Implementor 2: Linux
public class LinuxDrawAPI implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Dibujando un círculo en Linux con radio: " + radius);
    }

    @Override
    public void drawRectangle(int length, int width, int x, int y) {
        System.out.println("Dibujando un rectángulo en Linux con dimensiones: " + length + "x" + width);
    }
}
```

# **Paso 3: Definimos la abstracción**
Ahora, definimos la clase de abstracción que usará una instancia de DrawAPI para delegar las operaciones de dibujo:

```java
// Abstraction
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
```

# **Paso 4: Creamos las abstracciones refinadas**
Las subclases de Shape extienden la abstracción y utilizan la implementación proporcionada por DrawAPI:

```java
// Refined Abstraction 1: Circle
public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

// Refined Abstraction 2: Rectangle
public class Rectangle extends Shape {
    private int length;
    private int width;
    private int x;
    private int y;

    public Rectangle(int length, int width, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.length = length;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawRectangle(length, width, x, y);
    }
}
```

# **Paso 5: Uso del patrón Bridge**
Finalmente, podemos usar el patrón Bridge para dibujar diferentes formas en diferentes plataformas:

```java
public class BridgePatternDemo {
    public static void main(String[] args) {
        // Usando la implementación de Windows
        Shape circle = new Circle(10, 100, 100, new WindowsDrawAPI());
        circle.draw();

        Shape rectangle = new Rectangle(20, 10, 200, 200, new WindowsDrawAPI());
        rectangle.draw();

        // Usando la implementación de Linux
        Shape circleLinux = new Circle(15, 50, 50, new LinuxDrawAPI());
        circleLinux.draw();

        Shape rectangleLinux = new Rectangle(30, 20, 150, 150, new LinuxDrawAPI());
        rectangleLinux.draw();
    }
}
```


# **Salida esperada**
```yaml
Dibujando un círculo en Windows con radio: 10
Dibujando un rectángulo en Windows con dimensiones: 20x10
Dibujando un círculo en Linux con radio: 15
Dibujando un rectángulo en Linux con dimensiones: 30x20
```


# **Problemas que resuelve el patrón Bridge**
1. Evitar la explosión de clases: Cuando tenemos múltiples combinaciones de clases, el patrón Bridge ayuda a dividir la lógica de la abstracción y la implementación en clases separadas.
2. Desacoplar abstracción e implementación: Permite que ambas partes evolucionen de manera independiente.
3. Facilita la escalabilidad y el mantenimiento: Si se agregan nuevas abstracciones o implementaciones, no es necesario modificar todo el sistema, solo las clases necesarias.

# **Cuándo usar el patrón Bridge**
1. Cuando necesitas separar la abstracción y su implementación en un sistema complejo.
2. Si tienes múltiples implementaciones de una interfaz y necesitas cambiar la implementación sin afectar la abstracción.
3. Para reducir la complejidad y las jerarquías de clases en sistemas donde la combinación de clases lleva a un alto número de clases.

El patrón Bridge es ideal cuando quieres evitar la rigidez en el sistema y mantener las partes independientes, lo que facilita la extensión y mantenimiento del código.


Mago puede implementar cosa de Warrior y Warrior a su vez al revez
Se separa la implementacion de la Abstraccion, esto permite que se puedan realizar mas cosas
Se crean 2 Clases Derivadas que la implementan: WarriorFighterImpl y MageFighterImpl