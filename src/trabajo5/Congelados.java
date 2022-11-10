package trabajo5;


public class Congelados extends Productos{
    protected String temp_Cong;
    public Congelados(String Fecha, int nro_Lote){
         super(Fecha, nro_Lote);
         temp_Cong="unknow";
    }
    public void setTemp_Cong(String temp_Cong){
        this.temp_Cong=temp_Cong;
    }
    public String getTemp_Cong(){
        return temp_Cong;
    }
}
