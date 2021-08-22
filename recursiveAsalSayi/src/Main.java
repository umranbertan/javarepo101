import java.util.Scanner;

public class Main {
    private static int isPrime(int num, int i) {
        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else
                return isPrime(num,i-1);
        }
    }

    public static void main(String[] args) {
        int num, prime ;
        Scanner scanner=new Scanner(System.in);
        System.out.print(" Bir sayi giriniz!!! : ");
        num= scanner.nextInt();

        prime=isPrime(num,num/2);

        if (prime==1){
            System.out.println(num+" sayisi asaldir");
        }else {
            System.out.println(num+" sayisi asal değildir...");
        }
    }


}