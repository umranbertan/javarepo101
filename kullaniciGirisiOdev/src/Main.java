import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String username, password, password2;
        int n1;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı adınız..:");
        username = input.nextLine();
        System.out.print("Şifreniz...: ");
        password = input.nextLine();

        if (username.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız !");
        } else {
            System.out.println("Bilgileriniz yanlış, Şifrenizi sıfırlamak istermisiniz");
            System.out.println("1-Evet\n2-Hayır");
            n1 = input.nextInt();
            if (n1==2){
                System.out.println("Şifre değiştirmek istemiyor");
            }else{
                System.out.println("Yeni şifreniz : ");
                password = input.nextLine();
            }
        }
        password = input.nextLine();
        if(password.equals("java123")){
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
        } else{
            System.out.println("Sorun yok, şifre güncellendi");
        }


    }

}





