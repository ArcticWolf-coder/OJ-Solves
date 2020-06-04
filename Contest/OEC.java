import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class OEC {



    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int p=sc.nextInt();
        int i=sc.nextInt();
        int j=sc.nextInt();
        int s=sc.nextInt();
        int a=sc.nextInt();
        boolean b;
        if((i+j)%2==0){
            if(p==1){
                b=true;
            } else {
                b=false;
            }
        } else {
            if(p==1){
                b=false;
            } else {
                b=true;
            }
        }
        if(s==1){
            if(a==1){
                b=false;
            } else {
                b=true;
            }
        } else {
            if(a==1){
                b=true;
            } 
        }
        System.out.print("Jogador "+(b?"1":"2")+" ganha!");

    }
}