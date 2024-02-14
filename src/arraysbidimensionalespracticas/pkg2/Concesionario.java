package arraysbidimensionalespracticas.pkg2;

import utilidades.AlfaNumerico;
import utilidades.Fecha;
import utilidades.Numero;

public class Concesionario {

    Modelo modelos[];
    String tipos[] = {
        "Turismo",
        "Deportivo",
        "Todo terreno"
    };
    float porcentajes[][] = {
        {0.15f, 0.1f, 0.1f, 0.18f, 0.06f},
        {0.18f, 0.12f, 0.14f, 0.2f, 0.08f},
        {0.21f, 0.14f, 0.16f, 0.22f, 0.1f}
    };
    float limites[] = {
        15000f,
        30000f,
        50000f,
        10000f,
        Float.MAX_VALUE
    };
    public Concesionario(int numeroModelos){
        modelos=new Modelo[numeroModelos];
    }
    public Concesionario(){
        modelos=new Modelo[15];
    }

    public void cargarModelos() {
    for(int numeroModelo=0; numeroModelo<modelos.length;numeroModelo++){
        String nombreModelo=AlfaNumerico.pedirAlfaNumérico("Introduzca nombre del modelo "+(numeroModelo+1));
        int tipoModelo=pedirTipo();
        modelos[numeroModelo]=new Modelo(nombreModelo,tipoModelo);
    }
    }

    public void cargarVentas() {     
           float ventas []=new float [6];
           for(int venta=0;venta<ventas.length;venta++){
               for(int numModelo=0;numModelo<modelos.length;numModelo++){
               float ventaMes=Numero.pedirNumeroRealPositivo("Introduzca las ventas del mes "+(venta+1)
                       +" del modelo "+modelos[numModelo].getDenominacion(), 0);
               modelos[numModelo].getVentas()[venta]=ventaMes;
               }
           }
           
        
    }

    public void emitirInforme() {
       Fecha fechaHoy=new Fecha();
        System.out.println("INFORME VENTAS");
        System.out.println("Fecha: "+fechaHoy.fechaCompletaMesLetra());
        System.out.println("Modelo coche \t Importe ventas 1 trimestre \t Importe ventas 2º trimestre \t Beneficio");
        
    }
    private int buscarTipo(String nombreTipo){
        int pos=0;
        boolean existeTipo=false;
        while(!existeTipo && pos<tipos.length){
            if(tipos[pos].equalsIgnoreCase(nombreTipo)){
                existeTipo=true;
            }else{
                pos++;
            }
        }
        if(!existeTipo){
            pos=-1;
        }
        return pos;
    }
    private void buscarLimite(){
        
    }
    private void calcularBeneficio(){
        
    }

    private int pedirTipo() {
        
        String nombreTipo=AlfaNumerico.pedirAlfaNumérico("Introduzca el tipo");
        int tipo=buscarTipo(nombreTipo);
        while(tipo==-1){
            nombreTipo=AlfaNumerico.pedirAlfaNumérico("Introduzca el tipo");
            tipo=buscarTipo(nombreTipo);
        }
     return tipo;   
    }
    
}
