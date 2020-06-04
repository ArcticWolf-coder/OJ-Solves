import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GoodNumber {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int [n];
        int sum=0;
        for(int i=0;i<n;i++){
            String s=Integer.toString(sc.nextInt());
            boolean b=true;
            for(int j=0;j<=k;j++){
                String t="";
                t+=j;
                if(s.contains(t)){

                } else {
                    b=false;
                    break;
                }
            }
            if(b){
                sum++;
            }
        }

        System.out.println(sum);


    }
}
