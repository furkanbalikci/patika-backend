import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,newNumbers = 0,tempNumber,min = 0,max = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Kaç tane sayı gireceksiniz: ");
            n = scanner.nextInt();
            if (n <= 1) {
                System.out.println("Girilen sayı 1'den büyük olmak zorunda.");
            }else {
                break;
            }
        }

        System.out.println("1. sayıyı giriniz: ");
        newNumbers = scanner.nextInt();
        min= newNumbers;
        max=newNumbers;
        for (int i = 2; i <=n ; i++) {
            System.out.println(i+". sayıyı giriniz: ");
            newNumbers = scanner.nextInt();
            if (newNumbers > max){
                max = newNumbers;
            }
            if (newNumbers < min) {
                min = newNumbers;
            }
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);

    }
}
