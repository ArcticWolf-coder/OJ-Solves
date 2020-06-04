import java.util.*;
public class H{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        if((n%4==0)&&(n%100!=0)||(n%400==0)){
            sum=12;
        } else {
            sum=13;
        }
        System.out.println(sum+".09."+n);
    }
}

