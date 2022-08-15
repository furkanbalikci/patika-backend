import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,r,nFac = 1,rfac = 1,nrFac= 1,result;
        System.out.println("n: ");
        n = scanner.nextInt();
        System.out.println("r: ");
        r = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            nFac = nFac *i;
        }
        for (int i = 1; i <= r; i++) {
            rfac = rfac*i;
        }
        for (int i = 1; i <= n-r; i++) {
            nrFac = nrFac*i;
        }
        result = nFac/(rfac*nrFac);
        System.out.println("C(n,r)="+result);
    }
}
