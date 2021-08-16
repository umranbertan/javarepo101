import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        int n,r,x;
        double com;
	Scanner input = new Scanner(System.in);
        System.out.println("Kümenin eleman sayısını giriniz:");
        n=input.nextInt();

        System.out.println("Grupların sayısını giriniz:");
        r=input.nextInt();
        int topla= 1, toplam=1, topla3=1;

        for(int i=1; i<= n; i++){
            topla=topla*i;
        }
        System.out.println("n! :"+topla);
        for(int i=1; i<= r; i++){
            toplam=toplam*i;
        }
        System.out.println("r!: " +toplam);

        for(int i=1; i<= (n-r); i++){
            topla3=topla3*i;
        }
        System.out.println("(n-r)! : " +topla3);

        com =(topla / (toplam*topla3));
        System.out.println("Kombinasyon sonucu :" +com);






















    }
}
