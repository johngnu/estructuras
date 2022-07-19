/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEst;

/**
 *
 * @author desktop
 */
public class listaSE {
    
    private nodo p;

    public listaSE() {
        this.p = null;
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

    public void adiFinalLista(estudiante x) {
        nodo nuevo = new nodo();
        nuevo.setDato(x);
        if (esVacia()) {
            setP(nuevo);
        } else {
            nodo q = getP();
            while (q.getSig() != null) {
                q = q.getSig();
            }
            q.setSig(nuevo);
        }
    }

    public void adiPrincipioLista(estudiante x) {
        nodo nuevo = new nodo();
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
        nodo q = getP();
        estudiante x;
        while (q != null) {
            x = q.getDato();
            x.mostrarEst();
            q = q.getSig();
        }
        System.out.println(" -- null");
    }

    public nodo eliNodoInicio() {
        nodo q = getP();
        if (getP() == null) {
            System.out.println("lista vacia");
        } else {
            p = p.getSig();
            q.setSig(null);
        }
        return q;
    }

    public nodo eliNodoFinal() {
        nodo q = getP();
        nodo r = getP();
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
