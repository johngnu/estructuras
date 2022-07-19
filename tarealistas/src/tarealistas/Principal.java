package tarealistas;

/**
 *
 * @author desktop
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Materia m1 = new Materia("LAB131", "Laboratorio");
        Materia m2 = new Materia("INF131", "Estructuras y algoritmos");
        Materia m3 = new Materia("MAT115", "Calculo 1");
        Materia m4 = new Materia("MAT114", "Algebra");
        Materias ms1 = new Materias(m1, 20, 20, 20, 5);
        Materias ms2 = new Materias(m2, 20, 20, 20, 5);
        Materias ms3 = new Materias(m3, 20, 20, 20, 5);
        Materias ms4 = new Materias(m4, 20, 20, 20, 5);
        
        ListaDM ldm = new ListaDM();
        ldm.adiPrimeroLD(ms1);
        ldm.adiPrimeroLD(ms2);
        ldm.adiPrimeroLD(ms3);
        ldm.adiPrimeroLD(ms4);
                
        Estudiante e1 = new Estudiante("juan", ldm, 3, 2022);
        e1.mostrar();
    }
    
}
