import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	int heat;

	Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık giriniz");
        heat=input.nextInt();
        if(heat<5){
            System.out.println("Kayak yapabilirsin");
        }else if(heat>=5 && heat <=25){
            if(heat<=15){
                System.out.println("sinemaya gidebilirsin");
            }
            if(heat>=10){
                System.out.println("pikniğe gidebilirsin");
            }
        }else {
            System.out.println("yüzmeye gidebilirsiniz");
        }
    }
}
