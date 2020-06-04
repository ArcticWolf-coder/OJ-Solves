import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class FarmerFeb {
    static boolean P(int n){
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            return true;
        else
            return false;
    }



    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader c = new BufferedReader(r);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int sum = x1 + y1;
            for (int j = sum + 1; ; j++) {
                if (P(j)) {
                    System.out.println(j-sum);
                    break;
                }
            }
        }



    }
}
