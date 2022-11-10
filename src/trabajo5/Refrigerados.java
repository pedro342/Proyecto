package trabajo5;


public class Refrigerados extends Productos{
    private String cod_Org;
    public Refrigerados(String Fecha, int nro_Lote){
         super(Fecha, nro_Lote); 
    }
    public void setCod_Org(String cod_Org){
        this.cod_Org=cod_Org;
    }
    public String getCod_Org(){
        return cod_Org;
    }
    public void mostrarFechaYNroDeLote(){
        System.out.println("La fecha de los refrigerados es: "+getFecha()+" y el numero de lote es: "+getNro_Lote());
    }
    public void mostrarCodigoDeOrigen(){
        System.out.println("the origin code is: "+getCod_Org());
    }
}