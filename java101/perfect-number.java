import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Bir sayı giriniz: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Girlen sayı 0'dan büyük olmalıdır.");
            }else {
                break;
            }
        }

        if (n == 1) {
            System.out.println("1 Mükemmel sayı değildir.");
        }
        for (int i = 1; i < n; i++) {
            if (n%i == 0) {
                sum+=i;
            }
        }
        if (sum == n) {
            System.out.println(n + " Mükemmel sayıdır.");
        }else {
            System.out.println(n + " Mükemmek bir sayı değildir.");
        }
    }
}
