import java.util.Scanner;
public class Main {
static int power(int a, int b){
    if(a==0 || b==0)
    return 1;
    else
        return (a*power(a,b-1));//taban sayıyı(a) fonksiyon her kendini çağırdığında taban ile çarpacak
    //Fonksiyon her kendini çağırdığında us bir azalacak
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Taban Değerini giriniz: ");
        int a = scan.nextInt();
        System.out.println("Üs Değerini giriniz: ");
        int b= scan.nextInt();
        System.out.println(power(a,b));
    }
}
