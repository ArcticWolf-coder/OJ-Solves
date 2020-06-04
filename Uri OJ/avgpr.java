import java.util.*;

public class avgpr{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for (int i=1;i<=t;i++){
            int n=sc.nextInt();
            int no=0;
            int [] a=new int[n];
            for (int m=0;m<a.length;m++){
                a[m]=sc.nextInt();
            }
            for (int j=0;j<a.length;j++){
                double x=a[j];
                for(int k=j+1;k<a.length;k++){
                    double y=a[k];
                    double avg=(x+y)/2.0;
                    for (int m=0;m<a.length;m++){
                        if (avg==(double)a[m]){
                            no++;
                            break;
                        }
                    }
                }
            }
            System.out.println(no);
        }
        
                    
            
            
            
            
        
      
    }
}

                
                
            