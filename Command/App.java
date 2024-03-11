//Cliente
public class App {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1, 250000);

        Depositar opDepositar = new Depositar(cuenta, 25000);
        Retirar opRetirar = new Retirar(cuenta, 15000);

        Invoker ivk = new Invoker();
        ivk.recibirOperacion(opDepositar);
        ivk.recibirOperacion(opRetirar);

        ivk.realizarOperaciones();
    }
}
