import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int bolum;

        for (int sayi=2; sayi<=100; sayi++)
        {
            for (bolum=2; bolum<sayi; bolum++)
            {
                if (sayi%bolum==0)
                    break;
            }

            if (bolum==sayi)
                System.out.print(sayi + " ");
        }

    }


           }

