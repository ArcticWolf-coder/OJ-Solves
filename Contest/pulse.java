import java.util.*;
public class pulse {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();int m,j;
        for (int i=1;i<=n;i++){
            int num=sc.nextInt();
            m=0;j=0;
            
            for (int k=1;k<=num;k++){
                int no=sc.nextInt();
                m += (n / 30) * 10 + 10;
                j += (n / 60) * 15 + 15;
                
            }
            if(m==j){
                System.out.println("Case "+i+": Mile Juice "+j);
            }else if(m>j){
                System.out.println("Case "+i+": Mile "+m);
            } else if (m<j){
                System.out.println("Case "+i+": Juice "+j);
            } 
            
        }
                
                
          
                    
                
        
       
                
        
    }
}
  