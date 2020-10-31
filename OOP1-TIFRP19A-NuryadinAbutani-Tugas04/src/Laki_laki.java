
/**
 *
 * @author abu
 */
public class Laki_laki extends Manusia{
    
    //constructor
    public Laki_laki(double tinggiBadan) {
        super(tinggiBadan);
    }
    
    //Metod overidding dari superclas
    @Override
    public double hitungBBI(){
        return (super.getTinggiBadan()-100)*0.9;
    }
    
}
