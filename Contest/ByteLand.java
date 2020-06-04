import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class ByteLand {


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String k=sc.next();
        String a[]=k .split("");
        String b[]= k.toUpperCase().split("");
        String s="abcdefghijklmnopqrstuvwxyz";
        String q=s.toUpperCase();
        String p=".,!?";
        for(int i=0;i<n;i++){
            String c[]=sc.next().split("");
            for(int j=0;j<c.length;j++){
                if(c[j].equals("_")){
                    System.out.print(" ");
                } else if(p.contains(c[j])) {
                    System.out.print(c[j]);
                } else {
                    if(s.contains(c[j])){
                        System.out.print(a[s.indexOf(c[j])]);
                    } else {
                        System.out.print(b[q.indexOf(c[j])]);
                    }
                    /*if(c[j].compareToIgnoreCase(q[(s.indexOf(c[j]))])==0) {
                        if (c[j].compareTo(q[(s.indexOf(c[j]))]) == 0){
                            System.out.print(b[s.indexOf(c[j])]);
                        }else {
                            System.out.print(a[s.indexOf(c[j])]);
                        }
                    }
                    */
                }
            }
            System.out.println();
        }
    }
}