## **¿Qué es el patrón Composite?**
El patrón Composite es un patrón estructural que te permite tratar objetos individuales y compuestos (que contienen varios objetos) de la misma manera. Este patrón se usa cuando tienes una jerarquía de objetos, como un árbol, donde un "todo" está compuesto de partes, y esas partes también pueden estar formadas por más subpartes.

# **Por ejemplo:**

Una bolsa (bag) puede contener monedas, pociones, y otras bolsas.
Una bolsa puede estar vacía, pero sigue siendo parte del sistema.
Componentes clave del código
Clase abstracta BaseItem:

# **Representa el componente base.**
Define los métodos que todas las clases (objetos individuales o compuestos) deben implementar, como add, remove y getValue.
Clase Item:

Representa un objeto individual, como una moneda, poción o arma.
Como no puede contener otros objetos, los métodos add y remove no hacen nada útil.
Clase Bag:

Representa un objeto compuesto, como una bolsa que puede contener otros objetos o bolsas.
Contiene una lista de otros BaseItem para almacenar sus componentes.
Implementa métodos para agregar, eliminar y calcular el valor total de los objetos que contiene.
Clase TestComposite:

Es el programa principal que usa estas clases para simular un inventario de un videojuego.
Permite agregar objetos individuales (Item) o compuestos (Bag) al inventario.
# **Explicación paso a paso del código**
1. Clase abstracta BaseItem
Esta clase es el "contrato" para todos los elementos. Define que todos los elementos tendrán un nombre, un valor y los métodos:

add: Para agregar un objeto.
remove: Para eliminar un objeto.
getValue: Para calcular el valor del elemento (o del compuesto).

```java
public abstract class BaseItem {
    protected String name;
    protected int value;
    protected List<BaseItem> items; // Lista para elementos compuestos

    public BaseItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public abstract void add(BaseItem baseItem);
    public abstract void remove(BaseItem baseItem);
    public abstract int getValue();
}
```
2. Clase Item (hoja del árbol)
Esta clase representa los objetos que no pueden contener otros objetos. Por ejemplo, monedas o pociones. Implementa los métodos definidos en BaseItem, pero como no puede agregar o eliminar objetos, imprime un mensaje en add y remove.

```java
public class Item extends BaseItem {
    public Item(String name, int value) {
        super(name, value);
    }

    @Override
    public void add(BaseItem baseItem) {
        System.out.println("No se permiten items");
    }

    @Override
    public void remove(BaseItem baseItem) {
        System.out.println("No se permiten items");
    }

    @Override
    public int getValue() {
        return value; // El valor es el propio valor del objeto.
    }
}
```
3. Clase Bag (compuesto del árbol)
Esta clase representa un objeto compuesto, como una bolsa que puede contener otros objetos o incluso otras bolsas.

Usa una lista items para almacenar los componentes que contiene.
El método getValue recorre recursivamente todos los elementos de la bolsa y suma sus valores.

```java
public class Bag extends BaseItem {
    public Bag(String name) {
        super(name, 0); // Las bolsas inicializan con valor 0.
        items = new ArrayList<>(); // Lista vacía para guardar los componentes.
    }

    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem); // Agrega un componente.
    }

    @Override
    public void remove(BaseItem baseItem) {
        items.remove(baseItem); // Elimina un componente.
    }

    @Override
    public int getValue() {
        int result = value; // Valor base de la bolsa (generalmente 0).
        for (BaseItem item : items) { // Recorre todos los componentes de la bolsa.
            result += item.getValue(); // Suma el valor de cada componente.
        }
        return result; // Retorna el valor total.
    }
}
```
Recursividad en el patrón Composite
La recursividad ocurre en el método getValue de la clase Bag. Este método:

Recorre todos los elementos que contiene la bolsa.
Si encuentra un objeto individual (Item), obtiene su valor.
Si encuentra otro objeto compuesto (Bag), llama a su método getValue, que a su vez repetirá el proceso con sus propios elementos.
Este proceso continúa hasta que se alcanza el nivel más bajo del árbol, es decir, los objetos individuales.

4. Clase TestComposite
Esta clase simula un inventario y muestra cómo funciona el patrón Composite:

```java
public class TestComposite {
    public static void main(String[] args) {
        // Inventario principal
        BaseItem inventory = new Bag("inventory");

        // Crear bolsas
        BaseItem bagCoins = new Bag("bag Coins");
        BaseItem bagPotions = new Bag("bag Potions");

        // Agregar monedas a la bolsa de monedas
        BaseItem coins = new Item("coins", 6);
        bagCoins.add(coins);

        // Agregar pociones a la bolsa de pociones
        BaseItem magicPotion = new Item("Magic potion", 3);
        BaseItem healthPotion = new Item("Health potion", 3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        // Agregar armas al inventario principal
        BaseItem blade = new Item("blade", 3);
        BaseItem shield = new Item("shield", 3);
        BaseItem armItem = new Item("armItem", 3);

        // Construir el inventario completo
        inventory.add(bagCoins);
        inventory.add(bagPotions); // Si descomentas, se incluye la bolsa de pociones
        inventory.add(blade);
        inventory.add(shield);
        inventory.add(armItem);

        // Calcular y mostrar el valor total del inventario
        System.out.println("Total value: " + inventory.getValue());
    }
}
```
Total value: 18
¿Por qué 18?
Monedas: 6.
Espada, escudo y objeto de brazo: 3 cada uno (9 en total).
Pociones: Si incluyeras la bolsa de pociones, sumarían 6 más.

# **Ventajas del patrón Composite**
Tratar objetos simples y compuestos de la misma manera.
Facilitar la escalabilidad y mantenimiento.
Evitar duplicación de código al usar recursividad para recorrer estructuras jerárquicas.
Espero que esta explicación te haya ayudado a entender el patrón Composite y la recursividad. ¡Dime si necesitas más aclaraciones o ejemplos! 😊


Se basa en arboles y funciones recursivas