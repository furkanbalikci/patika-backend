import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Bir yıl giriniz");
        while (true) {
            year = scanner.nextInt();
            if (year <= 4) {
                System.out.println("lütfen 4'ten büyük bir yıl giriniz.");
            }else {
                break;
            }
        }
        if (year%100==0){
            if (year%400 == 0) {
                System.out.println(year + " bir artık yıldır.");
            }else {
                System.out.println(year + " bir artık yıl değildir.");
            }
        } else if (year%4 == 0) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");

        }
    }
}
