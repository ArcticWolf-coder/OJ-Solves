import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class PK {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int p=sc.nextInt();
        int k=sc.nextInt();
        int start=p-k;
        int end=p+k;
        if(start<=1){
            start = 1;
        } else {
            System.out.print("<< ");
        }
        if(end>n){
            end=n;
        }
        for(int i=start;i<=end;i++) {
            if (i == p) {
                System.out.print("(" + i + ") ");
            } else {
                System.out.print(i + " ");
            }
        }
        if(end==n){

        } else {
            System.out.print(">>");
        }
        System.out.println();


    }
}

