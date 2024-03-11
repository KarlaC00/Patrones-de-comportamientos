//Emisora
import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private List<IOperacion> operaciones = new ArrayList<>();

    //Recibe la operación y la almacena en la lista

    public void recibirOperacion(IOperacion operacion){
        this.operaciones.add(operacion);
    }

    //Para cada operación, ejecuta los métodos
    public void realizarOperaciones(){
        this.operaciones.forEach(x -> x.execute());
        //Al terminar la operación, limpia la lista
        this.operaciones.clear();
    }
}
