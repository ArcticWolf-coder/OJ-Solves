import java.util.*;
public class Bin{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int num=sc.nextInt();
            String m=Integer.toBinaryString(num);
            String [] a=m.split("");
             String u="";
            for (int j=a.length-1;j>=0;j--){
                u+=a[j];
            }
            num=Integer.parseInt(u,2);
            System.out.println(num);
        }
       
    
    }
    
    
}