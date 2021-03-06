package examen;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // artista 1
        Artista ar1 = new Artista("Maluma", "bebito@mail.com");
        //ar1.mostrarArtista();
        // canciones
        Cancion c1 = new Cancion("Don't cry", "rock");
        //c1.mostrarCancion();
        colaCancion ca1 = new colaCancion(2);
        ca1.adiCola(c1);
        Album a1 = new Album("Maluma baby", "mexico", ar1, ca1);

        // artista 2
        Artista ar2 = new Artista("Bony Lovy", "elbony@gmail.com");
        // canciones
        Cancion c2 = new Cancion("Muchachita", "regueton");
        Cancion c3 = new Cancion("La Cumbia Boliviana", "cumbia");
        colaCancion ca2 = new colaCancion(2);
        ca2.adiCola(c2);
        ca2.adiCola(c3);
        //ca2.mostrarColaSimple();

        Album a2 = new Album("Por Bolivia", "La franquisia", ar2, ca2);

        // pila album
        pilaAlbum pa = new pilaAlbum(5);
        pa.adiPila(a1);
        pa.adiPila(a2);
        //pa.mostrarPila();
        System.out.println("A) ... mostrar solo canciones del artista x ");
        mostrarCancionesArtista(pa, "Bony Lovy");
        
        System.out.println("B) ... eliminar canciones del genro y titulo album y ");
        eliminarCanciones(pa, "cumbia", "Por Bolivia");
        
        // volver a mostrar para ver que se elimino
        mostrarCancionesArtista(pa, "Bony Lovy");
    }

    public static void mostrarCancionesArtista(pilaAlbum pa, String xa) {
        pilaAlbum paux = new pilaAlbum(pa.max);
        Album x;
        while (!pa.esVacia()) {
            x = pa.eliPila();
            if (x.getA().getNombreArtista().equals(xa)) {
                x.getCa().mostrarColaSimple();
            }
            paux.adiPila(x);
        }
        pa.vaciarPila(paux);
    }

    public static void eliminarCanciones(pilaAlbum pa, String z, String y) {
        pilaAlbum paux = new pilaAlbum(pa.max);
        Album x;
        while (!pa.esVacia()) {
            x = pa.eliPila();
            if (x.getTitulo().equals(y)) {
                colaCancion caux = new colaCancion(x.getCa().max);
                Cancion xc;
                while (!x.getCa().esVacia()) {
                    xc = x.getCa().eliCola();
                    if (!xc.getGenero().equals(z)) {
                        caux.adiCola(xc);
                    }
                }
                x.getCa().vaciar(caux);
            }
            paux.adiPila(x);
        }
        pa.vaciarPila(paux);
    }

}
