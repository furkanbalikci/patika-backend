import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,tempN,pow=0,basValue,basPow,result=0;
        System.out.println("bir sayı giriniz: ");
        n = scanner.nextInt();
        tempN = n;

        while (tempN != 0){
            tempN/=10;
            pow++;

        }
        tempN = n;
        while (tempN != 0){
            basValue = tempN % 10;
            basPow = 1;
            for (int i = 0; i < pow; i++) {
                basPow *= basValue;
            }
            result+=basPow;
            tempN/=10;
        }
        if (result == n) {
            System.out.println(n + " sayısı bir Armstrong sayıdır.");
        } else {
            System.out.println(n + " sayısı bir Armstrong sayısı değildir.");
        }

    }
}
