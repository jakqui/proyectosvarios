Combinaciones y permutaciones

## **Decorator**
El patrón de diseño Decorator es un patrón estructural que te permite añadir dinámicamente comportamientos adicionales a un objeto sin modificar su estructura original. Es ideal cuando necesitas extender la funcionalidad de una clase de forma flexible, evitando crear múltiples subclases para cada combinación posible de comportamientos.


## **¿Cómo funciona el patrón Decorator?**
Componente base (Component):

Define una interfaz común para todos los objetos que pueden ser decorados, ya sea el objeto original o los decoradores.
Componente concreto (ConcreteComponent):

Es la implementación básica del componente. Representa el objeto original que será decorado.
Decorador abstracto (Decorator):

Implementa la misma interfaz que el componente base.
Contiene una referencia al componente que está decorando.
Decoradores concretos (ConcreteDecorator):

Añaden funcionalidades adicionales al componente decorado.

## **Problemas que resuelve**
Evitar la explosión de subclases: En lugar de crear subclases para cada combinación de funcionalidades, el patrón Decorator permite agregar comportamientos de manera flexible en tiempo de ejecución.
Respetar el principio de diseño abierto/cerrado: Puedes extender la funcionalidad de una clase sin modificarla directamente.




# **Ejemplo práctico: Decoración de bebidas**
Imagina que estás diseñando un sistema para una cafetería donde las bebidas tienen precios básicos, y puedes agregarles complementos como leche, chocolate, etc.

1. Componente base
```java
public interface Beverage {
    String getDescription();
    double getCost();
}
```
2. Componente concreto
```java
public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
```
3. Decorador abstracto
```java
public abstract class BeverageDecorator implements Beverage {
    protected Beverage beverage; // Referencia al objeto que se va a decorar

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription(); // Delegar la llamada
    }

    @Override
    public double getCost() {
        return beverage.getCost(); // Delegar la llamada
    }
}
```
4. Decoradores concretos
Agregar leche:
```java
public class MilkDecorator extends BeverageDecorator {
    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.5;
    }
}
```

Agregar chocolate:
```java
public class ChocolateDecorator extends BeverageDecorator {
    public ChocolateDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 0.7;
    }
}
```
5. Uso en el programa
```java
public class TestDecorator {
    public static void main(String[] args) {
        // Crear un café simple
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // Decorar el café con leche
        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        // Decorar el café con leche y chocolate
        coffee = new ChocolateDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
    }
}
```
Salida del programa
```bash
Copiar código
Coffee -> $3.0
Coffee, Milk -> $3.5
Coffee, Milk, Chocolate -> $4.2
```

# **Ventajas del patrón Decorator**
Extensibilidad flexible: Puedes combinar decoradores en tiempo de ejecución según sea necesario.
Separación de responsabilidades: Cada decorador encapsula un comportamiento específico.
Cumple el principio de abierto/cerrado: Puedes agregar nuevas funcionalidades sin modificar el código existente.

# **Diferencia entre Decorator y otros patrones similares**
Adapter: Transforma la interfaz de un objeto en otra diferente.
Composite: Organiza objetos en estructuras jerárquicas tipo árbol.
Decorator: Añade dinámicamente responsabilidades adicionales a un objeto.