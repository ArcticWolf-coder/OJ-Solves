import java.util.*;
public class Main{
    public static void main(String[] args)  {
      Scanner sc=new Scanner(System.in);  
      for (; sc.hasNextLine()==true;){
       int k=sc.nextInt();
       int j=sc.nextInt();
       int st,end;
       if (k>j){
            st=j;
            end=k;
       } else {
            st=k;
            end=j;
       }
       int [] a= new int [end-st+1];
       
       for(int i=st, s=0;i<=end;s++,i++){
        int n=1;
        while(i>1){
            n++;
            
            if (i%2==0){
                i=i/2;
            } else {
                i=3*i+1;
            }
            
        }
        a[s]=n;
       }
       int max=a[0];
       for (int q=1;q<a.length;q++){
           if(a[q]>max){
               max=a[q];
           }
       }
       System.out.println(st+" "+end+" "+max);
      }
        
        
        
        
    
            
        
        
        
        
    }
}