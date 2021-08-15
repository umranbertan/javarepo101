import java.util.Scanner;
class Main {

    public static void main(String[] args) {
	int b=12, year;
	int is;
	Scanner in = new Scanner(System.in);

        System.out.println("Doğum yılınızı giriniz:");
        year = in.nextInt();


        if((year>1900 )&& (year<=2021)){
            is=(year%b);
            switch (is){
                case 0:
                    System.out.println("Çin zodyağı : Maymun");
                    break;
                case 1:
                    System.out.println("Çin zodyağı: Horoz ");
                    break;
                case 2:
                    System.out.println("Çin zodyağı: Köpek");
                    break;
                case 3:
                    System.out.println("Çin zodyağı: Domuz");
                    break;
                case 4:
                    System.out.println("Çin zodyağı: Fare");
                    break;
                case 5:
                    System.out.println("Çin zodyağı: Öküz");
                    break;
                case 6:
                    System.out.println("Çin zodyağı: Kaplan");
                    break;
                case 7:
                    System.out.println("Çin zodyağı: Tavşan");
                    break;
                case 8:
                    System.out.println("Çin zodyağı: Ejderha");
                    break;
                case 9:
                    System.out.println("Çin zodyağı: Yılan");
                    break;
                case 10:
                    System.out.println("Çin zodyağı: At");
                    break;
                case 11:
                    System.out.println("Çin zodyağı: Koyun");
            }
        }else{
            System.out.println("Hatalı giriş");

        }



    }
}
