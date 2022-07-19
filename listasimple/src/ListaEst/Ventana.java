package ListaEst;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author desktop
 */
public class Ventana {
      private int ancho;
      private int alto;
      private List<Pestana> pestanas;

    public Ventana() {
        ancho = 100;
        alto = 20;
        this.pestanas = new ArrayList<>();
    }

    public Ventana(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    
    
     
    public void crearPestana() {
        Pestana p = new Pestana();
        this.pestanas.add(p);
    }
    
    public void minimizar() {
        
    }
      
    public void maximizar() {
        
    }

    void mostrar() {
        System.out.println("ancho: " + ancho + " alto: " + alto);
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }
    
    
    
}
