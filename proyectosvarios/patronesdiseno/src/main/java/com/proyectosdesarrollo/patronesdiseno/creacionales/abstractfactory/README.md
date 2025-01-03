# **Patrón de diseño Abstract Factory**

El patrón de diseño Abstract Factory es un patrón creacional que proporciona una interfaz para crear familias de objetos relacionados o dependientes sin especificar sus clases concretas. Es decir, define una interfaz para crear objetos, pero deja que las subclases decidan qué clase concreta instanciar.

# **¿Cómo funciona el patrón Abstract Factory?**
1.Interfaz de fábrica abstracta: Define métodos abstractos para crear productos, pero no especifica cómo se crean.
2.Fábricas concretas: Las clases concretas implementan la interfaz de fábrica abstracta, creando productos específicos.
3.Productos abstractos: Definen una serie de productos que la fábrica puede crear, y cada tipo de producto tiene una interfaz común.
4.Productos concretos: Son las implementaciones específicas de los productos que las fábricas concretas crean.
5.Este patrón es útil cuando se necesita crear productos de diferentes familias, pero sin que el cliente se preocupe por las clases concretas que se están utilizando. Esto permite que el código sea más flexible y extensible, ya que si deseas agregar una nueva familia de productos, puedes hacerlo sin modificar el código cliente.