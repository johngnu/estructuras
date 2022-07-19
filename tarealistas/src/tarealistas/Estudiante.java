package tarealistas;

/**
 *
 * @author desktop
 */
public class Estudiante {

    private String nombre;
    private ListaDM lsm;
    private int semestre;
    private int gestion;

    public Estudiante() {
    }

    public Estudiante(String nombre, ListaDM lsm, int semestre, int gestion) {
        this.nombre = nombre;
        this.lsm = lsm;
        this.semestre = semestre;
        this.gestion = gestion;
    }

    public void mostrar() {
        System.out.println("\n*************************************");
        System.out.println("nombre: " + nombre + " semestre: " + semestre + " gestion: " + gestion);
        lsm.mostrarLD();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ListaDM getLsm() {
        return lsm;
    }

    public void setLsm(ListaDM lsm) {
        this.lsm = lsm;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getGestion() {
        return gestion;
    }

    public void setGestion(int gestion) {
        this.gestion = gestion;
    }

}
