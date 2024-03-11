public class Cuenta {
    //Receiver
    private int id;
    private double saldo;

    //Se inicializan los valores
    public Cuenta(int id, double saldo){
        this.id = id;
        this.saldo = saldo;
    }

    public void retirar (double monto){
        this.saldo = saldo-monto;
        System.out.println("[COMANDO RETIRAR] Cuenta: "+ id+ "Saldo: "+this.saldo);
    }

    public void depositar (double monto){
        this.saldo = saldo+monto;
        System.out.println("[COMANDO DEPOSITAR] Cuenta: "+ id+ "Saldo: "+this.saldo);
    }
}
