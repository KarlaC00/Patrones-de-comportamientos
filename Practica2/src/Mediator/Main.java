package Mediator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
        MediadorChat mediadorChat = new MediadorChat();

        Usuario usuario1 = new Usuario("Usuario 1", mediadorChat);
        Usuario usuario2 = new Usuario("Usuario 2", mediadorChat);
        Usuario usuario3 = new Usuario("Usuario 3", mediadorChat);
        

        mediadorChat.agregarUsuario(usuario1);
        mediadorChat.agregarUsuario(usuario2);
        mediadorChat.agregarUsuario(usuario3);


        usuario1.enviarMensaje("Hola a todos!");
        usuario2.enviarMensaje("Hola usuario1!");
        usuario3.enviarMensaje("Hola usuario1 y usuario2!");
    }

		
}


