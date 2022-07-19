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
public class Principal {
    public static void main(String[] args) {
        /*estudiante e1 = new estudiante(11, "juan", 25, 30);
        estudiante e2 = new estudiante(22, "ana", 30, 30);
        estudiante e3 = new estudiante(33, "pedro", 40, 20); 
        listaSE lse = new listaSE();
        lse.adiFinalLista(e1);
        lse.adiFinalLista(e2);
        lse.adiFinalLista(e3);
        lse.mostrarListaSimple();
        estudiante e4 = new estudiante(44, "maria", 25, 30);
        lse.adiFinalLista(e4);
        lse.mostrarListaSimple();*/
        Ventana v = new Ventana(40, 10);
        v.mostrar();        
        v.setAncho(500);
        v.mostrar();
        
        Pestana p = new Pestana();
        String f = "fgdfg";
        Integer i = 5;
        Double d = new Double("20.9");
        System.out.println(d);
    }
    
}
