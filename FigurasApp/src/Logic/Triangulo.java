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
    public void Area(int base, int altura){
        area = (base*altura)/2;
    }
    
        @Override
    public void Perimetro(int base, int altura){
        perimetro= (base*3);
    }



    
    
    
    
    
}
