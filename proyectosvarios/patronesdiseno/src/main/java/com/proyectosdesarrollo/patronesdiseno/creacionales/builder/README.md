# **Patrón de Diseño Builder**
El patrón de diseño Builder es un patrón creacional que se utiliza para construir objetos complejos paso a paso. Este patrón separa la construcción de un objeto de su representación, permitiendo crear diferentes representaciones del mismo objeto utilizando el mismo proceso de construcción.

## **Cómo Identificar el Patrón Builder**
1.Configuración paso a paso: Si necesitas configurar un objeto mediante múltiples pasos o atributos.
2.Objetos inmutables: Si buscas que el objeto final sea inmutable después de su construcción.
3.Métodos encadenados: Si observas métodos que permiten configurar propiedades del objeto en una cadena fluida (fluency).
4.Complejidad en la creación: Si la construcción del objeto requiere lógica compleja o muchos parámetros.

## **Cómo Usarlo**
1.Definir un Builder:
Crear una clase que contenga todos los atributos del objeto objetivo.
Proveer métodos para configurar esos atributos de manera encadenada.
2.Método build:
Implementar un método build() que cree y devuelva la instancia del objeto final utilizando los valores configurados en el Builder.
3.Clase Interna (Opcional):
El Builder puede ser una clase interna estática dentro del objeto que se está construyendo.

## **Problemas que Resuelve**
1.Complejidad de constructores:
Evita constructores con muchos parámetros, los cuales pueden ser difíciles de usar y propensos a errores.
2.Legibilidad:
Hace que el código sea más fácil de leer al permitir configuraciones paso a paso con nombres claros para cada atributo.
3.Flexibilidad:
Permite crear diferentes configuraciones del mismo objeto sin tener que definir múltiples constructores o subclases.
4.Inmutabilidad:
Asegura que el objeto final es inmutable, ya que solo puede configurarse durante el proceso de construcción.

## **Ejemplo Práctico**
Código Usando el Patrón Builder
```java
public class Enemy {
    private final String name;
    private final String type;
    private final int health;
    private final int damage;
    private final int endurance;

    private Enemy(Builder builder) {
        this.name = builder.name;
        this.type = builder.type;
        this.health = builder.health;
        this.damage = builder.damage;
        this.endurance = builder.endurance;
    }

    public static class Builder {
        private String name;
        private String type;
        private int health;
        private int damage;
        private int endurance;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder health(int health) {
            this.health = health;
            return this;
        }

        public Builder damage(int damage) {
            this.damage = damage;
            return this;
        }

        public Builder endurance(int endurance) {
            this.endurance = endurance;
            return this;
        }

        public Enemy build() {
            return new Enemy(this);
        }
    }

    @Override
    public String toString() {
        return "Enemy{" +
               "name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", health=" + health +
               ", damage=" + damage +
               ", endurance=" + endurance +
               '}';
    }
}
```
Uso del Builder:
```java
public class Main {
    public static void main(String[] args) {
        Enemy enemy = new Enemy.Builder()
                .name("Orc")
                .type("Warrior")
                .health(150)
                .damage(30)
                .endurance(75)
                .build();

        System.out.println(enemy);
    }
}
```

Ventajas del Patrón Builder
1.Legibilidad y claridad: Fácil de entender al configurar un objeto.
2.Manejo de configuraciones opcionales: Solo configuras los atributos que necesitas.
3.Control sobre la construcción: Permite agregar validaciones antes de construir el objeto.