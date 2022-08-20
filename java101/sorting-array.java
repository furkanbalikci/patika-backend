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

        Arrays.sort(list);
        for (int element:list) {
            System.out.print(element + " ");
        }


    }
}
