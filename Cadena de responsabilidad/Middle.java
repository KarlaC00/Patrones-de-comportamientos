public class Middle implements InterfaceAyuda{
    private final int TIPO_AYUDA = 2;
    private InterfaceAyuda sucesor;

    public Middle(InterfaceAyuda s){
        this.sucesor = s;
    }

    @Override
    public void getAyuda(int tipo){
        if (tipo == TIPO_AYUDA){
            System.out.println("\t==Ayuda desde Intermediario");
        }else{
            sucesor.getAyuda(tipo);
        }
    }
}
