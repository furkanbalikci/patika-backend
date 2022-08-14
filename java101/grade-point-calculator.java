import java.util.Scanner;

public class Main {
    public static  void main(String[] args){
        int mat, kimya, fizik, turkce, tarih, muzik;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mat notunu giriniz");
        mat = scanner.nextInt();
        System.out.println("Kimya notunu giriniz");
        kimya = scanner.nextInt();
        System.out.println("Fizik notunu giriniz");
        fizik = scanner.nextInt();
        System.out.println("Tarih notunu giriniz");
        tarih = scanner.nextInt();
        System.out.println("Türkçe notunu giriniz");
        turkce = scanner.nextInt();
        System.out.println("Müzik notunu giriniz");
        muzik = scanner.nextInt();

        int average = (mat+kimya+fizik+turkce+tarih+muzik)/6;
        System.out.println(average>60 ? "Sınıfı Geçti":"Sınıfta Kaldı");
    }

}
