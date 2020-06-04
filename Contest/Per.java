import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Per{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        for(int i=0;i<s.length();i+=3) {
        	if(s.charAt(i)!='P') {
        		sum++;
        	}
        }
        for(int i=1;i<s.length();i+=3) {
        	if(s.charAt(i)!='E') {
        		sum++;
        	}
        }
        for(int i=2;i<s.length();i+=3) {
        	if(s.charAt(i)!='R') {
        		sum++;
        	}
        }
        
       
        
        System.out.println(sum);
    }
}
