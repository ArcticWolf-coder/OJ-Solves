
import java.util.*;
public class Arms{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
    
        int n=sc.nextInt();
        for (int num=0;num<=n;num++){
        
        String a[]=(Integer.toString(num)).split("");
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum+=Math.pow(Integer.parseInt(a[i]),a.length);
        }
        if (sum==num){
        System.out.println(num);
        }
        }
    }
}
            