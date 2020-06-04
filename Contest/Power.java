import java.util.*;
public class Power {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long num=sc.nextLong();
        long temp=n;
        int no=0;
        for(;temp<num;){
            temp*=n;
            no++;
        }
        if(temp==num){
            System.out.println("YES\n"+no);
        } else {
            System.out.println("NO");
        }


    }

}
