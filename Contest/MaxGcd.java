import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;





public class MaxGcd {
    public static int gcd(int a,int b){
        if(b%a==0)
            return a;
        else
            return gcd(b%a,a);
    }




    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String []a=sc.nextLine().split(" ");
            int b[]=new int [a.length];
            for(int j=0;j<a.length;j++){
                b[j]=Integer.parseInt(a[j]);
            }
            int max=0;
            for(int j=0;j<b.length-1;j++){
                for(int k=j+1;k<b.length;k++){
                    int num=gcd(b[j],b[k]);
                    if(num>max){
                        max=num;
                    }
                }
            }
            System.out.println(max);

        }
    }
}