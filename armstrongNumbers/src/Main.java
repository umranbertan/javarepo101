import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int number = input.nextInt();
        int basNumber=0;
        int tempNumber=number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber!=0){
            tempNumber/=10;
            basNumber++;
        }
        tempNumber=number;
        while (tempNumber!=0){
            basValue = tempNumber%10;
            basPow=1;
for(int i=1; i<=basNumber;i++){
    basPow= basPow*basValue;
}
result+=basPow;
tempNumber/=10;
        }
        if(result==number){
            System.out.println(number+ "sayısı bir Armstrong sayıdır");
        }else{
            System.out.println(number+ "sayısı bir Armstrong sayı değildir");
        }



      /*  int a = 2451, basamaksayisi=0, numberConter=0;
        while(a!=0){
            numberConter++;
            a=a/10;
        }
        int b = 2451;
        int c= b%10;
        System.out.println(c);
        int sub=2, sup=5;
        int result=1;
        for(int i=1; i<=sup; i++){
            result=sub*result;
        }

*/
    }
}
