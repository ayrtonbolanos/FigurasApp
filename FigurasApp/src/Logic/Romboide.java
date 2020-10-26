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
    public void Area() {
        area = (base*altura);
    }

    @Override
    public void Perimetro() {
                perimetro= (base*3);
    }
    
}
