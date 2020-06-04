import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class MinMax {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int d = sc.nextInt();
        int x = sc.nextInt();
        int min=0,max=0;
        for (int i = l; i <= d; i++){
            String s[]=Integer.toString(i).split("");
            int sum=0;
            for(int j=0;j<s.length;j++){
                sum+=Integer.parseInt(s[j]);
            }
            if(sum==x){
                min=i;
                break;
            }
        }
        for (int i = d; i >= l; i--){
            String s[]=Integer.toString(i).split("");
            int sum=0;
            for(int j=0;j<s.length;j++){
                sum+=Integer.parseInt(s[j]);
            }
            if(sum==x){
                max=i;
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}

