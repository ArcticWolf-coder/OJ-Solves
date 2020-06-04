import java.util.*;
public class LedNum {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;

        int x=sc.nextInt();
        int y=sc.nextInt();

        for (int n=x;n<=y;n++) {

            String s = "";
            s += n;


            int b[] = {6, 2, 5, 5, 4, 5, 6, 3, 7, 6};
            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < b.length; j++) {

                    if (s.charAt(i)==(char)(48+j)) {
                        sum += b[j];
                        break;
                    }
                }
            }
        }
        System.out.println(sum);
    }

}