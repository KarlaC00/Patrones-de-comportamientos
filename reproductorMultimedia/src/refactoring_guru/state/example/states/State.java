package refactoring_guru.state.example.states;

import refactoring_guru.state.example.ui.Player;

/**
 * Interfaz común para todos los estados.
 */
public abstract class State {
    Player player;

    /**
     * El contexto pasa por sí mismo a través del constructor de estado. Esto puede ayudar a un
     * estado para obtener algunos datos de contexto útiles si es necesario.
     */
    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
