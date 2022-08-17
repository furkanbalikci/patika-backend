import java.util.Scanner;

public class Main {

    static int fibonacci(int number){
        if (number == 1 | number ==2) {
            return 1;
        }
        return fibonacci(number -1) + fibonacci(number -2);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n ; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }
}
