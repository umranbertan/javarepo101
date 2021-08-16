import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, toplam=0;
        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Sayıyı giriniz: ");
            n= scan.nextInt();
            if (n%2==0){
                if(n%4==0){
                    toplam=toplam+n;
                }
            }
        }while(n%2==0);

        System.out.println("toplam : " +toplam);
    }
}
