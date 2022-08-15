import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int day, month;

        String burc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Day : ");
        day = scanner.nextInt();
        System.out.print("Month : ");
        month = scanner.nextInt();
        if ((day>=1 && day<=31) && (month>=1 && month<=12)) {

            if ((day >= 21 && month == 3) || (day <= 20 && month == 4)) {
                burc = "Koc Burcu";
            }
            else if ((day >= 21 && month == 4) || (day <= 21 && month == 5)) {
                burc = "Boga Burcu";
            } else if ((day >= 22 && month == 5) || (day <= 22 && month == 6)) {
                burc = "Ikizler Burcu";
            } else if ((day >= 23 && month == 6) || (day <= 22 && month == 7)) {
                burc = "Yengec Burcu";
            } else if ((day >= 23 && month == 7) || (day <= 22 && month == 8)) {
                burc = "Aslan Burcu";
            } else if ((day >= 23 && month == 8) || (day <= 22 && month == 9)) {
                burc = "Basak Burcu";
            } else if ((day >= 23 && month == 9) || (day <= 22 && month == 10)) {
                burc = "Terazi Burcu";
            } else if ((day >= 23 && month == 10) || (day <= 21 && month == 11)) {
                burc = "Akrep Burcu";
            } else if ((day >= 22 && month == 11) || (day <= 21 && month == 12)) {
                burc = "Yay Burcu";
            } else if ((day >= 22 && month == 12) || (day <= 21 && month == 1)) {
                burc = "Oglak Burcu";
            } else if ((day >= 22 && month == 1) || (day <= 19 && month == 2)) {
                burc = "Kova Burcu";
            } else {
                burc = "Balik Burcu";

            }
            System.out.print("Burcunuz : " + burc);
        }else {
            System.out.print("Gun veya ay degerlerini yanlis girdiniz.");
        }


        }
}
