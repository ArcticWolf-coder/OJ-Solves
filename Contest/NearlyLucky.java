import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class NearlyLucky{


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        long s=(Long.parseLong(f.readLine()));
        long sum=0;
        for(;s>0;s/=10)
        {
            if (s%10==4 || s%10==7){
                sum ++;
            }
        }
        if(sum==4 ||sum==7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
