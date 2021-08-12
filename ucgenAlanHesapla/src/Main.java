import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a,b,c,cevre;
        double alan, u;
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin 1. kenarını giriniz:");
        a = input.nextInt();

        System.out.println("Üçgenin 2. kenarını giriniz:");
        b = input.nextInt();

        System.out.println("Üçgenin 3. kenarını giriniz:");
        c = input.nextInt();

        cevre= a+b+c;
        u = (cevre)/2;
        alan=Math.sqrt (u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: " +alan);



    }
}
