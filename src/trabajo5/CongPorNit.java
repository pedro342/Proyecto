package trabajo5;


public class CongPorNit extends Congelados{
    private String met_Cong;
    private int Exp_Nit;
    public CongPorNit(String met_Cong, int Exp_Nit){
        super("",0);
    }
    public CongPorNit(String temp_Cong, String met_Cong, int Exp_Nit){
        super(temp_Cong, 0);
    }
    public void setMet_Cong(String met_Cong){
        this.met_Cong=met_Cong;
    }
    public String getMet_Cong(){
        return met_Cong;
    }
    public void setExp_Nit(int Exp_Nit){
        this.Exp_Nit=Exp_Nit;
    }
    public int getExp_Nit(){
        return Exp_Nit;
    }
    public void mostrarfechaynrodelote(){
        System.out.println("The date productos frozen with nitro is: "+getFecha()+" the lote number is: "+getNro_Lote());
    }
    public void MostrarMetodoDeCongelacionYExposicionAlNitrogeno(){
        System.out.println("The method was used: "+getMet_Cong());
        System.out.println("The exposure to nitro was: "+getExp_Nit());
    }
    public void MostrarTemperatura(){
        System.out.println("The temperature is: "+getTemp_Cong());
    }
}
