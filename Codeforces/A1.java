import java.util.*;
public class A1 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a=sc.nextInt();
        long sum=1;
        sum*= (long)Math.ceil ((double)m/(double)a);
        sum*=(long)Math.ceil((double)n/(double)a);
        System.out.println(sum);
    }
}