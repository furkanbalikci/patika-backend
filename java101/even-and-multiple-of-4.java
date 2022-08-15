import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 1,sum = 0;
        while (number > 0){
            System.out.println("Bir sayı giriniz: ");
            number = scanner.nextInt();
            if (number%4 == 0 | number == 2) {
                sum += number;
            }else if (number%2 == 1){
                break;
            }
        }
        System.out.println("Toplam: " + sum);


    }
}
