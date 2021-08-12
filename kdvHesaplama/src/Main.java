import java.util.Scanner;
class Kdv {
    public static void main(String[] args) {
        System.out.println("Para değeri giriniz: ");
        double girdi, kdvfiyat, kdvmiktar;
        Scanner deger = new Scanner(System.in);
        girdi = deger.nextDouble();
        boolean kosul1 =  (girdi >= 0 && girdi <=1000);

        double cevap1 = (girdi*0.18);
        double cevap1devam= cevap1+girdi ;
        double cevap2=(girdi*0.08);
        double cevap2devam= cevap2+girdi ;

        System.out.println("Durum = " + (kosul1==true ? cevap1 : cevap2));
        System.out.println("Durum = " + (kosul1==true ? cevap1devam: cevap2devam) );



    }
}