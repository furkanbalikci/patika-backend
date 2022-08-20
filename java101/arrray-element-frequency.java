import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] numb = {10,20,5};
        int n = list.length,count = 0;

        for (int i = 0; i < numb.length; i++) {
            count = 0;
            for (int j = 0; j < n; j++) {
                if ((list[j] == numb[i])) {
                    count++;
                }
            }
            if (count == 0) {
                count = 1;
            }
            System.out.println(numb[i] + " sayısı " + count + " kere tekrar edildi.");

        }

    }
}
