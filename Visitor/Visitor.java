// Interfaz Visitor
interface VisitanteJugador {
    void visitar(EnemigoA enemigo);
    void visitar(EnemigoB enemigo);
    // Puedes añadir más métodos visitar para cada tipo de enemigo que tengas
}

// Interfaz Visitable
interface Enemigo {
    void aceptar(VisitanteJugador visitante);
    void recibirAtaque(int danio);
}

// Clase base de los enemigos
abstract class EnemigoBase implements Enemigo {
    @Override
    public abstract void aceptar(VisitanteJugador visitante);
    public abstract void recibirAtaque(int danio);
}

// Tipos concretos de enemigos
class EnemigoA extends EnemigoBase {
    private int vida = 100;

    @Override
    public void aceptar(VisitanteJugador visitante) {
        visitante.visitar(this);
    }

    @Override
    public void recibirAtaque(int danio) {
        vida -= danio;
        System.out.println("EnemigoA recibió " + danio + " puntos de daño. Vida restante: " + vida);
    }
}

class EnemigoB extends EnemigoBase {
    private int vida = 150;

    @Override
    public void aceptar(VisitanteJugador visitante) {
        visitante.visitar(this);
    }

    @Override
    public void recibirAtaque(int danio) {
        vida -= danio;
        System.out.println("EnemigoB recibió " + danio + " puntos de daño. Vida restante: " + vida);
    }
}

// Clase del jugador
class Jugador {
    public void interactuarCon(Enemigo enemigo, int danio) {
        enemigo.aceptar(new VisitanteJugador() {
            @Override
            public void visitar(EnemigoA enemigo) {
                // Simular ataque al EnemigoA
                System.out.println("Atacando EnemigoA con " + danio + " puntos de daño.");
                enemigo.recibirAtaque(danio);
            }

            @Override
            public void visitar(EnemigoB enemigo) {
                // Simular ataque al EnemigoB
                System.out.println("Atacando EnemigoB con " + danio + " puntos de daño.");
                enemigo.recibirAtaque(danio);
            }
        });
    }
}

// Clase principal que prueba el programa
public class Visitor {
    public static void main(String[] args) {
        Jugador jugador = new Jugador();
        Enemigo enemigoA = new EnemigoA();
        Enemigo enemigoB = new EnemigoB();

        jugador.interactuarCon(enemigoA, 30);
        jugador.interactuarCon(enemigoB, 40);
    }
}
