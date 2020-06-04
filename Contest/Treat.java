import java.util.*;
public class Treat {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        
        
       
        for (int i=1;i<=75;i++){
            int n=sc.nextInt();
            if (n==0){
                break;
            }
            int sum=0;
            for (int j=1;j<=n;j++){
                int num=sc.nextInt();
                if(num==0){
                    sum--;
                } else {
                    sum++;
                }
            }
            System.out.println("Case "+i+": "+sum);
        }
                
        
    }
}
  