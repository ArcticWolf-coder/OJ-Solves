import java.util.*;
public class Pole {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int no=0;
        char num,temp='2';

        for(int i=1;i<=n;i++) {
            num = sc.next().charAt(0);
            if (i == 1) {
                no++;

            } else {
                if (num != temp) {
                    no++;

                }
            }
            temp = num;
        }

        System.out.println(no);


    }

}
