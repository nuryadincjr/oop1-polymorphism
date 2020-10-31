
/**
 *
 * @author abu
 */
public class Manusia {
    /*
    Rumus hitung berat badan ideal adalah sebagai berikut
    Laki Laki = (tinggi badan(cm) - 100) kg x 90%
    Untuk Perempuan = (tinggi badan(cm) - 100) kg x 80% 
    */
    
    //deklarasi variabel
    private double tinggiBadan;
    
    //constructor
    public Manusia(double tinggiBadan){
        this.tinggiBadan = tinggiBadan;
    }
    
    //getter
    public double getTinggiBadan(){
         return tinggiBadan;
    }
    
    //metod hitung berat badan ideal (BBI)
    public double hitungBBI(){
        return 0.0;
    }
}
