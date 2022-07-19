/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealistas;

/**
 *
 * @author desktop
 */
public class NodoE {

    private Estudiante dato;
    private NodoE sig;

    public NodoE() {
        sig = null;
    }

    public Estudiante getDato() {
        return dato;
    }

    public void setDato(Estudiante dato) {
        this.dato = dato;
    }

    public NodoE getSig() {
        return sig;
    }

    public void setSig(NodoE sig) {
        this.sig = sig;
    }

}
