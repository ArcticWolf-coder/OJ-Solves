import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Equation{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        
        
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        char a='0',b='0';
        if(x+y==z) {
        	a='+';
        	b='=';
        } else if(x*y==z) {
        	a='*';
        	b='=';
        } else if(x-y==z) {
        	a='-';
        	b='=';
        } else if(x/y==z) {
        	a='/';
        	b='=';
        } else if(x==y+z) {
        	a='=';
        	b='+';
        } else if(x==y*z) {
        	a='=';
        	b='*';
        } else if(x==y-z) {
        	a='=';
        	b='-';
        } else if(x==y/z) {
        	a='=';
        	b='/';
        }
        
       
        
        System.out.println(""+x+a+y+b+z);
    }
}
