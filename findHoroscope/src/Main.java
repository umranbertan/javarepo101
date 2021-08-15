import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int month, day;
	String burc = "";
	boolean isError = false;

	Scanner input= new Scanner(System.in);
        System.out.println("Doğduğunuz ay:");
        month=input.nextInt();

        System.out.println("Doğduğunuz gün:");
        day=input.nextInt();
        switch (month){
            case 1:
                if (day>=1 && day<=31) {
                    if (day < 22) {
                        burc="Oğlak";
                    } else {
                        burc="Kova";
                    }
                }else{
                    isError=true;
                }
                break;
            case 2:
                if (day>=1 && day<=28) {
                    if (day < 20) {
                        burc="kova";
                    } else {
                        burc="balık";
                    }
                }else{
                   isError=true;
                }
                break;
            case 3:
                if (day>=1 && day<=31){
                    if(day<21){
                        burc="balık";
                    }else{
                        burc="Koç";
                    }
                }else{
                    isError=true;
                }
                break;
            case 4:
                if(day>=1 &&  day<=30){
                    if (day<21){
                        burc="Koç";
                    }else{
                        burc="boğa";
                    }
                }else{
                    isError=true;
                }
                break;
            case 5:
                if(day<=1 && day<=31){
                    if(day<22){
                        burc="boğa";
                    }else {
                        burc="ikizler";
                    }
                }else{
                    isError=true;
                }
                break;
            case 6:
                if(day>=1 && day<=30){
                    if(day<23){
                        burc="ikizler";
                    }else{
                        burc="yengeç";
                    }

                }else{
                    isError=true;
                }
                break;
            case 7:
                if(day>=1 && day<= 31){
                    if(day<23){
                        burc="yengeç";
                    }else{
                        burc="aslan";
                    }

                }else{
                    isError=true;
                }
                break;
            case 8:
                if(day>=1 && day<= 31){
                    if(day<23){
                        burc="aslan";
                    }else{
                        burc="başak";
                    }

                }else{
                    isError=true;
                }
                break;
            case 9:
                if(day>=1 && day<= 30){
                    if(day<23){
                        burc="başak";
                    }else{
                        burc="terazi";
                    }

                }else{
                    isError=true;
                }
                break;
            case 10:
                if(day>=1 && day<= 30){
                    if(day<23){
                        burc="terazi";
                    }else{
                        burc="akrep";
                    }

                }else{
                    isError=true;
                }
                break;
            case 11:
                if(day>=1 && day<= 30){
                    if(day<22){
                        burc="akrep";
                    }else{
                        burc="yay";
                    }

                }else{
                    isError=true;
                }
                break;
            case 12:
                if(day>=1 && day<= 31){
                    if(day<22){
                        burc="yay";
                    }else{
                        burc="oğlak";
                    }

                }else{
                    isError=true;
                }
                break;
            default:
                isError=true;
        }
        if(isError){
            System.out.println("Hatalı giriş yaptınız, tekrar deneyiniz: ");
        }else{
            System.out.println("Merhaba burcunuz: " +burc);
        }
    }
}
