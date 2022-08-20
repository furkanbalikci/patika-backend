import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        int n,closestMin,closestMax,length = list.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = scanner.nextInt();
        int[] temp = new int[length+1];
        for (int j = 0; j < length; j++) {
            temp[j] = list[j];
        }
        temp[length] = n;


        Arrays.sort(temp);
        for (int i = 0; i < length+1; i++) {
            if (temp[i] == 5) {
                closestMin = temp[i-1];
                closestMax = temp[i+1];
                System.out.println("Girilen sayıdan küçük en yakın sayı : " + closestMin);
                System.out.println("Girilen sayıdan büyük en yakın sayı : " + closestMax);
                break;
            }
        }




    }
}
