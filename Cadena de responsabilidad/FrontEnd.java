public class FrontEnd implements InterfaceAyuda{
    private final int TIPO_AYUDA = 1;
    private InterfaceAyuda sucesor;

    public FrontEnd(InterfaceAyuda s){
        this.sucesor = s;
    }

    @Override
    public void getAyuda(int tipo){
        if (tipo == TIPO_AYUDA){
            System.out.println("\t==Ayuda desde Presentación");
        }else{
            sucesor.getAyuda(tipo);
        }
    }
}
