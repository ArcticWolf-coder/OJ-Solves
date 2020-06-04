import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class AlmostPrime{
    static boolean P(long n) {
        if(n < 2) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        long sqrtN = (long)Math.sqrt(n)+1;
        for(long i = 6L; i <= sqrtN; i += 6) {
            if(n%(i-1) == 0 || n%(i+1) == 0) return false;
        }
        return true;
    }


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader c = new BufferedReader(r);

        int n=Integer.parseInt(c.readLine());
        for(int j=1;j<=n;j++){
            long x=Long.parseLong(c.readLine());
            long y=Long.parseLong(c.readLine());
            int sum=0;
            for(long i=x;i<=y;i++){
                int num = 0;
                for(long k = 2; k <i; k++)
                {
                    if(num>1){
                        break;
                    }
                    if(!P(k)){
                        continue;
                    }
                    if(i%k == 0)
                    {
                        num++;

                    }
                }
                if(num==1){
                    sum++;
                }
            }
            System.out.println(sum);
        }



    }
}
