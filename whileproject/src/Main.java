import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Bir sayı giriniz:");
        a= input.nextInt();
        System.out.println("Çıktı sayılar:");

int toplam=0, c=0;
        for(int i=0; i<=a; i++){
            if((i%3==0) && (i%4==0)){
                System.out.println(i);
            toplam= toplam+i;
            c=c+1;
            }
        }
        System.out.println("ortalama:");
        System.out.println((toplam/c));

    }
}




