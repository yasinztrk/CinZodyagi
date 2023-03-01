import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int dogumyılı;

        System.out.print("Doğum Yılınızı Giriniz : ");
        dogumyılı = input.nextInt();

        if((dogumyılı%12)==0){
            System.out.println("Çin Zodyağı Burcunuz : AT");
        }else if ((dogumyılı%12)==1) {
            System.out.println("Çin Zodyağı Burcunuz : HOROZ");
        }else if ((dogumyılı%12)==2) {
            System.out.println("Çin Zodyağı Burcunuz : KÖPEK");
        }else if ((dogumyılı%12)==3) {
            System.out.println("Çin Zodyağı Burcunuz : DOMUZ");
        }else if ((dogumyılı%12)==4) {
            System.out.println("Çin Zodyağı Burcunuz : FARE");
        }else if ((dogumyılı%12)==5) {
            System.out.println("Çin Zodyağı Burcunuz : ÖKÜZ");
        }else if ((dogumyılı%12)==6) {
            System.out.println("Çin Zodyağı Burcunuz : KAPLAN");
        }else if ((dogumyılı%12)==7) {
            System.out.println("Çin Zodyağı Burcunuz : TAVŞAN");
        }else if ((dogumyılı%12)==8) {
            System.out.println("Çin Zodyağı Burcunuz : EJDERHA");
        }else if ((dogumyılı%12)==9) {
            System.out.println("Çin Zodyağı Burcunuz : YILAN");
        }else if ((dogumyılı%12)==10) {
            System.out.println("Çin Zodyağı Burcunuz : AT");
        }else if ((dogumyılı%12)==11) {
            System.out.println("Çin Zodyağı Burcunuz : KOYUN");
        }
    }
}