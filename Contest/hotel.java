import java.util.*;
public class hotel {
    public static void main (String [] args) {
      Scanner sc=new Scanner(System.in);
      
      for (;sc.hasNext();){  
        int number=sc.nextInt();
        int budget=sc.nextInt();
        int hotel=sc.nextInt();
        int week=sc.nextInt();
        int []sum=new int [hotel];
        int min=0;
        for (int i=0;i<hotel;i++){
            int cost=sc.nextInt();
            
            for (int j=1;j<=week;j++){
                int bed=sc.nextInt();
                if(bed>=number){
                    sum[i]=number*cost;
                    
                }
            }
        }
        Arrays.sort(sum);
        for(int i=0;i<hotel;i++){
            if(sum[i]>0){
                min+=sum[i];
                break;
            }
        }
        if (min==0 || min>budget){
            System.out.println("stay home");
        } else {
            System.out.println(min);
        }
      }
        
                    
                
 
    }
}
    