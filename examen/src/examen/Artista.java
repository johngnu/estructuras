package examen;

/**
 *
 * @author desktop
 */
public class Artista {

    private String nombreArtista;
    private String correo;

    public Artista() {
    }

    public Artista(String nombreArtista, String correo) {
        this.nombreArtista = nombreArtista;
        this.correo = correo;
    }

    public void mostrarArtista() {
        System.out.println("Nombre: " + nombreArtista + " Correo: " + correo);
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
