import java.util.Scanner;

public class Main {
    public static  void main(String[] args){

        double amount,kdvRate,kdvAmount,total;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tutar giriniz");
        amount = scanner.nextDouble();
        if ( amount > 1000.0) {
            kdvRate = 0.08;
        }else {
            kdvRate = 0.18;
        }
        kdvAmount = amount * kdvRate;
        total = kdvAmount+amount;
        System.out.println("Girilen Tutar: "+ amount);
        System.out.println("Kdv Oranı: "+ kdvRate);
        System.out.println("Kdv Tutarı: " + kdvAmount);
        System.out.println("Kdvli Tutar: "+total);

    }

}
