public class Aplication implements InterfaceAyuda{
    private final int TIPO_AYUDA = 3;

    public Aplication(){}

    @Override
    public void getAyuda(int tipo){
        System.out.println("\t==Ayuda desde Aplicación");
    }
}
