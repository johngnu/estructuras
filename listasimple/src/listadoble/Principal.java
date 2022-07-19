package listadoble;

import java.util.Scanner;

/**
 *
 * @author desktop
 */
public class Principal {

    public static void main(String[] args) {
        listaD ld = new listaD();
        ld.adiPrimeroLD("mouse");
        ld.adiPrimeroLD("monitor");
        ld.adiPrimeroLD("teclado");
        //ld.mostrarLD();
        ld.adiFinalLD("aaa");
        ld.adiFinalLD("escaner");
        ld.mostrarLD();
        /*nodoD el = ld.eliFinalLD();
        System.out.println("eliminado:" + el.getDato());
        el = ld.eliFinalLD();
        System.out.println("eliminado:" + el.getDato());
        el = ld.eliFinalLD();
        System.out.println("eliminado:" + el.getDato());
        el = ld.eliFinalLD();
        System.out.println("eliminado:" + el.getDato());
        el = ld.eliFinalLD();
        System.out.println("eliminado:" + el.getDato());
        System.out.println("**************");
        ld.mostrarLD();*/
        System.out.println("**************");
        //modifica(ld, "plotter");
        //ld.mostrarLD();
        ordenar(ld);
        ld.mostrarLD();
    }

    /*ordenar lista*/
    public static void ordenar(listaD ld) {
        int cn = cantidadNodos(ld);
        for (int i = 0; i < cn; i++) {
            nodoD q = ld.getP();
            nodoD r = ld.getP();
            while (r.getSig() != null) {
                q = r.getSig();
                if (r.getDato().compareTo(q.getDato()) > 0) {
                    String aux = q.getDato();
                    q.setDato(r.getDato());
                    r.setDato(aux);
                }
                r = r.getSig();
            }
        }
    }

    public static int cantidadNodos(listaD ld) {
        nodoD q = ld.getP();
        int c = 0;
        while (q != null) {
            c = c + 1;
            q = q.getSig();
        }
        return c;
    }

    /*modificar una cadena*/
    public static void modifica(listaD ld, String x) {
        nodoD q = ld.getP();
        Scanner lee = new Scanner(System.in);
        boolean sw = false;
        while (q != null) {
            if (q.getDato().equals(x)) {
                System.out.println("escriba un nuevo dato:");
                String cad = lee.next();
                q.setDato(cad);
                sw = true;
            }
            q = q.getSig();
        }
        if (!sw) {
            System.out.println(" cadena no encontrada");
        }
    }
}
