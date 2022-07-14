package examen;

/**
 *
 * @author desktop
 */
public class Cancion {

    private String titulo;
    private String genero;

    public Cancion() {
    }

    public Cancion(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
    }

    public void mostrarCancion() {
        System.out.println("Titulo: " + titulo + " Genero: " + genero);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
