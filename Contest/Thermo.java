import java.util.*;

public class Thermo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double d = 0;
            double f = 0;
            if (b == 0) {
                f = a;

            } else {
                f = 9 * a / 5 + 32.0;
                f += b;
                f = (f - 32) * 5 / 9;
            }
            System.out.print("Case " + i + ": ");
            System.out.printf("%.2f\n", f);
        }










    }
}
