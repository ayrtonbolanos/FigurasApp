package Logic;

/**
 *
 * @author ayrto
 */
public class Rectangulo extends Figura {
    
    public Rectangulo(){
        
    }
    public Rectangulo(int base, int altura, String nombre){
        super();
    }
    
    
        @Override
    public void Area(int base, int altura){
        area = (base*altura);
    }

        @Override
    public void Perimetro(int base, int altura){
        perimetro= ((base*2)+(altura*2));
    }
}
