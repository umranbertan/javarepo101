import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int r;
        double pi=3.14, alfa, alan;
        Scanner input= new Scanner(System.in);
        System.out.println("Yarıççapı giriniz:");
        r=input.nextInt();
        System.out.println("alfa değerini giriniz:");
        alfa=input.nextInt();
        alan = pi*(r*r)*(alfa/360);
        System.out.println("Daire diliminin alanı :" +alan);



    }
}
