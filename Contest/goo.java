import java.util.*;
public class goo {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
        for (int i=1;i<=n;i++){
            String []s=new String [10];
            int [] a=new int [10];
            for (int j=0;j<s.length;j++){
                
                s[j]=sc.next();
                
                a[j]=sc.nextInt();
                
                
            }
            int max=a[0];
            for (int j=1;j<a.length;j++){
                if (a[j]>max){
                    max=a[j];
                }
            }
            System.out.println("Case #"+i+":");
            for (int j=0;j<s.length;j++){
                if(a[j]==max){
                    System.out.println(s[j]);
                }
            }
        }
            
                
          
                    
                
        
       
                
        
    }
}
 