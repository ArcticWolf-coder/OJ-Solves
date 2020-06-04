import java.util.*;


public class Setu {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){

            int n=sc.nextInt();
            int sum=0;
            System.out.println("Case "+i+":");
            for(int j=1;j<=n;j++) {
                String s = sc.next();
                if (s.equals("donate")) {
                    sum += sc.nextInt();
                } else if (s.equals("report")) {
                    System.out.println(sum);
                }
            }

        }
    }
}