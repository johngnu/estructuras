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

    public Artista(String nombreArtista, Strign correo) {
        this.nombreArtista = nombreArtista;
        this.correo = correo;
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
