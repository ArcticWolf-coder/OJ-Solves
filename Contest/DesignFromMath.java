import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class DesignFromMath {
    static boolean P(long n) {
        
        if (n%2==0) return false;
        
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {

       InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader b=new BufferedReader(r);
        long x=Long.parseLong(b.readLine());
        for(long i=4;;i++){
            if((!P(i)) && (!P(x-i))){
                System.out.println(i+" "+(x-i));
                break;
            }
        }




    }
}
