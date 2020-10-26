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
public abstract class Selección implements SeleccionInterface {
    protected int id;
    protected String Nombre;
    protected String Apellidos;
    protected int Edad;
    protected String Profesion;
    protected String mnsjConcen="Va a la Concentración";
    protected String mnsjViaja="Viaja al Partido";
    protected String mnsjEntrena="Se presenta en el Entrenamiento";
    protected String mnsjJuega="Va al Juego";


    
    public Selección(){

    }
    public Selección(int id, String Nombre, String Apellidos, int Edad){
        this.id=id;
        this.Nombre=Nombre;
        this.Apellidos=Apellidos;
        this.Edad=Edad;
    }

    //MétodosGET
    public String getProfesion() {
    return Profesion;
    }
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
    
    //MétodosSET

    public void setProfesion(String Profesion) {
        this.Profesion = Profesion;
    }
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
