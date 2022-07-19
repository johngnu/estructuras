package tarealistas;

/**
 *
 * @author desktop
 */
public class ListaDM {

    private NodoM p;

    public ListaDM() {
        p = null;
    }

    public NodoM getP() {
        return p;
    }

    public void setP(NodoM p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (p == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiPrimeroLD(Materias x) {
        NodoM nuevo = new NodoM();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(getP());
            p.setAnt(nuevo);
            setP(nuevo);
        }
    }

    public void adiFinalLD(Materias x) {
        NodoM nuevo = new NodoM();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            NodoM q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
            nuevo.setAnt(q);
        }
    }

    public NodoM eliPrimeroLD() {
        NodoM q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            p = p.getSig();
            q.setSig(null);
            p.setAnt(null);
        }
        return q;
    }

    public NodoM eliFinalLD() {
        NodoM q = getP();
        if (p.getSig() == null) {
            setP(null);
        } else {
            while (q.getSig() != null) {
                q = q.getSig();
            }
            NodoM r = q.getAnt();
            r.setSig(null);
            q.setAnt(null);
        }
        return q;
    }

    public void mostrarLD() {
        NodoM q = getP();
        while (q != null) {
            System.out.print(" " + q.getDato());
            q = q.getSig();
        }
        System.out.println(" -- null");
    }
}
