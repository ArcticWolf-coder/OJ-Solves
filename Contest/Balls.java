import java.util.*;
public class Balls {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        boolean b = false;
        int[] a = new int[100];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    if (a[i] != a[j] && a[i] != a[k] && a[j] != a[k] && Math.max(Math.max(a[i], a[j]), a[k]) - Math.min(Math.min(a[i], a[j]), a[k]) <= 2) {
                        b = true;
                        break;
                    }
                }
            }
        }
        if (b) {
            System.out.println("YES");

        } else {
            System.out.println("NO");
        }

    }

}
