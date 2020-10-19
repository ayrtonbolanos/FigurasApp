/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author ayrto
 */
public class Jugador extends Selección {
    
    private int dorsal;

    private String demarcacion;

    public Jugador() {
            super();
    }

    public Jugador(int id, String Nombre, String Apellidos, int Edad) {
            super(id, Nombre, Apellidos, Edad);
            this.dorsal = dorsal;
            this.demarcacion = demarcacion;
    }

    // MÉTODOS GET Y SET

    public int getDorsal() {
            return dorsal;
    }
    public String getDemarcacion() {
            return demarcacion;
    }
    public void setDorsal(int dorsal) {
            this.dorsal = dorsal;
    }
    public void setDemarcacion(String demarcacion) {
            this.demarcacion = demarcacion;
    }

    //MÉTODO JUGAR PARTIDO
    public void jugarPartido() {
            System.out.println("Juega un partido");
    }

    // MÉTODO ENTRENAR
    public void entrenar() {
            System.out.println("Entrena");
    }

    //Concentrarse
    @Override
    public void Concentrarse(){
        System.out.println("El JUGADOR va a la concentración.");
    }

    //Viajar
    @Override
    public void Viaja(){
        System.out.println("El JUGADOR va a la concentración.");
    }
        
        
}
