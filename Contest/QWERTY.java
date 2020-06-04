import java.util.*;
public class Main {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        String x = "  `1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./";
        for(;sc.hasNextLine();){
            
            String s=sc.nextLine();
            for (char a:s.toCharArray()){
                 
                 for (int i=1;i<x.length();i++){
                     if(a==x.charAt(i)){
                         System.out.print(x.charAt(i-1));
                     }
                 }
             }
                
            
            
            
            
            System.out.println();
        }
                
          
                    
                
        
       
                
        
    }
}
    