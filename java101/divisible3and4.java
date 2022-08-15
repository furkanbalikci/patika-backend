import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number,count=0,sum = 0;
        double average;
        System.out.println("Bir sayı giriniz:");
        number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (i%3 == 0 & i%4==0) {
                sum += i;
                count++;
            }
        }
        average = sum / count;
        System.out.println(number +" sayısına kadar 3 ve 4 e tam bölünen sayıların ortalması: "+ average);

    }
}
