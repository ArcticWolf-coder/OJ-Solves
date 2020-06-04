import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Dots{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int sum=0;
        int j=3;
        for(int i=1;i<n;i++) {
        	j+=Math.pow(2, i);
        }
        sum+=j*j;
        
       
        
        System.out.println(sum);
    }
}
