package productos;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto p1 = new Producto("papa", 10, 5, 2022, "SI");
        Producto p2 = new Producto("queso", 10, 5, 2022, "SI");
        Producto p3 = new Producto("agua", 13, 5, 2022, "NO");
        Producto p4 = new Producto("refresco", 20, 5, 2022, "SI");
        
        pilaProducto pp = new pilaProducto(4);
        pp.adiPila(p1);
        pp.adiPila(p2);
        pp.adiPila(p3);
        pp.adiPila(p4);
        
        pp.mostrarPila();
    }
    
}
