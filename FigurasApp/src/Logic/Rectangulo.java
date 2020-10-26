package Logic;

public class Rectangulo extends Figura {
    
    public Rectangulo(){
        
    }
    public Rectangulo(int base, int altura, String nombre){
        super();
    }
    
    
    @Override
    public void Area() {
        area = (base*altura);
    }

    @Override
    public void Perimetro() {
                perimetro= (base*3);
    }
}
