import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("bir sayi giriniz");
        number = scanner.nextInt();
        System.out.println("4'ün katları");
        for (int i = 1; i < number; i*=4) {
            System.out.println(i);
        }
        System.out.println("5'in katları");
        for (int i=1; i < number; i*=5){
            System.out.println(i);
        }

    }
}
