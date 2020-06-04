import java.util.*;


public class Lift {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int sum=Math.abs(y-x)*4+11+(4*x)+8;
            System.out.println("Case "+i+": "+sum);
        }
    }
}