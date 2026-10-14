import java.util.Scanner;
public class UjianCoding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Pin anda" );
        
        int pinBenar = 123456;
        boolean jawaban = true;
        int percobaanSalah = 0;


        while (jawaban) {
            
            int pin = input.nextInt();
            if (pin == pinBenar) {
                System.out.println("Akses Diterima!");
                jawaban = false;
            } else {
                percobaanSalah++;
                if (percobaanSalah >=3) {
                     System.out.println("Kartu Terblokir");
                     jawaban = false;
                } else {
                    System.out.println("Pin Salah");
                }
            
            }
        }
    }
}

        



    
    




