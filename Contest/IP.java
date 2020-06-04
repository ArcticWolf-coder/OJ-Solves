import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class IP {



    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            String d[]=sc.next().split("\\.");

            String b[]=sc.next().split("\\.");

            boolean a=true;
            for (int j=0;j<d.length;j++){
                String s=Integer.toBinaryString(Integer.parseInt(d[j]));


                if(Long.parseLong(s)==Long.parseLong(b[j])){
                } else {
                    a=false;
                }
            }
            System.out.print("Case "+i+": ");
            System.out.println(a?"Yes":"No");
        }
    }
}