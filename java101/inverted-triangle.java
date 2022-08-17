import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("bir sayı giriniz: ");
        n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = n; j > (n - i); j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2*(n-i)-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
