package examen;

/**
 *
 * @author desktop
 */
public class pilaAlbum {

    private Album p[];
    int max, tope;

    public pilaAlbum(int m) {
        max = m;
        p = new Album[max];
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

    public void adiPila(Album x) {
        if (esLlena()) {
            System.out.println("Pila llena");
        } else {
            tope = tope + 1;
            p[tope] = x;
        }
    }

    public Album eliPila() {
        Album x = null;
        if (esVacia()) {
            System.out.println("Pila vacia");
        } else {
            x = p[tope];
            tope = tope - 1;
        }
        return x;
    }

    public void mostrarPila() {
        pilaAlbum paux = new pilaAlbum(max);
        Album x;
        while (!esVacia()) {
            x = eliPila();
            x.mostrarAlbum();
            paux.adiPila(x);
        }
        vaciarPila(paux);
        System.out.println();
    }

    public void vaciarPila(pilaAlbum paux) {
        while (!paux.esVacia()) {
            Album x = paux.eliPila();
            adiPila(x);
        }
    }
}
