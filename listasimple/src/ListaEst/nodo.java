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
public class nodo {
    private estudiante dato;
    private nodo sig;

    public nodo() {
        this.sig=null;        
    }

    public estudiante getDato() {
        return dato;
    }

    public void setDato(estudiante dato) {
        this.dato = dato;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }
    
    
    
}
