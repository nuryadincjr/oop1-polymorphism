import java.io.*;
/**
 *
 * @author abu
 */
public class Main {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //instance of class
        Manusia[] ms = new Manusia[2];
        
        //deklarasi variabel
        int x=0;
        
        do {            
            //input
            System.out.println("+=======================================================+");
            System.out.println("+\t\t\tUser "+(x+1)+"\t\t\t\t+");
            System.out.println("+=======================================================+");
            System.out.print("Masukan tinggi badan anda (cm)\t\t\t: ");
            double dt = Double.parseDouble(br.readLine());
            System.out.print("Masukan jenis kelamin anda (L/P)\t\t: ");
            String jk = br.readLine();
            
            //proses + output
            if(jk.toUpperCase().equals("L")){
                ms[x] = new Laki_laki(dt);
                System.out.println("Berat badan ideal laki-laki ini anda adalah\t: "+ms[x].hitungBBI());
                System.out.println("");
            } else{
                ms[x] = new Perempuan(dt);
                System.out.println("Berat badan ideal perempuan ini anda adalah\t: "+ms[x].hitungBBI());
                System.out.println("");
            }
            x++;
        } while (x<2);
    }
}
