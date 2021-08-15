import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int yas, n;
        double mesafe, fiyat, fiyat2, fiyat3, indirim, toplam, cevap, sonuc;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz:");
        mesafe = input.nextDouble();
        if(mesafe<0){
            System.out.println("Hatalı giriş mesafe");
        }


        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();


        System.out.println("Yolculuk tipini giriniz (1-->Tek yön, 2--> Çift yön)");
        n = input.nextInt();

        fiyat = (mesafe * 0.10);
        if (yas > 0) {
            if (yas < 12) {
                if (n == 2) {
                    fiyat2 = fiyat * 0.5;
                    fiyat3 = fiyat - fiyat2;
                    indirim = fiyat3 * 0.20;
                    toplam = (fiyat3 - indirim) * 2;
                    cevap = toplam;
                    System.out.println("Toplam" + cevap);

                } else if(n==1){
                    fiyat2 = fiyat * 0.5;
                    fiyat3 = fiyat - fiyat2;
                    cevap = fiyat3;
                    System.out.println("Toplam" + cevap);
                }else{
                    System.out.println("hatalı yolculuk tipi");
                }

            } else if (yas >= 12 && yas < 24) {
                if (n == 2) {
                    fiyat2 = fiyat * 0.1;
                    fiyat3 = fiyat - fiyat2;
                    indirim = fiyat3 * 0.20;
                    toplam = (fiyat3 - indirim) * 2;
                    cevap = toplam;
                    System.out.println("Toplam" + cevap);
                } else if(n ==1) {
                    fiyat2 = fiyat * 0.1;
                    fiyat3 = fiyat - fiyat2;
                    cevap = fiyat3;
                    System.out.println("Toplam" + cevap);
                }else {
                    System.out.println("hatalı yolculuk tipi");
                }

            } else if (yas > 65) {
                if (n == 2) {
                    fiyat2 = fiyat * 0.3;
                    fiyat3 = fiyat - fiyat2;
                    indirim = fiyat3 * 0.20;
                    toplam = (fiyat3 - indirim) * 2;
                    cevap = toplam;
                    System.out.println("Toplam" + cevap);
                } else if(n==1){
                    fiyat2 = fiyat * 0.3;
                    fiyat3 = fiyat - fiyat2;
                    cevap = fiyat3;
                    System.out.println("Toplam" + cevap);
                }else {
                    System.out.println("hatalı yolculuk tipi");
                }

            }else {
                if (n == 2) {
                    sonuc= fiyat*0.20;
                    System.out.println("Toplam" + sonuc);
                } else if(n==1){

                    System.out.println("Toplam" + fiyat);
                }
                else {
                    System.out.println("hatalı yolculuk tipi");
                }

            }
        }

    }


    }

