import java.util.Scanner;

public class Main {
    static void func(int a, boolean adim, int b) {
        if (a < 0) {
            adim = false;
        }
        System.out.print(" " + a);

        if (adim) {
            func(a - 5, adim, b);
        } else {
            if (a == b)
                return;
            else {
                func(a + 5, adim, b);
            }

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N Sayisi : ");
        int a = scanner.nextInt();
        scanner.close();
        System.out.print("Sonucumuz: ");
        func(a, true, a);


    }

}