package Mediator;

public class Usuario {
	
	private String nombre;
    private Mediador mediador;

    public Usuario(String nombre, Mediador mediador) {
        this.nombre = nombre;
        this.mediador = mediador;
    }

    public void enviarMensaje(String mensaje) {
        mediador.enviarMensaje(mensaje, this);
    }

    public void recibirMensaje(String mensaje) {
        System.out.println(nombre + " recibió el mensaje: " + mensaje);
    }
    
}

