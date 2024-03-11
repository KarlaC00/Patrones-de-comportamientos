package Mediator;

import java.util.ArrayList;
import java.util.List;

public class MediadorChat implements Mediador{
	
	 private List<Usuario> usuarios;

	    public MediadorChat() {
	        usuarios = new ArrayList<>();
	    }

	    public void agregarUsuario(Usuario usuario) {
	        usuarios.add(usuario);
	    }

	    @Override
	    public void enviarMensaje(String mensaje, Usuario usuario) {
	        // Enviar el mensaje a todos los usuarios excepto al remitente
	        for (Usuario u : usuarios) {
	            if (u != usuario) {
	                u.recibirMensaje(mensaje);
	            }
	        }
	    }

}

