import java.util.Scanner;


public class Main {
    static boolean isPrime(int number,int index){

        if (number <= 2) {
            return (number==2)?true:false;
        }
        if (number % index == 0) {
            return false;
        }
        if (index * index > number) {
            return true;
        }

        return isPrime(number,index+1);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = scanner.nextInt();
        if (isPrime(number,2) == true) {
            System.out.println(number + " sayısı ASALDIR.");
        }else {
            System.out.println(number + " sayısıdı ASAL değildir.");
        }



    }
}
