import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class Read {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            boolean b=true;
            String a[]=sc.next().split("");
            for(int j=0;j<a.length;j++){
                if(s.contains(a[j])){

                } else {
                    b=false;
                    break;
                }
            }
            System.out.println(b?"Yes":"No");
        }
    }
}