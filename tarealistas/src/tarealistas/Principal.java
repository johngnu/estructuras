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
        Materia m1 = new Materia("lab-131", "laboratorio");
        Materia m2 = new Materia("inf-131", "estructuras y algoritmos");
        Materia m3 = new Materia("mat-115", "calculo 1");
        Materia m4 = new Materia("mat-114", "algebra");
        // materias para juan
        Materias ms1 = new Materias(m1, 20, 20, 20, 5);
        Materias ms2 = new Materias(m2, 10, 20, 20, 0);
        Materias ms3 = new Materias(m3, 15, 20, 20, 5);
        Materias ms4 = new Materias(m4, 20, 20, 20, 1);
        // materias para ana
        Materias ms5 = new Materias(m1, 20, 0, 20, 5);
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
        lse.adiFinalLista(e1);
        lse.adiFinalLista(e2);
        
        lse.mostrarListaSimple();

        //lse.eliFinalLSC();
        //lse.mostrarListaSimple();

        //Inciso a)
        System.out.println("\n A) =======================  ");
        Buscar(lse, "ana");

        //Inciso b)
        System.out.println("\n B) =======================  ");
        BuscarMateria(lse, "inf-131");

        //Inciso c)
        System.out.println("\n C) =======================  ");
        MayorNota(lse);

        //Inciso d)
        System.out.println("\n D) =======================  ");
        MayorNotaMateria(lse, "lab-131");

    }

    //Inciso a
    public static void Buscar(listaSE a, String x) {
        NodoE r = a.getP();
        int ca = 0, cr = 0;
        while (r != null) {
            if (r.getDato().getNombre().equalsIgnoreCase(x)) {
                NodoM q = r.getDato().getLsm().getP();
                while (q != null) {
                    int nf = q.getDato().getAy() + q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNef();
                    if (nf >= 51) {
                        ca++;
                    } else {
                        cr++;
                    }
                    q = q.getSig();
                }

            }
            r = r.getSig();
        }
        System.out.println("Materias Aprobadas del estudiante " + x + ": " + ca);
        System.out.println("Materias Reprobadas del estudiante " + x + ": " + cr);
    }

    //inciso b
    public static void BuscarMateria(listaSE a, String x) {
        NodoE r = a.getP();
        System.out.println("\nAprobados materia: " + x);
        while (r != null) {
            NodoM q = r.getDato().getLsm().getP();
            while (q != null) {
                if (q.getDato().getMat().getSigla().equalsIgnoreCase(x)) {
                    int nf = q.getDato().getAy() + q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNef();
                    if (nf >= 51) {
                        System.out.println(r.getDato().getNombre() + ": " + nf);
                    }
                }

                q = q.getSig();
            }

            r = r.getSig();
        }
    }

    //inciso c
    public static void MayorNota(listaSE a) {
        NodoE r = a.getP();
        System.out.println("\nEstudiante Mayor Nota: ");
        int may = 0;
        while (r != null) {
            NodoM q = r.getDato().getLsm().getP();
            while (q != null) {
                int nf = q.getDato().getAy() + q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNef();
                if (nf > may) {
                    may = nf;
                }
                q = q.getSig();
            }

            r = r.getSig();
        }
        r = a.getP();
        while (r != null) {
            NodoM q = r.getDato().getLsm().getP();
            while (q != null) {
                int nf = q.getDato().getAy() + q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNef();
                if (nf == may) {
                    System.out.println(r.getDato().getNombre() + " Nota: " + nf + " Materia: " + q.getDato().getMat().getSigla());
                }
                q = q.getSig();
            }

            r = r.getSig();
        }
    }

    //inciso d
    public static void MayorNotaMateria(listaSE a, String x) {
        NodoE r = a.getP();
        System.out.println("\nEstudiante Mayor Nota Materia: " + x);
        int may = 0;
        while (r != null) {
            NodoM q = r.getDato().getLsm().getP();
            while (q != null) {
                if (q.getDato().getMat().getSigla().equalsIgnoreCase(x)) {
                    int nf = q.getDato().getAy() + q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNef();
                    if (nf > may) {
                        may = nf;
                    }
                }

                q = q.getSig();
            }

            r = r.getSig();
        }
        r = a.getP();
        while (r != null) {
            NodoM q = r.getDato().getLsm().getP();
            while (q != null) {
                if (q.getDato().getMat().getSigla().equalsIgnoreCase(x)) {
                    int nf = q.getDato().getAy() + q.getDato().getN1() + q.getDato().getN2() + q.getDato().getNef();
                    if (nf == may) {
                        System.out.println(r.getDato().getNombre() + " Nota: " + nf);
                    }
                }
                q = q.getSig();
            }

            r = r.getSig();
        }
    }
}
