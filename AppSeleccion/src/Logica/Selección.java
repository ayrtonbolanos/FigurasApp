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
public class Selección {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;
    
    public Selección(){

    }
    public Selección(int id, String Nombre, String Apellidos, int Edad){
        this.id=id;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Edad=Edad;
    }

    //MétodosSET
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return Nombre;
    }
    public String getApellidos() {
        return Apellidos;
    }
    public int getEdad() {
        return Edad;
    }
    
    //MétodosGET
    
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //Concentrarse
    
    public void Concentrarse(){
        
    }
    
        
    //Viajar
    
    public void Viaja(){
        
    }

    
}
