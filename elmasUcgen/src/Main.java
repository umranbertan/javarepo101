import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {

                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int p = n-1; p >= 1; p--) {
            for (int t = 1; t<=(n-p); t++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * p) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();

    }}}


