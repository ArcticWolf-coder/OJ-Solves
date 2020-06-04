import java.util.*;
public class Dist {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
       
        for (int i=1;i<=n;i++){
            int sum=0;
            int num=sc.nextInt();
            int [] a=new int [num];
            for (int j=0;j<a.length;j++){
                a[j]=sc.nextInt();
            }
            Arrays.sort(a);
            for (int j=1;j<a.length;j++){
                sum+=a[j]-a[j-1];
            }
            sum*=2;
            System.out.println(sum);
            
        }
                
        
    }
}