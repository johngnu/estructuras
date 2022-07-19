package listadoble;

/**
 *
 * @author desktop
 */
public class nodoD {

    private String dato;
    private nodoD ant;
    private nodoD sig;

    public nodoD() {
        ant = sig = null;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public nodoD getAnt() {
        return ant;
    }

    public void setAnt(nodoD ant) {
        this.ant = ant;
    }

    public nodoD getSig() {
        return sig;
    }

    public void setSig(nodoD sig) {
        this.sig = sig;
    }

}
