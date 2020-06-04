import java.util.Scanner;
public class ValeraPlates { 
    public static void main(String[] args) {       
    
    Scanner sc=new Scanner (System.in);
   int n=sc.nextInt();
   int m=sc.nextInt();
   int k=sc.nextInt();
   
    int [] a=new int[n];
    int wash=0;
   
    for (int i=0; i<a.length;i++){
       a[i]=sc.nextInt();
       if (a[i]==1){
           m--;
        if(m<0)   {wash++;}
       } else if(a[i]==2){
           
           
               k--;
               if(k<0){m--;
                   if(m<0){wash++;}
               }
        }
    
    }
  System.out.println(wash);
        
    }
 
}
    
  




