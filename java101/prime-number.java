import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count;
        System.out.print("2 ");
        for (int i = 3; i <=100 ; i++) {
            count = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.print(i+" ");
            }
        }

    }
}
