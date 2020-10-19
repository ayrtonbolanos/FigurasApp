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
public class Masajista extends Selección {

    private String titulacion;
    private int aniosExperiencia;

    public Masajista() {
    }

    public Masajista(int id, String Nombre, String Apellidos, int Edad) {
            super(id, Nombre, Apellidos, Edad);
            this.titulacion = titulacion;
            this.aniosExperiencia = aniosExperiencia;
    }

    //MétodosGET

    public String getTitulacion() {
        return titulacion;
    }
    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    //MétodosSET

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    //Concentrarse
    @Override
    public void Concentrarse(){
        System.out.println("El MASJITSTA va a la concentración.");
    }

    //Viajar
    @Override
    public void Viaja(){
        System.out.println("El MASJISTA viaja al partido.");
    }
    
}
