import java.util.Scanner;


public class Main {
    static void createPattern(int number){
        if (number > 0) {
            System.out.print(number + " ");
            createPattern(number-5);
        }
        System.out.print( number + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = scanner.nextInt();
        createPattern(number);




    }
}
