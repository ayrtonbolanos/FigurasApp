package Logic;
import static Datos.Global.ArregloFiguras;

public abstract class Figura implements FigurasInterface {
    protected int base;
    protected int altura;
    protected float area;
    protected float perimetro;
    protected String nombre;
    
    public Figura(){
        
    }
    
    public Figura(int base, int altura){
        this.base=base;
        this.altura=altura;
    }

    
        
    public void Area(int base, int altura){
 
    }
    
    public void Perimetro(int base, int altura){

    }

    //Métodos Get y Set
    
    public void setBase(int base) {
        this.base = base;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public float getArea() {
    return area;
}
    public float getPerimetro() {
    return perimetro;
}
    public float getBase(){
        return base;
 }
    public float getAltura(){
        return altura;
}
    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
    return nombre;
}
}
