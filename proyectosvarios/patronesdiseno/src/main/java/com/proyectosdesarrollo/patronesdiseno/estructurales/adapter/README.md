## **Patrón Adapter**
El patrón Adapter es un patrón estructural que actúa como un puente entre dos interfaces incompatibles, permitiendo que trabajen juntas sin necesidad de modificar su código original. Se utiliza cuando una clase tiene una interfaz que no es compatible con la que requiere el cliente, y se necesita adaptar esa clase para que funcione correctamente.

# **¿Qué es el patrón Adapter?**
El patrón Adapter convierte la interfaz de una clase existente en otra que el cliente espera. Funciona como un intermediario que traduce las llamadas de un sistema al otro, haciendo que dos componentes incompatibles trabajen juntos.

# **Características principales del patrón Adapter**
Adaptación de interfaces incompatibles: Permite que dos sistemas con interfaces distintas trabajen en conjunto.
Sin modificar el código original: No es necesario cambiar la implementación de las clases existentes.
Implementación reutilizable: Puede ser usado en múltiples lugares donde se necesite compatibilidad.

# **Ventajas del patrón Adapter**
Reutilización de código: Permite utilizar clases existentes sin necesidad de modificarlas.
Flexibilidad: Facilita la integración de nuevos componentes sin alterar la arquitectura existente.
Separación de responsabilidades: Mantiene la lógica de adaptación separada del código principal.

# **Cuándo usar el patrón Adapter**
Cuando necesitas que una clase funcione con otra que tiene una interfaz incompatible.
Para reutilizar una clase existente sin modificar su código.
En sistemas donde se integran APIs externas o clases de terceros.

# **Implementación del patrón Adapter**
Ejemplo: Adaptar un sistema de audio
Supongamos que tienes una clase AudioPlayer que reproduce archivos .mp3, pero necesitas que también pueda reproducir archivos .mp4 y .vlc.


# **Código sin adaptar**
```java
// Clase existente que reproduce archivos MP3
public class AudioPlayer {
    public void playMp3(String fileName) {
        System.out.println("Reproduciendo archivo MP3: " + fileName);
    }
}
```


# **Interfaz esperada por el cliente**
```java
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
```


# **Clases de formatos específicos**
```java
public class Mp4Player {
    public void playMp4(String fileName) {
        System.out.println("Reproduciendo archivo MP4: " + fileName);
    }
}


public class VlcPlayer {
    public void playVlc(String fileName) {
        System.out.println("Reproduciendo archivo VLC: " + fileName);
    }
}
```


# **Clase Adapter**
```java
public class MediaAdapter implements MediaPlayer {
    private Mp4Player mp4Player;
    private VlcPlayer vlcPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            mp4Player.playMp4(fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            vlcPlayer.playVlc(fileName);
        }
    }
}
```


# **Uso del Adapter en el cliente**
```java
public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Reproduciendo archivo MP3: " + fileName);
        } else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Formato no soportado: " + audioType);
        }
    }
}
```


# **Ejemplo de uso**
```java
public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "cancion.mp3");
        audioPlayer.play("mp4", "video.mp4");
        audioPlayer.play("vlc", "pelicula.vlc");
        audioPlayer.play("avi", "archivo.avi");
    }
}
```


# **Salida esperada**
```yaml
Reproduciendo archivo MP3: cancion.mp3
Reproduciendo archivo MP4: video.mp4
Reproduciendo archivo VLC: pelicula.vlc
Formato no soportado: avi
```


# **Problemas que resuelve el patrón Adapter**
Incompatibilidad de interfaces: Adapta sistemas existentes a nuevas interfaces sin necesidad de modificar el código original.
Integración de sistemas externos: Facilita la integración de APIs de terceros con tu aplicación.
Migración de código: Simplifica la transición entre sistemas con diferentes interfaces.
El patrón Adapter es útil cuando se necesita compatibilidad sin modificar el código base y es una solución eficaz para sistemas heterogéneos.