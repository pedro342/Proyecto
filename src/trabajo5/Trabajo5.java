package trabajo5;

import java.util.*;

public class Trabajo5 {
    public static void main(String[] args) {
        //Pasar los valores a traves de los setters y de los parametros. Pedir que imprima las funciones
        Frescos PFrescos = new Frescos("13/03/2019", 24);
        PFrescos.mostrarFechaYNroDeLote();
        PFrescos.setFecha_Env("14/10/19");
        PFrescos.setPais_Origen("Germany");
        PFrescos.mostrarFechaYOrigen();
        PFrescos.setFecha_Env("15/09/19");
        PFrescos.setPais_Origen("Netherlands");
        PFrescos.mostrarFechaYOrigen();
        
        Refrigerados PRefrigerados = new Refrigerados("14/05/20",20);
        PRefrigerados.mostrarFechaYNroDeLote();
        PRefrigerados.setCod_Org("AFG 004");
        PRefrigerados.mostrarCodigoDeOrigen();
        PRefrigerados.setCod_Org("ALB 008");
        PRefrigerados.mostrarCodigoDeOrigen();
        PRefrigerados.setCod_Org("DEU 276");
        PRefrigerados.mostrarCodigoDeOrigen();
        
        CongPorAire PCongPorAire = new CongPorAire("10/03/18", 20);
        PCongPorAire.MostrarFechaYNroDeLote();
        PCongPorAire.setComp_Aire("");
        PCongPorAire.MostrarComposicionDelAire();
        PCongPorAire.setTemp_Cong("25");
        PCongPorAire.MostrarTemperatura();
        PCongPorAire.setComp_Aire("");
        PCongPorAire.setTemp_Cong("25");
        PCongPorAire.MostrarTemperatura();
        PCongPorAire.MostrarComposicionDelAire();
        
        CongPorAgua PCongPorAgua = new CongPorAgua("12/08/22", 49);
        PCongPorAgua.Mostrarfechaynrodelote();
        PCongPorAgua.setSalinidad(25);
        PCongPorAgua.MostrarSalinidad();
        PCongPorAgua.setSalinidad(23);
        PCongPorAgua.MostrarSalinidad();
        
        CongPorNit PCongPorNit = new CongPorNit("22/06/22", 28);
        PCongPorNit.mostrarfechaynrodelote();
        PCongPorNit.setMet_Cong("cryogenic method");
        PCongPorNit.setExp_Nit(3600);
        PCongPorNit.MostrarMetodoDeCongelacionYExposicionAlNitrogeno();
    }
   }