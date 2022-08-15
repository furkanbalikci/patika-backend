import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.println("Sıcaklık giriniz:");
        temp = scanner.nextInt();
        if (temp > 25) {
            System.out.println("Yüzme");
        }else {
            if (temp > 15) {
                System.out.println("Piknik");
            }else {
                if (temp > 5){
                    System.out.println("Sinema");
                }else {
                    System.out.println("Kayak");
                }
            }
        }

    }
}
