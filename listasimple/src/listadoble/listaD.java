package listadoble;

/**
 *
 * @author desktop
 */
public class listaD {

    private nodoD p;

    public listaD() {
        p = null;
    }

    public nodoD getP() {
        return p;
    }

    public void setP(nodoD p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (p == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimeroLD(String x) {
        nodoD nuevo = new nodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adiFinalLD(String x) {
        nodoD nuevo = new nodoD();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            nodoD q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setAnt(q);
        }
    }

    public nodoD eliPrimeroLD() {
        nodoD q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            p = p.getSig();
            q.setSig(null);
            p.setAnt(null);
        }
        return q;
    }

    public nodoD eliFinalLD() {
        nodoD q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            while (q.getSig() != null) {
                q = q.getSig();
            }
            nodoD r = q.getAnt();
            r.setSig(null);
            q.setAnt(null);
        }
        return q;
    }

    public void mostrarLD() {
        nodoD q = getP();
        while (q != null) {
            System.out.print(" " + q.getDato());
            q = q.getSig();
        }
        System.out.println(" -- null");
    }
}
