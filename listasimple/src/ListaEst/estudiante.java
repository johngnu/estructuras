package ListaEst;

public class estudiante {

    private int carnet;
    private String nombre;
    private int notaparcial;
    private int notafinal;

    public estudiante() {
    }

    public estudiante(int carnet, String nombre, int notaparcial, int notafinal) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.notaparcial = notaparcial;
        this.notafinal = notafinal;
    }

    public void mostrarEst() {
        System.out.println("CI: " + this.carnet + " Nombre " + this.nombre + " Parcial " + this.notaparcial + " NotaFinal " + this.notafinal);
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNotaparcial() {
        return notaparcial;
    }

    public void setNotaparcial(int notaparcial) {
        this.notaparcial = notaparcial;
    }

    public int getNotafinal() {
        return notafinal;
    }

    public void setNotafinal(int notafinal) {
        this.notafinal = notafinal;
    }

}
