import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double mesafe, km= 2.20, tutar;
        int cevap1=20;
        Scanner input = new Scanner(System.in);
        System.out.println("Girilen mesafeyi giriniz:" );
        mesafe = input.nextInt();
        tutar=(km*mesafe)+10;
        boolean kosul1 = (tutar <= 20);
        System.out.println("Ödenecek tutar: " +(kosul1==true ? cevap1 : tutar ));



    }
}
