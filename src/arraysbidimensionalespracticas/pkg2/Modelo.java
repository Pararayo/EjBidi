
package arraysbidimensionalespracticas.pkg2;


public class Modelo {
    private String denominacion;
    private int tipo;
    private float ventas[];

    public Modelo(String denominacion, int tipo) {
        this.denominacion = denominacion;
        this.tipo = tipo;
        ventas=new float[6];
    }

    public float[] getVentas() {
        return ventas;
    }

    public void setVentas(float[] ventas) {
        this.ventas = ventas;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void actualizarVentas(int pos, float ventaMes){
        ventas[pos]=ventaMes;
    }
    public float calcularVentasTotales(){
        float ventasTotales=0;
        for(int posVenta=0;posVenta<ventas.length;posVenta++){
            ventasTotales+=ventas[posVenta];
        }
        return ventasTotales;
    }
}
