import java.util.Scanner;
class Main {

    public static void main(String[] args) {
	int year;
	boolean artikMi= false;

	Scanner inp = new Scanner(System.in);
        System.out.println("Yıl giriniz");
	year= inp.nextInt();

	if(year>1900 && year<=2021){
	    if(year%4==0){
	        if(year%100==0){
	            if(year%400==0){
	                artikMi= true;

                }else{
	                artikMi=false;
                }
            }else{
                artikMi= true;

            }

        }else{
	        artikMi=false;
        }

    }else{
        System.out.println("Hatalı yıl girdiniz.");
    }
	if(artikMi==true){
        System.out.println("Artık yıldır :" +year);
    }else{
        System.out.println("Artık yıl değildir: " +year);
    }

    }
}
