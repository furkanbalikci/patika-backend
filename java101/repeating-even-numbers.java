import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizi kaç elemanlı olsun: ");
        n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(i+1 + ". eleman: ");
            list[i] = scanner.nextInt();
        }

        int[] duplicate = new int[n];
        int startIndex = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i != j) & (list[i] == list[j]) & (list[i])%2 == 0) {
                    duplicate[startIndex++] = list[i];
                    break;
                }
            }
        }
        for (int value:duplicate) {
            if (value != 0) {
                System.out.println(value);
            }

        }
    }
}
