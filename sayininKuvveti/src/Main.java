import java.util.Scanner;
class Main {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
	for(int i=20; i<=n; i+=20){
        System.out.println(i);
    }
    }
}
