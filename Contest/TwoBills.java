import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class TwoBills {




    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int a[]={2,5,10,20,50,100};
        for(;;) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean b=false;
            if(n==m){
                break;
            }

            c:for(int i=0;i<a.length;i++){
                for (int j=i+1;j<a.length;j++){
                    if((m-n)==a[i]+a[j]){
                        b=true;
                        break c;
                    }
                }
            }
            System.out.println(b?"possible":"impossible");
        }
    }
}