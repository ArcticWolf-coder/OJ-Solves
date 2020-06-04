import java.util.*;
public class number {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
       
        for (int i=1;i<=n;i++){
            int num=sc.nextInt();
            num*=567;
            num/=9;
            num+=7492;
            num*=235;
            num/=47;
            num-=498;
            String s=Integer.toString(num);
            System.out.println(s.charAt(s.length()-2));
        }
                
        
    }
}