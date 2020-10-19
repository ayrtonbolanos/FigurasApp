package Logic;

/**
 *
 * @author ayrto
 */
public class Romboide extends Figura {
    
    public Romboide(){
        
    }
    public Romboide(int base, int altura, String nombre){
        super();
    }

        @Override
    public void Area(int base, int altura){
        area = (base*altura);
    }

        @Override
    public void Perimetro(int base, int altura){
        perimetro= (base*3);
    }
    
}
