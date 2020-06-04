import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;



public class PrimeFactors {
    public static void primeFactor(int n){
        for(;n%2==0;){
            System.out.print(" "+2);
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            for(;n%i==0;){
                System.out.print(" "+i);
                n/=i;
            }
        }
        if(n>2){
            System.out.print(" "+n);
        }

    }


    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        System.out.print(n+":");
        primeFactor(n);
        System.out.println();

    }
}

