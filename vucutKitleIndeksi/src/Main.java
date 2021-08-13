import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double boy, kilo, hesaplama;
        Scanner input = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz(metre cinsinden) : ");
        boy = input.nextDouble();
        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        hesaplama= kilo/boy*boy;
        System.out.println("Vücut Kitle İndeksiniz: " +hesaplama);


    }
}
