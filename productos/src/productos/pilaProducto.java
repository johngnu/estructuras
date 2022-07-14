package productos;

/**
 *
 * @author desktop
 */
public class pilaProducto {

    private Producto p[];
    int max, tope;

    public pilaProducto(int m) {
        max = m;
        p = new Producto[max];
        tope = -1;
    }

    public boolean esVacia() {
        if (tope == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (tope == (max - 1)) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPila(Producto x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Producto eliPila() {
        Producto x = null;
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        pilaProducto paux = new pilaProducto(max);
        Producto x;
        while (!esVacia()) {
            x = eliPila();
            x.mostrarProducto();
            paux.adiPila(x);
        }
        vaciarPila(paux);
        System.out.println();
    }

    public void vaciarPila(pilaProducto paux) {
        while (!paux.esVacia()) {
            Producto x = paux.eliPila();
            adiPila(x);
        }
    }
}
