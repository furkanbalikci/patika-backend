import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("1.sayıyı giriniz:");
        a = scanner.nextInt();
        System.out.println("2.sayıyı giriniz:");
        b = scanner.nextInt();
        System.out.println("3.sayıyı giriniz:");
        c = scanner.nextInt();

        if ((a<b) & (a<c)) {
            if (b<c){
                System.out.println("a<b<c");
            }else {
                System.out.println("a<c<b");
            }
        } else if ((b<c) & (b<a)) {
            if (c<a){
                System.out.println("b<c<a");
            }else {
                System.out.println("b<a<c");
            }
        } else if ((c<a) & (c<b)) {
            if (a<b){
                System.out.println("c<a<b");
            }else {
                System.out.println("c<b<a");
            }
        }else {
            if (a==b){
                if (a<c){
                    System.out.println("a=b<c");
                }else {
                    System.out.println("c<a=b");
                }
            } else if (b==c) {
                if (a<c){
                    System.out.println("a<b=c");
                }else {
                    System.out.println("b=c<a");
                }
            } else if (a==c) {
                if (b<a){
                    System.out.println("b<a=c");
                }else {
                    System.out.println("a=c<b");
                }
            }

            }


        }
}
