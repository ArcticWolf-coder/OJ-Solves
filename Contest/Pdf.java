import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Pdf {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] b = new int[26];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        String c = sc.next();
        int d[]=new int [c.length()];
        for(int i=0;i<c.length();i++){
            int e=c.charAt(i);
            d[i]=b[e-97];
        }
        Arrays.sort(d);
        int f=d[c.length()-1]*c.length();




        System.out.println(f);

    }
}
