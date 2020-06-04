import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class PrettyInteger{
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
        BufferedReader f = new BufferedReader(r);

        int m=Integer.parseInt(f.readLine());
        int n=Integer.parseInt(f.readLine());
        String s="";
        String p="";
        for(int i=1;i<=m;i++){
            s+=f.readLine();

        }
        for(int i=1;i<=n;i++){
            p+=f.readLine();

        }
        String c[]=s.split("");
        String d[]=p.split("");
        for(long i=1;;i++){
            String a=Long.toString(i);
            boolean b=false;
            boolean e=false;
            for(int j=0;j<c.length;j++){
                if(a.contains(c[j])){
                    b=true;
                    break;
                }

            }
            for(int j=0;j<d.length;j++){
                if(a.contains(d[j])){
                    e=true;
                    break;
                }

            }
            if(e&&b){

                System.out.println(i);
                break;
            }
        }



    }
}
