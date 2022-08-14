import java.util.Scanner;


public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double armut = 2.14, elma = 3.67,domates = 1.11, muz = 0.95, patlican = 5.00,toplam;
        double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
        System.out.println("Armut Kaç Kilo? :");
        armutKilo = scanner.nextDouble();
        System.out.println("Elma Kaç Kilo? :");
        elmaKilo = scanner.nextDouble();
        System.out.println("Domates Kaç Kilo? :");
        domatesKilo = scanner.nextDouble();
        System.out.println("Muz Kaç Kilo? :");
        muzKilo = scanner.nextDouble();
        System.out.println("Patlıcan Kaç Kilo? :");
        patlicanKilo = scanner.nextDouble();

        toplam = armut*armutKilo+elma*elmaKilo+domates*domatesKilo+muz*muzKilo+patlican*patlicanKilo;
        System.out.println(toplam);


    }

}
