import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class CollectBeats {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        boolean a=true;
        int sum = 0;
        int [] s=new int [10];
        for (int i = 1; i <= 4; i++) {


            char []c=sc.next().toCharArray();
            for(int j=0;j<c.length;j++){
                if(c[j]=='.') {

                }
                    else{
                        s[c[j]-'0']++;

                }
            }
        }
        for(int i=0;i<s.length;i++){
            if(s[i]>2*n){
                a=false;
                break;
            }
        }
        if(a){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}

