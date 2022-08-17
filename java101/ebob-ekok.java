import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,k,ebob = 0,ekok;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz: ");
        n1 = scanner.nextInt();
        System.out.println("2.sayıyı giriniz: ");
        n2 = scanner.nextInt();
        k = n1;
        while (k >=1){
            if (n1 % k == 0 & n2 % k == 0) {
                ebob = k;
                System.out.println(n1 + " ve " + n2 + " sayılarının ebobu: "+ebob);
                break;
            }
            k--;
        }
        ekok = (n1*n2)/ebob;
        System.out.println(n1 + " ve " + n2 + " sayılarının ekoku: "+ekok);
    }
}
