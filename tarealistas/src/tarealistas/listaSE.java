package tarealistas;

/**
 *
 * @author desktop
 */
public class listaSE {

    private NodoE p;

    public listaSE() {
        this.p = null;
    }

    public NodoE getP() {
        return p;
    }

    public void setP(NodoE p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiFinalLista(Estudiante x) {
        NodoE nuevo = new NodoE();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            NodoE q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
        }
    }

    public void adiPrincipioLista(Estudiante x) {
        NodoE nuevo = new NodoE();
        nuevo.setDato(x);
        nuevo.setSig(p);
        setP(nuevo);
        /*if (esVacia()) {
            setP(nuevo);
        } else {
            nuevo.setSig(p);
            setP(nuevo);
        }*/
    }

    public void mostrarListaSimple() {
        NodoE q = getP();
        Estudiante x;
        while (q != null) {
            x = q.getDato();
            //System.out.print(" " + x);
            x.mostrar();
            q = q.getSig();
        }
        System.out.println(" -- null");
    }

    public NodoE eliNodoInicio() {
        NodoE q = getP();
        if (getP() == null) {
            System.out.println("lista vacia");
        } else {
            p = p.getSig();
            q.setSig(null);
        }
        return q;
    }

    public NodoE eliNodoFinal() {
        NodoE q = getP();
        NodoE r = getP();
        if (q.getSig() == null) {
            setP(null);
        } else {
            while (q.getSig() != null) {
                r = q;
                q = q.getSig();
            }
            r.setSig(null);
        }
        return q;
    }

}
