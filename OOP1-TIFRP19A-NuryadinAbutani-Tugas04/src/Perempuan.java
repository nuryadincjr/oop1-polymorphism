
/**
 *
 * @author abu
 */
public class Perempuan extends Manusia{
    //constructor
    public Perempuan(double tinggiBadan){
        super(tinggiBadan);
    }
    
    //method overidding dari superclas
    @Override
    public double hitungBBI(){
        return (super.getTinggiBadan()-100)*0.8;
    }
}
