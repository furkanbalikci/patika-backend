import java.util.Scanner;


public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       int n1,n2,select;
        System.out.println("1. sayıyı giriniz:");
        n1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz:");
        n2 = scanner.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("İşlem seçiniz:");
        select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1*n2));
                break;
            case 4:
                System.out.println("Bölme: " + (n1/n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız.");

        }
    }

}
