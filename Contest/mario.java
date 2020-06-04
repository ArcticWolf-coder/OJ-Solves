import java.util.*;
public class mario {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            int num=sc.nextInt();
            int [] a=new int [num];
            int h=0, l=0;
            a[0]=sc.nextInt();
            for (int j=1;j<a.length;j++){
                a[j]=sc.nextInt();
                if(a[j]>a[j-1]){
                    h++;
                } else if(a[j]<a[j-1]){
                    l++;
                } 
            }
            System.out.println("Case "+i+": "+h+" "+l);
        }
          
                    
                
        
       
                
        
    }
}
