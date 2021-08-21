import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number, number2, toplam = 0, number3;
        System.out.print("Bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                number2 = i;
                toplam = number2 + toplam;
                System.out.println("Kendisi hariç bölenler: " + number2);
            }

        }
        System.out.println("********************************************");
        System.out.println("Bölenleri toplamı : " + toplam);
        number3 = number + number;

        if (toplam == number3) {
            System.out.println("Bu sayı mükemmel sayıdır: " + toplam + " , " + number);
        } else if (toplam != number3) {
            System.out.println("Bu sayı mükemmel sayı değildir: " + toplam + " , " + number);

        }


    }
}


