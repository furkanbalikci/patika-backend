import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance, age, tripType;
        double standartPrice,ageDiscount,roundTripDistcount = 0.20,totatlPrice = 0;
        while (true){
            System.out.println("Mesafeyi km türünden giriniz:");
            distance = scanner.nextInt();
            if (distance < 0) {
                System.out.println("Hatalı Veri Girdiniz.");
            }else {
                break;
            }
        }

        standartPrice = distance * 0.10;

        while (true){
            System.out.println("Yaşınızı giriniz:");
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Hatalı Veri Girdiniz.");
            }else {
                break;
            }
        }
        while (true){
            System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
            tripType = scanner.nextInt();
            if (tripType == 1 | tripType == 2) {
                break;
            }else {
                System.out.println("Hatalı Veri Girdiniz.");
            }
        }

        if (age <= 12) {
            ageDiscount = standartPrice - (standartPrice*0.50);
            if (tripType == 2) {
                totatlPrice = (ageDiscount - (ageDiscount*roundTripDistcount)*2);
            }else {
                totatlPrice = ageDiscount;
            }
        } else if (age >= 65) {
            ageDiscount = standartPrice - (standartPrice*0.30);
            if (tripType == 2) {
                totatlPrice = (ageDiscount - (ageDiscount*roundTripDistcount))*2;
            }else {
                totatlPrice = ageDiscount;
            }
        }else if (age <= 24 && age > 12){
            ageDiscount = standartPrice - (standartPrice*0.10);
            if (tripType == 2) {
                totatlPrice = (ageDiscount - (ageDiscount*roundTripDistcount))*2;
            }else {
                totatlPrice = ageDiscount;
            }
        }else{
            if (tripType == 2) {
                totatlPrice = (standartPrice - (standartPrice*roundTripDistcount))*2;
            }else {
                totatlPrice = standartPrice;
            }
        }
        System.out.println("Toplam Tutar: " + totatlPrice);

    }
}
