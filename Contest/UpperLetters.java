import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class UpperLetters{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        String sum=sc.next();
        String [] a=sum.split("-");
        String s="";
        for(int i=0;i<a.length;i++) {
        	s+=a[i].charAt(0);
        }
        System.out.println(s);
    }
}
