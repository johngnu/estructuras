package tarealistas;

/**
 *
 * @author desktop
 */
public class Materia {

    private String sigla;
    private String nombreMat;

    public Materia() {
    }

    public Materia(String sigla, String nombreMat) {
        this.sigla = sigla;
        this.nombreMat = nombreMat;
    }

    public void mostrar() {
        System.out.println("sigla: " + sigla + " nomMat: " + nombreMat);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombreMat() {
        return nombreMat;
    }

    public void setNombreMat(String nombreMat) {
        this.nombreMat = nombreMat;
    }

}
