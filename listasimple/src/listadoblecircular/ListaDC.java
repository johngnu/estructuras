package listadoblecircular;

/**
 *
 * @author desktop
 */
public class ListaDC {

    private nodoD p;

    public ListaDC() {
        p = null;
    }

    public nodoD getP() {
        return p;
    }

    public void setP(nodoD p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimeroLDC(String x) {
        nodoD nuevo = new nodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
        } else {
            nodoD q = p.getAnt();
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            q.setSig(nuevo);
            nuevo.setAnt(q);
            setP(nuevo);
        }
    }

    public void adiFinalLDC(String x) {
        nodoD nuevo = new nodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
            nuevo.setAnt(nuevo);
        } else {
            nodoD q = getP().getAnt();
            q.setSig(nuevo);
            nuevo.setAnt(q);
            nuevo.setSig(getP());
            p.setAnt(nuevo);
        }
    }

    public nodoD eliPrimeroLDC() {
        nodoD aux = getP();
        if (aux.getSig() == getP()) {
            setP(null);
        } else {
            nodoD q = p.getAnt();
            setP(aux.getSig());
            aux.setAnt(null);
            aux.setSig(null);
            q.setSig(getP());
            p.setAnt(q);
        }
        return aux;
    }

    public nodoD eliFinalLDC() {
        nodoD aux = getP();
        if (aux.getSig() == getP()) {
            setP(null);
        } else {
            aux = p.getAnt();
            nodoD q = aux.getAnt();
            aux.setSig(null);
            aux.setAnt(null);
            q.setSig(getP());
            p.setAnt(q);
        }
        return aux;
    }

    public int nroNodos() {
        int c = 0;
        nodoD q = getP();
        if (!esVacia()) {
            while (q.getSig() != getP()) {
                c++;
                q = q.getSig();
            }
            c++;
        }
        return c;
    }

    public void mostrarLDC() {
        nodoD q = getP();
        if (esVacia()) {
            System.out.println(" lista vacia");
        } else {
            for (int i = 0; i < nroNodos(); i++) {
                System.out.println(" " + q.getDato());
                q = q.getSig();
            }
        }
    }
}
