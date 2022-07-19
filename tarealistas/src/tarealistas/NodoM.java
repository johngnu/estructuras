package tarealistas;

/**
 *
 * @author desktop
 */
public class NodoM {

    private Materias dato;
    private NodoM ant;
    private NodoM sig;

    public NodoM() {
        ant = sig = null;
    }

    public Materias getDato() {
        return dato;
    }

    public void setDato(Materias dato) {
        this.dato = dato;
    }

    public NodoM getAnt() {
        return ant;
    }

    public void setAnt(NodoM ant) {
        this.ant = ant;
    }

    public NodoM getSig() {
        return sig;
    }

    public void setSig(NodoM sig) {
        this.sig = sig;
    }

}
