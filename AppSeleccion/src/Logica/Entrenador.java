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
    
    //Métodos en Común
    
    @Override
    public String Concentrarse(){
        return mnsjConcen;
    }
    
    @Override
    public String Viaja(){
        return mnsjViaja;
    }
    
    @Override
    public String Entrenar(){
        return mnsjEntrena;
    }
    
    @Override
    public String jugarPartido(){
        return mnsjJuega;
    }
    
    
    
}
