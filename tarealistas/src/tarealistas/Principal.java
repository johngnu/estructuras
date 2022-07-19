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
        // materias para juan
        Materias ms1 = new Materias(m1, 20, 20, 20, 5);
        Materias ms2 = new Materias(m2, 10, 20, 20, 0);
        Materias ms3 = new Materias(m3, 15, 20, 20, 5);
        Materias ms4 = new Materias(m4, 20, 20, 20, 1);
        // materias para ana
        Materias ms5 = new Materias(m1, 20, 20, 20, 5);
        Materias ms6 = new Materias(m2, 10, 10, 10, 5);
        
        ListaDM ldm1 = new ListaDM();
        ldm1.adiPrimeroLD(ms1);
        ldm1.adiPrimeroLD(ms2);
        ldm1.adiPrimeroLD(ms3);
        ldm1.adiPrimeroLD(ms4);
        
        ListaDM ldm2 = new ListaDM();
        ldm2.adiFinalLD(ms5);
        ldm2.adiFinalLD(ms6);
                
        Estudiante e1 = new Estudiante("juan", ldm1, 3, 2022);
        Estudiante e2 = new Estudiante("ana", ldm2, 3, 2022);
                
        //e1.mostrar();
        
        //e2.mostrar();
        
        listaSE lse = new listaSE();
        lse.adiFinalLista(e2);
        lse.adiFinalLista(e2);
        lse.mostrarListaSimple();
        
    }
    
}
