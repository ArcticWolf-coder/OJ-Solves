import java.util.*;

public class CirSq {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            double d=c/Math.sqrt(2);
            double e=(double)c/2.0-d/2;
            e=(double)2.0/3*e*d;
            double f=Math.PI*d/4*d*0.5-e;
            c=(int)f*4;


            System.out.println(c);













        }


    }
}