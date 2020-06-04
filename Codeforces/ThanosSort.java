import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class ThanosSort {

    public static int sum;





    public static boolean sorted(int [] a){
        int [] b=new int [a.length];

        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        Arrays.sort(b);

        for(int i=0;i<b.length;i++){
            if(b[i]!=a[i]){
                return false;
            }
        }
        return true;
    }
    public static void snap(int [] a){

        if(sorted(a)){
            return;
        }
        sum=a.length/2;
        int x=0,y=0;
        for(int i=0;i<a.length/2-1;i++){
            if(a[i]>a[i+1]){
                break;
            }else {
                x++;
            }
        }
        for(int i=a.length/2;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                break;
            }else {
                y++;
            }
        }
        int []b=new int[a.length/2];
        int j=0;
        if(x>y){
            for(int i=0;i<a.length/2;i++){
                b[j++]=a[i];
            }
        } else {
            for(int i=a.length/2;i<a.length;i++){
                b[j++]=a[i];
            }
        }
        if(sorted(b)){
            return;
        }else {
            snap(b);
        }
    }

    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sum=n;
        int []a=new int [n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        snap(a);
        System.out.println(sum);





    }
}