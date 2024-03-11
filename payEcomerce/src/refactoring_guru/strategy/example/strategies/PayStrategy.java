package refactoring_guru.strategy.example.strategies;

/**
 * Interfaz común para todas las estrategias.
 */
public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
