import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class FarmSeedlings{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int []a=new int [n];
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int [] b=new int [n];
        for(int i=b.length-1,j=1;i>=0;j++,i--) {
        	b[i]=a[i]+j;
        }
        Arrays.sort(b);
        System.out.println(b[b.length-1]+1);
    }
}
