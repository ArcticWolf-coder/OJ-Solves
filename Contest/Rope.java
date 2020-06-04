import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class Rope {



    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        double m=sc.nextDouble();
        double sum=2*Math.PI*m;
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=a,d=b;
        for(int i=1;i<n;i++) {
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            sum+=Math.sqrt((x-a)*(x-a)+(y-b)*(y-b));
            a=x;
            b=y;

        }
        sum+=Math.sqrt((c-a)*(c-a)+(d-b)*(d-b));
        System.out.printf("%.2f\n",sum);
    }
}