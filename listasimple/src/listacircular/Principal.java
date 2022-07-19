package listacircular;

/**
 *
 * @author desktop
 */
public class Principal {
    public static void main(String[] args) {
        listaSC lsc = new listaSC();
        /*lsc.adiPrimeroLSC("d1");
        lsc.adiPrimeroLSC("d2");
        lsc.adiPrimeroLSC("d3");
        lsc.adiPrimeroLSC("d4");
        lsc.mostrarLSC();*/
        //System.out.println("nro nodos: " + lsc.nroNodos());
        //lsc.mostrarLSC2();
        lsc.adiFinalLSC("f1");
        lsc.adiFinalLSC("f2");
        lsc.mostrarLSC2();
        nodo e1 = lsc.eliFinalLSC();
        System.out.println("eliminado: " + e1.getDato());
        e1 = lsc.eliFinalLSC();
        System.out.println("eliminado: " + e1.getDato());
        lsc.mostrarLSC();
    }
}
