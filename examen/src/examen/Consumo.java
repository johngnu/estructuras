package examen;

/**
 *
 * @author desktop
 */
public class Consumo {
    private String nombreProd;
    private int precio;

    public Consumo() {
    }

    public Consumo(String nombreProd, int precio) {
        this.nombreProd = nombreProd;
        this.precio = precio;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
