package listacircular;

/**
 *
 * @author desktop
 */
public class listaSC {

    private nodo p;

    public listaSC() {
        p = null;
    }

    public nodo getP() {
        return p;
    }

    public void setP(nodo p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimeroLSC(String x) {
        nodo nuevo = new nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            nodo q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            nuevo.setSig(getP());
            q.setSig(nuevo);
            setP(nuevo);
        }
    }

    public void adiFinalLSC(String x) {
        nodo nuevo = new nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
            nuevo.setSig(nuevo);
        } else {
            nodo q = getP();
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setSig(getP());
        }
    }

    public nodo eliPrimeroLSC() {
        nodo aux = getP();
        nodo q = getP();
        if (q.getSig() == getP()) {
            setP(null);
        } else {
            while (q.getSig() != getP()) {
                q = q.getSig();
            }
            setP(aux.getSig());
            q.setSig(getP());
            aux.setSig(null);
        }
        return aux;
    }

    public nodo eliFinalLSC() {
        nodo aux = getP();
        nodo q = getP();
        if (q.getSig() == getP()) {
            setP(null);
        } else {
            while (aux.getSig() != getP()) {
                q = aux;
                aux = aux.getSig();
            }
            q.setSig(getP());
            aux.setSig(null);
        }
        return aux;
    }

    public void mostrarLSC() {
        if (esVacia()) {
            System.out.println(" lista vacia");
        } else {
            nodo q = getP();
            while (q.getSig() != getP()) {
                System.out.println(" " + q.getDato());
                q = q.getSig();
            }
            System.out.println(" " + q.getDato());
        }
    }

    public int nroNodos() {
        nodo q = getP();
        int c = 0;
        if (!esVacia()) {
            while (q.getSig() != getP()) {
                c = c + 1;
                q = q.getSig();
            }
            c = c + 1;
        }
        return c;
    }

    public void mostrarLSC2() {
        nodo q = getP();
        for (int i = 0; i < nroNodos(); i++) {
            System.out.println(" " + q.getDato());
            q = q.getSig();
        }
    }
}
