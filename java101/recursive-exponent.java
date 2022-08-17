import java.util.Scanner;


public class Main {
    static int pow(int base,int exponent){
        if (base == 1 | exponent == 0) {
            return 1;
        }
        return pow(base,exponent-1)*base;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,r;
        System.out.println("taban sayısını giriniz: ");
        n = scanner.nextInt();
        System.out.println("üs sayısını giriniz: ");
        r = scanner.nextInt();
        System.out.println(pow(n,r));

    }
}
