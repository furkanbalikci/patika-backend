import java.util.Scanner;


public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double r,a,area,pi=3.14;
        System.out.println("Yarı çap giriniz:");
        r = scanner.nextDouble();
        System.out.println("Açı giriniz:");
        a = scanner.nextDouble();
        area = (pi*(r*r)*a)/360;
        System.out.println(area);
    }

}
