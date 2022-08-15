import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mat,fizik,turkce,kimya,muzik;
        double average;


        while (true){
            System.out.println("Matematik notu giriniz: ");
            mat = scanner.nextInt();
            if (mat>=0 & mat<=100){
                break;
            }else {
                System.out.println("Girdiğiniz değer 0-100 olmalı!");
            }
        }

        while (true){
            System.out.println("Fizik notu giriniz: ");
            fizik = scanner.nextInt();
            if (fizik>=0 & fizik<=100){
                break;
            }else {
                System.out.println("Girdiğiniz değer 0-100 olmalı!");
            }
        }
        while (true){
            System.out.println("Kimya notu giriniz: ");
            kimya = scanner.nextInt();
            if (kimya>=0 & kimya<=100){
                break;
            }else {
                System.out.println("Girdiğiniz değer 0-100 olmalı!");
            }
        }
        while (true){
            System.out.println("Türkçe notu giriniz: ");
            turkce = scanner.nextInt();
            if (turkce>=0 & turkce<=100){
                break;
            }else {
                System.out.println("Girdiğiniz değer 0-100 olmalı!");
            }
        }
        while (true){
            System.out.println("Müzik notu giriniz: ");
            muzik = scanner.nextInt();
            if (muzik>=0 & muzik<=100){
                break;
            }else {
                System.out.println("Girdiğiniz değer 0-100 olmalı!");
            }
        }
        average = (mat+fizik+kimya+turkce+muzik)/5;
        if (average <= 55) {
            System.out.println("Sınıfta kaldınz. Ortalamanız: " + average);
        }else {
            System.out.println("Sınıfı geçtiniz. Ortalamanız: "+ average);
        }




    }
}
