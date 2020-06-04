import java.util.*;
public class Button {
      
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=0;
        int num=0;
        boolean m;
        if (n == 1) {
            num=sc.nextInt();
            if(num==1){
                m=true;
            } else {
                m=false;
            }
         
        

        
        } else {
        for(int i=1;i<=n;i++) {
            num=sc.nextInt();

            if (num == 0) {
                no++;
            }
        }
    

        if (no == 1) {
            m=true;
            
        }else {
            m=false;
        }
        }
        if(m){
        System.out.println("YES");
        } else {
            System.out.println("NO");
        }
                
                
                
       
        
        
    }
}