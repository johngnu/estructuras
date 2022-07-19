package listasimple;

/**
 *
 * @author desktop
 */
public class ListaS {

    private Nodo p;

    public ListaS() {
        this.p = null;
    }

    public Nodo getP() {
        return p;
    }

    public void setP(Nodo p) {
        this.p = p;
    }

    public boolean esVacia() {
        if (getP() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void adiFinalLista(int x) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            Nodo q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
        }
    }

    public void adiPrincipioLista(int x) {
        Nodo nuevo = new Nodo();
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
        Nodo q = getP();
        int x;
        while (q != null) {
            x = q.getDato();
            System.out.print(" "+ x);
            q = q.getSig();
        }
        System.out.println(" -- null");
    }

    public Nodo eliNodoInicio() {
        Nodo q = getP();
        if (getP() == null) {
            System.out.println("lista vacia");
        } else {
            p = p.getSig();
            q.setSig(null);
        }
        return q;
    }

    public Nodo eliNodoFinal() {
        Nodo q = getP();
        Nodo r = getP();
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
