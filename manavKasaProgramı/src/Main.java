import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        double armutk , elmak , domatesk , muzk, patlicank, tutar;
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        Scanner input = new Scanner(System.in);
        System.out.println("Armut kaç kilo: ");
        armutk = input.nextInt();

        System.out.println("Elma kaç kilo: ");
        elmak = input.nextInt();

        System.out.println("Domates kaç kilo: ");
        domatesk = input.nextInt();

        System.out.println("Muz kaç kilo: ");
        muzk = input.nextInt();

        System.out.println("Patlıcan kaç kilo: ");
        patlicank = input.nextInt();

        tutar=((armut*armutk)+(elma*elmak)+(domates*domatesk)+(muzk*muz)+(patlican*patlicank));
        System.out.println("Toplam Tutar:" +tutar);



    }
}
