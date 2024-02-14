
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

    
    
}
