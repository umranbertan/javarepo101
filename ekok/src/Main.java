import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz :");
        int n2 = input.nextInt();
        int ebob = 1;
        for(int k = n1; k>=1; k--){
            if(n1%k==0 && n2%k==0){
                ebob=k;
                System.out.println("Ebob sonucu : " + ebob);
                break;
            }
        }

        for(int i= 1; i<=(n1*n2);i++){
            if(i%n1==0 && i%n2==0){
                System.out.println("Ekok sonucu: " + i);
                break;
            }
        }
        System.out.println("Ekok sonucu: " + (n1*n2)/ebob);

    }
}





