import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("İlk(a) sayıyı giriniz:");
        a=in.nextInt();
        System.out.println("İkinci(b) sayıyı giriniz:");
        b=in.nextInt();
        System.out.println("ücüncü(c) sayıyı giriniz:");
        c= in.nextInt();
        if((a<b) && (a<c)){
            if(b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        }else if((b<a)&&(b<c)){
            if (a<c){
                System.out.println("b<a<c");
            }else{
                System.out.println("b<c<a");
            }

        }else if((c<a)&&(c<b)){
            if(a<b){
                System.out.println("c<a<b");
            }else{
                System.out.println("c<b<a");
            }
        }

    }
}
