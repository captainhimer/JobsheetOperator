package praktikum1;
import java.util.Scanner;
public class Konversi_suhu {
    public static void main(String[] args){
        Scanner Baca = new Scanner (System.in);
        
        double suhu,hasilnya;
        int Celcius, Farenheit;
        
        System.err.println("==TOOLS KONVERSI SUHU==");
        System.out.print("Masukan Angka Suhu Celcius gan di bawah ya:\n masuakan di bawah ini anjing\n"
                + "celcius=");
        Celcius = Baca.nextInt();
        int celcius = 0;
        hasilnya=celcius*3/9;
        
        System.out.println("jadi hasilnya adalah="+Celcius*3/9);
        System.out.println("ngewe kuyyyyyy");
    }
    
}
