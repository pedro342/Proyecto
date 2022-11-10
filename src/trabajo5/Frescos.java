package trabajo5;


public class Frescos extends Productos {
    private String fecha_Env;
    private String pais_Origen;
    public Frescos(String Fecha, int nro_Lote){
        super(Fecha, nro_Lote);
    }
    public void setFecha_Env(String fecha_Env){
        this.fecha_Env=fecha_Env;
    }
    public void setPais_Origen(String pais_Origen){
        this.pais_Origen=pais_Origen;
    }
    public String getFecha_Env(){
        return fecha_Env;
    }
    public String getPais_Origen(){
        return pais_Origen;
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
    public void mostrarFechaYNroDeLote(){
        System.out.println("The date is: "+getFecha()+" Number of lote is: "+getNro_Lote());
    }
    public void mostrarFechaYOrigen(){
        System.out.println("The date is: "+getFecha_Env()+" country from is: "+getPais_Origen());
    }
}