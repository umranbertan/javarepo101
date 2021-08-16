import java.util.Scanner;
class Main {

    public static void main(String[] args) {
	int n,k;
	Scanner input= new Scanner(System.in);
        System.out.println("Üssü alınacak sayı: ");
        n=input.nextInt();
        System.out.println("Üs olacak sayı: ");
        k=input.nextInt();
        int topla=1;
       for(int i=1;i<=k; i++){
           topla= topla*n;
       }
        System.out.println("Cevap: " +topla);
    }
}
