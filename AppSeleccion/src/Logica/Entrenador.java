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
public class Entrenador extends Selección {
    
    private String idFederacion;
    
    public Entrenador(){
        super();
    }

    public Entrenador(int id, String Nombre, String Apellidos, int Edad) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion=idFederacion;
    }

    //GET Y SET IDFEDERACIÓN
    
    public String getIdFederacion() {
        return idFederacion;
    }
    
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    //Concentrarse
    
    @Override
    public void Concentrarse(){
        System.out.println("El ENTRENADOR va a la concentración.");
    }

    //Viajar
    
    @Override
    public void Viaja(){
        System.out.println("El ENTRENADOR va a la concentración.");
    }
    
    
}
