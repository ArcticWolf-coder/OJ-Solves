import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Spaghetti {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int [] a=new int[n];
        a[0]=sc.nextInt();
        boolean c=true;
        for(int i=1;i<a.length;i++) {
            a[i]=sc.nextInt();
            if (Math.abs(a[i] - a[i - 1]) >= 2 ){
                c = false;
                break;
            }
        }
            if(c){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }






    }
}

