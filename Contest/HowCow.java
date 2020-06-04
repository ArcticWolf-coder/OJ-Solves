import java.util.*;


public class HowCow {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){

            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            int n=sc.nextInt();

            System.out.println("Case "+i+":");
            for(int j=1;j<=n;j++) {
                int x=sc.nextInt();
                int y=sc.nextInt();
                if(x>x1 && x<x2 && y>y1 && y<y2){
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }

            }

        }
    }
}