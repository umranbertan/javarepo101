import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n1, n2;

        int ebob = 1;
        int ekok = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("*******************Ebob hesaplaması******************");

        System.out.println("n1 i giriniz: ");
        n1 = input.nextInt();
        System.out.println("n2 yi giriniz: ");
        n2 = input.nextInt();
        int i = n1;
        int k = 1;
        if (n1 < n2) {
            while (i >= 1) {
                i--;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println(i);
                    break;
                }

            }

        } else {
            while (i >= 1) {
                i--;
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                    System.out.println(i);
                    break;
                }
            }

            }
            System.out.println("*******************Ekok hesaplaması******************");

            while (k <= (n1 * n2)) {

                k++;
                if (k%n1== 0 && k%n2 == 0) {

                    System.out.println("Ekok sonucu: " +k);
                    break;
                }

            }


        }
    }
