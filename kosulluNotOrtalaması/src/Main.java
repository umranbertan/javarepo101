import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int mat, fizik, turkce, kimya,muzik;
	double avarage;
	Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz: ");
        mat=input.nextInt();
        System.out.print("Fizik notunuzu giriniz: ");
        fizik=input.nextInt();
        System.out.print("Turkce notunuzu giriniz: ");
        turkce=input.nextInt();
        System.out.print("Kimya notunuzu giriniz: ");
        kimya=input.nextInt();
        System.out.print("Muzik notunuzu giriniz: ");
        muzik=input.nextInt();
        if (mat < 0 || mat > 100){
            avarage = (fizik+turkce+kimya+muzik) / 5;
            if (avarage<55){
                System.out.println( "üzgünüm kaldın");
            }else{
                System.out.println("tebrikler, geçtin:"+ avarage);
            }

        }else if (fizik < 0 || fizik > 100){
            avarage = (mat+turkce+kimya+muzik) / 5;
            if (avarage<55){
                System.out.println( "üzgünüm kaldın");
            }else{
                System.out.println("tebrikler, geçtin:"+ avarage);
            }

        }else if (turkce < 0 || turkce > 100){
            avarage = (mat+fizik+kimya+muzik) / 5;
            if (avarage<55){
                System.out.println( "üzgünüm kaldın");
            }else{
                System.out.println("tebrikler, geçtin:"+ avarage);
            }

        }else if (kimya < 0 || kimya > 100){
            avarage = (mat+fizik+turkce+muzik) / 5;
            if (avarage<55){
                System.out.println( "üzgünüm kaldın");
            }else{
                System.out.println("tebrikler, geçtin:"+ avarage);
            }

        }else if (muzik < 0 || muzik > 100){
            avarage = (mat+fizik+turkce+kimya) / 5;
            if (avarage<55){
                System.out.println( "üzgünüm kaldın");
            }else{
                System.out.println("tebrikler, geçtin:"+ avarage);
            }

        }else{
            avarage=(mat+fizik+turkce+kimya+muzik)/5;
            if (avarage<55){
                System.out.println( "üzgünüm kaldın");
            }else{
                System.out.println("tebrikler, geçtin:"+ avarage);
            }
        }

    }
}
