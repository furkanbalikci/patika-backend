import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int inNumber,number = rand.nextInt(100),right=5;
        System.out.println("Kurallar\n" +
                "1. Girilen sayı 0-100 arasında olmalı.\n"+
                "2. Toplamda 5 tahmin hakkınız bulunmaktadır.\n"+
                "3. Her tahminde 1 hakkınız eksilir.\n"+
                "4. 0-100 arasında olmayan bir sayı girerseniz tahmin hakkınızda eksilme olmaz.");

        while (right>0){
            System.out.print("Tahminizi giriniz:");
            inNumber = scanner.nextInt();
            if (inNumber > 0 & inNumber < 100) {
                if (inNumber > number) {
                    System.out.println("Girdiğiniz sayıdan aşağıya inin.");
                    right--;
                } else if (inNumber < number) {
                    System.out.println("Girdiğiniz sayıdan yukarıya çıkın.");
                    right--;
                }else {
                    System.out.println("Tebrikler kazandınız!");
                    break;
                }
            }else {
                System.out.println("Lütfen 1-100 arasında bir sayı giriniz.");
            }


        }
        System.out.println("Tahmin hakkınız bitti. Geçmiş olsun.");
    }
}
