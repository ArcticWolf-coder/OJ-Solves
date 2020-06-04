import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class AreaOfParallelogram {



    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int ax = sc.nextInt();
            int ay = sc.nextInt();
            int bx = sc.nextInt();
            int by = sc.nextInt();
            int cx = sc.nextInt();
            int cy = sc.nextInt();
            System.out.print("Case "+i+": "+(cx-bx+ax)+" "+(cy-by+ay)+" ");
            System.out.println(Math.abs((bx-ax)*(cy-ay)-(by-ay)*(cx-ax)));
        }

    }
}