package trabajo5;

public class Productos {
    protected String Fecha;
    protected int nro_Lote;
    public Productos(String Fecha, int nro_Lote){
        this.Fecha=Fecha;
        this.nro_Lote=nro_Lote;
    }
    public void setFecha(String Fecha){
        this.Fecha=Fecha;
    }
    public String getFecha(){
        return Fecha;
    }
    public void setNro_Lote(int nro_Lote){
        this.nro_Lote=nro_Lote;
    }
    public int getNro_Lote(){
        return nro_Lote;
    }
}
