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
        //pa.adiPila(a1);
        pa.adiPila(a2);
        pa.mostrarPila();
    }
    
    public static void mostrarCancionesArtista(String x) {
        
    }

}
