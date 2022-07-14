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
        // TODO code application logic here
        Artista a1 = new Artista("Maluma", "bebito@mail.com");
        
        a1.mostrarArtista();
        
        Cancion c1 = new Cancion("Don't cry", "rock");
        
        c1.mostrarCancion();
    }
    
}
