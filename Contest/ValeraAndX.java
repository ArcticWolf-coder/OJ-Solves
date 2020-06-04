import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ValeraAndX {


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String []a=new String[n];

        for(int i=0;i<a.length;i++){
            a[i]=sc.next();
        }

        boolean b=true;
        char c=a[0].charAt(0);
        char d=a[0].charAt(1);
        if(c==d){

            b=false;
        }else {
            e:
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a[i].length(); j++) {
                    if (i == j || j == n - 1 - i) {
                        if (a[i].charAt(j) == c) {

                        } else {
                            b = false;
                            break e;
                        }
                    } else {
                        if (a[i].charAt(j) == d) {

                        } else {
                            b = false;
                            break e;
                        }
                    }


                }
            }
        }
        if(b){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }



    }
}
