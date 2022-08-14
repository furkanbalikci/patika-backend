import java.util.Scanner;


public class Main {
    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double height,weight,bodyMass;
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scanner.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextDouble();
        bodyMass = weight/(height*height);
        System.out.println("Vücut Kitle İndeksiniz: " + bodyMass);


    }

}
