import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Match{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        for(int i=1;i<=x;i++) {
        	int n=sc.nextInt();
        	int sum=(int)Math.sqrt(y*y+z*z);
        	if(n<=sum) {
        		System.out.println("DA");
        	} else {
        		System.out.println("NE");
        	}
        }
        
       
        
        System.out.println();
    }
}
