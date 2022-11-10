package trabajo5;


public class CongPorAire extends Congelados {
    private String comp_Aire;
    public CongPorAire(String Comp_Aire){
        super("",0);
    }
    public CongPorAire(String temp_Cong, float comp_Aire){
        super(temp_Cong, 0);
    }
        public void setComp_Aire(String comp_Aire){
        this.comp_Aire=comp_Aire;
    }
    public void setCongPorAire(String temp_Cong){
        this.temp_Cong=temp_Cong;   
    }
    public void MostrarFechaYNroDeLote(){
        System.out.println("The date of the frozen with air is: "+getFecha()+" the lote number is: "+getNro_Lote());
    }
    public void MostrarComposicionDelAire(){
        
    }
    public void MostrarTemperatura(){
        System.out.println("The temperature is: "+getTemp_Cong());
    }
}
