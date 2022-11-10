package trabajo5;


public class CongPorAgua extends Congelados {
    private int Salinidad;
    public CongPorAgua(int Salinidad){
        super("",0);
    }
    public CongPorAgua(String temp_Cong, int Salinidad){
        super(temp_Cong, 0);
    }
    public void setSalinidad(int Salinidad){
        this.Salinidad=Salinidad;
    }
    public int getSalinidad(){
        return Salinidad;
    }
    public void Mostrarfechaynrodelote(){
        System.out.println("The date of the frozen with water is: "+getFecha()+" the lote number is: "+getNro_Lote());
    }
    public void MostrarSalinidad(){
        System.out.println("The percentage of salinity is: "+getSalinidad());
    }
    public void MostrarTemperatura(){
        System.out.println("The temperature is: "+getTemp_Cong());
    }
}