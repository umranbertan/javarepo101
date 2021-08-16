import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Faktoriyel Sayısı: ");
        n=input.nextInt();
        int toplam=1;
	for(int i=1; i<=n; i++){
        System.out.println(i);
        toplam=toplam*i;
    }
        System.out.println("Faktöriyel:"+toplam);
    }
}
