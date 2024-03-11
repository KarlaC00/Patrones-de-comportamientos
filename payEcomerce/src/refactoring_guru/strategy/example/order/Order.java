package refactoring_guru.strategy.example.order;

import refactoring_guru.strategy.example.strategies.PayStrategy;

/**
 * Clase de orden. No sabe el método de pago concreto (estrategia) que tiene el usuario
 * escogido. Utiliza una interfaz de estrategia común para delegar la recopilación de datos de pago.
 * al objeto de estrategia. Se puede utilizar para guardar pedidos en la base de datos.
 */
public class Order {
    private int totalCost = 0;
    private boolean isClosed = false;

    public void processOrder(PayStrategy strategy) {
        strategy.collectPaymentDetails();
        // Aquí podríamos recopilar y almacenar datos de pago de la estrategia.
    }

    public void setTotalCost(int cost) {
        this.totalCost += cost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed() {
        isClosed = true;
    }
}