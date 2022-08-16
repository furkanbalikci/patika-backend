import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,r,result = 1;
        System.out.println("taban sayısını giriniz: ");
        n = scanner.nextInt();
        System.out.println("üs sayısını giriniz: ");
        r = scanner.nextInt();
        for (int i = 0; i < r; i++) {
            result *=n;
        }
        System.out.println(result);

    }
}
