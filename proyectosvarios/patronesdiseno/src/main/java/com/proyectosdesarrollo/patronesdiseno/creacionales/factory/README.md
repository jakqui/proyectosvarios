¿Qué es el patrón Factory?
Es un patrón de diseño creacional que centraliza la lógica de creación de objetos, delegando esta tarea a un método o clase, en lugar de usar new directamente.

¿Cómo identificarlo?
Hay un método o clase encargada de crear objetos.
Evita usar new en el código cliente.
Facilita agregar nuevos tipos de objetos sin modificar el código cliente.


# Ejemplo: Antes y Después de Factory
# Sin Factory (antes)
El cliente crea objetos directamente:
class Main {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        email.enviar();

        SMSNotification sms = new SMSNotification();
        sms.enviar();
    }
}

class EmailNotification {
    void enviar() {
        System.out.println("Email enviado.");
    }
}

class SMSNotification {
    void enviar() {
        System.out.println("SMS enviado.");
    }
}


# Con Factory (después)
El cliente delega la creación a una fábrica:

interface Notification {
    void enviar();
}

class EmailNotification implements Notification {
    @Override
    public void enviar() {
        System.out.println("Email enviado.");
    }
}

class SMSNotification implements Notification {
    @Override
    public void enviar() {
        System.out.println("SMS enviado.");
    }
}

class NotificationFactory {
    static Notification crearNotificacion(String tipo) {
        if ("email".equalsIgnoreCase(tipo)) return new EmailNotification();
        if ("sms".equalsIgnoreCase(tipo)) return new SMSNotification();
        throw new IllegalArgumentException("Tipo no soportado.");
    }
}

class Main {
    public static void main(String[] args) {
        Notification notificacion = NotificationFactory.crearNotificacion("email");
        notificacion.enviar();

        Notification otraNotificacion = NotificationFactory.crearNotificacion("sms");
        otraNotificacion.enviar();
    }
}


Ventaja: Agregar un nuevo tipo (ej. PushNotification) solo requiere actualizar la fábrica, no el cliente.