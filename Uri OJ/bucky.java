import java.util.*;
public class bucky{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       
        int [] a={10,1,2,4,5};
        int i=0;
        int j=a.length-1;
        int x=a.length/2+3,t;
        System.out.println(x);
        while(i<j && a[i]<=x){
            i++;
        }
        while (i<j && a[j]>x){
            j--;
        }
        if (a[j]>x){
            j--;
        }
        t=a[i];
        a[i]=a[j];
        a[j]=t;
        i++;
        j--;
        while (a[i]<=x){
            i++;
        }
        i=0;
        while (i<a.length){
            System.out.println(a[i++]);
        }
            
            
       
       
            
        
        
            
        
        
        
            
        
        
        
            }
        }
        
        
        
        
           
            
        
            
        
           
            
            
            
                
            
        
        
            
            
        
                   
            
       
        
        
        
        
       
       
    