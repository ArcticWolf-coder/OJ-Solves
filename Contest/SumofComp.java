import java.util.*;
public class SumofComp {
    public static boolean P(int n){
        int x = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                x++;
            }
        }
        if (x == 1) {
            return false;
        } else {
            return true;
        }

    }
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 4, j = num - 4; ;i++,j--){
            if (P(i) && P(j)) {
                System.out.println(i + " " + j);
                break;
            }

        }

    }

}
