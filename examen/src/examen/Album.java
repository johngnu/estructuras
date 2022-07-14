package examen;

/**
 *
 * @author desktop
 */
public class Album {

    private String titulo;
    private String nombreProductos;
    private Artista a;
    private ColaCancion ca;

    public Album() {
    }

    public Album(String titulo, String nombreProductos, Artista a, ColaCancion ca) {
        this.titulo = titulo;
        this.nombreProductos = nombreProductos;
        this.a = a;
        this.ca = ca;
    }

    public void mostrarAlbum() {

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreProductos() {
        return nombreProductos;
    }

    public void setNombreProductos(String nombreProductos) {
        this.nombreProductos = nombreProductos;
    }

    public Artista getA() {
        return a;
    }

    public void setA(Artista a) {
        this.a = a;
    }

    public ColaCancion getCa() {
        return ca;
    }

    public void setCa(ColaCancion ca) {
        this.ca = ca;
    }

}
