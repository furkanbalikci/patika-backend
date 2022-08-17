import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,firstElement = 0,secondElement=1,result;
        System.out.print("Eleman sayısını giriniz: ");
        n = scanner.nextInt();
        while (n>=0){
            result = firstElement + secondElement;
            secondElement = firstElement;
            firstElement = result;
            System.out.print(secondElement + " ");
            n--;
        }
    }
}
