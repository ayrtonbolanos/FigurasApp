package Logic;

import Logic.Figura;

/**
 *
 * @author ayrto
 */
public class Triangulo extends Figura {
    
    public Triangulo(){
        
    }
    public Triangulo(int base, int altura){
        super();
    }
    
        @Override
    public void Area() {
        area = (base*altura)/2;
    }

    @Override
    public void Perimetro() {
       perimetro= (base*3);
    }



    
    
    
    
    
}
