import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Değer giriniz:");
        int a = input.nextInt();
        int deger, basamakdegeri,toplam=0;

        deger = a;

        while(deger != 0){
            basamakdegeri = deger%10;
            toplam=toplam+basamakdegeri;
            deger /= 10;

        }
        System.out.println(toplam);


    }
}









