package tarealistas;

/**
 *
 * @author desktop
 */
public class Materias {
    private Materia mat;
    private int n1;
    private int n2;
    private int nef;
    private int ay;

    public Materias() {
    }

    public Materias(Materia mat, int n1, int n2, int nef, int ay) {
        this.mat = mat;
        this.n1 = n1;
        this.n2 = n2;
        this.nef = nef;
        this.ay = ay;
    }

    public void mostrar () {
        mat.mostrar();
        System.out.println("n1: " + n1 + " n2: " + n2 + " nef: " + nef + " ay: " + ay);
    }
    
    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getNef() {
        return nef;
    }

    public void setNef(int nef) {
        this.nef = nef;
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }
    
     
}
