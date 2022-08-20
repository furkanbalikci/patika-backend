import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x,y;
        System.out.print("Matrisin satır boyutunu giriniz: ");
        x = scanner.nextInt();
        System.out.print("Matrisin sütun boyutunu giriniz: ");
        y = scanner.nextInt();

        int[][] matris = new int[x][y];
        int[][] transpose = new int[y][x];

        for (int i = 0; i < x; i++) {

            for (int j = 0; j < y; j++) {
                System.out.print(i+","+j+". eleman: ");
                matris[i][j] = scanner.nextInt();
            }
        }


        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                transpose[i][j] = matris[j][i];
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }
    }
}
