import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, tempN, basValue, result = 0;
        System.out.println("bir sayı giriniz: ");
        n = scanner.nextInt();
        tempN = n;
        while (tempN != 0) {
            basValue = tempN % 10;

            result += basValue;
            tempN /= 10;


        }
        System.out.println(n + " sayısının basamaklarının toplamı: "+result);
    }
}
