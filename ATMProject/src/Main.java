import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String userName, password;
        int balance = 1500;
        int select;
        Scanner input = new Scanner(System.in);
        int right = 3; // kullanıcıya 3 hak verildi
        while (right > 0) {
            System.out.print("Kullanıcı adınız: ");
            userName = input.nextLine();
            System.out.println("Parolanız: ");
            password = input.nextLine();
            if (userName.equals("patika") && (password.equals("dev123"))) {
                System.out.println("Merhaba, X bankasına hoşgeldiniz ");
                do{
                    System.out.println("1- Para yatırma işlemi\n" +
                            "2- Para Çekme \n" +
                            "3- Bakiye Sorgula \n"+
                            "4- Çıkış Yap \n");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");

                    select = input.nextInt();
                    if(select==1){
                        System.out.println("Para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    }else if(select==2){
                        System.out.println("Para miktarı : ");
                        int price = input.nextInt();
                        if (price>balance){
                            System.out.println("Bakiye yetersiz. ");
                        }else{
                            balance-= price;
                        }
                    }else if(select ==3){
                        System.out.println("Bakiyeniz : " +balance);
                    }
                }while(select!=4);
                System.out.println("Tekrar görüşmek üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı ve şifre. Tekrar deneyiniz.");
                if (right == 0) {

                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz");
                } else {
                    System.out.println("Kalan Hakkınız: " + right);

                }
            }

        }

    }
}
