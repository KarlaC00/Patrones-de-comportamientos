import java.util.Scanner;

public class PruebaCadena {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        Aplication aplicacion = new Aplication();
        Middle intermediario = new Middle(aplicacion);
        FrontEnd presentacion = new FrontEnd(intermediario);

        do{
            System.out.println("Selecciona la ayuda que deseas observar:");
            System.out.println("1) Presentación");
            System.out.println("2) Intermediario");
            System.out.println("3) Aplicación");
            System.out.println("0) Salir del programa");

            opcion = sc.nextInt();
            if (opcion!=0){
                presentacion.getAyuda(opcion);
            }

        }while (opcion!=0);
    }
}
