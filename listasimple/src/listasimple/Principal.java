package listasimple;

public class Principal {
    public static void main(String[] args) {
        ListaS lis = new ListaS();
        lis.adiFinalLista(10);
        lis.adiFinalLista(25);
        lis.adiFinalLista(18);
        lis.adiFinalLista(15);
        lis.mostrarListaSimple();
        lis.adiPrincipioLista(4);
        lis.adiPrincipioLista(7);
        lis.mostrarListaSimple();
        Nodo eli = lis.eliNodoInicio();
        System.out.println("Eliminado: "+eli.getDato());
        eli = lis.eliNodoInicio();
        System.out.println("Eliminado: "+eli.getDato());
        eli = lis.eliNodoInicio();
        System.out.println("Eliminado: "+eli.getDato());
        eli = lis.eliNodoFinal();
        lis.mostrarListaSimple();
        System.out.println("Eliminado: "+eli.getDato());
        eli = lis.eliNodoFinal();
        System.out.println("Eliminado: "+eli.getDato());
        
        
        
        lis.mostrarListaSimple();
    }
    
}
