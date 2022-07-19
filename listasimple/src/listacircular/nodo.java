package listacircular;

/**
 *
 * @author desktop
 */
public class nodo {

    private String dato;
    private nodo sig;

    public nodo() {
        sig = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }

}
