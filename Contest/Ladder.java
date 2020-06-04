import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Ladder{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        
        double n=sc.nextDouble();
        double v=sc.nextDouble();
        double sum=n/(double)Math.sin(Math.toRadians(v));
        
        System.out.println((int)Math.ceil(sum));
    }
}
