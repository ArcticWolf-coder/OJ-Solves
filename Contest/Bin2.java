import java.util.*;

public class Bin2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 1; j <= t; j++) {
            int n = sc.nextInt();
            String s = "";
            for (; n > 0; ) {

                s += n % 2;
                n /= 2;


            }
            String a = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                a += s.charAt(i);

            }
            int sum = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == '1') {
                    sum++;
                }
            }
            System.out.print("Case " + j + ": ");
            if (sum % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }


    }
}
