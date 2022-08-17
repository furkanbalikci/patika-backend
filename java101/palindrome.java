import java.util.Scanner;

public class Main {

    static boolean isPalindrome(int number){
        int temp,reverseNumber=0,lastNumber;
        temp = number;
        while (temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz: ");
        int number = scanner.nextInt();
        System.out.println(isPalindrome(number));
    }
}
