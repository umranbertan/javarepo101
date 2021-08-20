import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.println("n2 sayısını giriniz :");
        int n2 = input.nextInt();

        int ebob = 1;
        if(n1<n2){
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {

                    ebob = i;
                }
            }

        }else if(n2<n1){
            for (int i = 1; i <= 21; i++) {
                if (n1 % i == 0 && n2 % i == 0) {

                    ebob = i;
                }
            }

        }

        System.out.println(ebob);
        System.out.println("**********************************");
if(n1<n2){
    for(int k =n1; k>= 0 ; k--){
        if(n1%k==0 && n2%k==0){
            ebob=k;
            System.out.println(ebob);
            break;


        }
    }
}else if(n2<n1){
    for(int k =n2; k>= 0 ; k--){
        if(n1%k==0 && n2%k==0){
            ebob=k;
            System.out.println(ebob);
            break;

}}}}}





