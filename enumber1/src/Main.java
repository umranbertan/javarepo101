import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number,count,enBuyuk,enKucuk,sayi, min=0, max=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç tane sayı gireceksiniz? : ");
        number= input.nextInt();
        for(int i=1; i<=number; i++){
            System.out.println(i + ". sayıyı giriniz");
            count=input.nextInt();

            if(i==1){
                min=count;
                max=count;
            }else{
                    if(count>max){
                        max= count;
                    }else if(count<min){
                        min= count;

                    }
                 }
            System.out.println("En buyuk sayı= " + max + " En küçük sayı = "  +min);
        }
        System.out.println("SONUÇ :EN BUYUK SAYI= " + max + " EN KUCUK SAYI = "  +min);

    }
}
