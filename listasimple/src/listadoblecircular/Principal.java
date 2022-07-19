package listadoblecircular;

/**
 *
 * @author desktop
 */
public class Principal {
    
    public static void main(String[] args) {
        ListaDC ldc = new ListaDC();
        ldc.adiPrimeroLDC("d1");
        ldc.adiPrimeroLDC("d2");
        ldc.adiPrimeroLDC("d3");
        ldc.adiPrimeroLDC("d4");
        ldc.mostrarLDC();
        ldc.adiFinalLDC("f1");
        ldc.adiFinalLDC("f2");
        ldc.mostrarLDC();
        
        nodoD e1 = ldc.eliFinalLDC();
        System.out.println("elimnado: " + e1.getDato());
        e1 = ldc.eliPrimeroLDC();
        System.out.println("elimnado: " + e1.getDato());
        
        nodoD ep = eliminarPos(ldc, 3);
        System.out.println("eliminado: " + ep.getDato());
        
    }
    
    public static nodoD eliminarPos(ListaDC ld, int pos) {
        nodoD aux = ld.getP();
        if (ld.nroNodos() == 1) {
            ld.setP(null);
        }
        for (int i = 0; i < ld.nroNodos(); i++) {
            if (i == pos) {
                if (pos == 1) {
                    ld.setP(aux.getSig());
                }
                nodoD q = aux.getSig();
                nodoD r = aux.getAnt();
                aux.setAnt(null);
                aux.setSig(null);
                r.setSig(q);
                q.setAnt(r);
                break;
            }
            aux = aux.getSig();
        }
        return aux;
    }
}
