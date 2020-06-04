import java.util.*;
public class robertS{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int num=sc.nextInt();
            int m=num%5;
            if (num>=38){
            if (m>2){
                num=num+5-m;
            }
            }
            System.out.println(num);
        }
        
                
        
        
        
        
    }
}
