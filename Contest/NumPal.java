import java.util.*;
public class NumPal {
    
    
    public static boolean P(long num){

        String str = Long.toString(num);
        
        for (int i=0; i<str.length()/2; i++){
         
         if (str.charAt(i) != str.charAt(str.length()-1-i))
              return false;
         
        }
        
        return true;
    }
    
    
    
    public static long R(long num){
 
        long rev = 0;
        
        while (num!=0){
            
 rev = rev*10 + num%10;
 num/=10;
            
        }
        
        return rev;
    }

           
           
    public static void main (String [] args) {
     
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for (int i=1;i<=n;i++){
         
            long num=sc.nextLong();
            int j=0;
            for (; !P(num);j++ ) {
                num = num + R(num);
            }
            
            System.out.println(j+" "+num);
        }
        
    }
}
 
        
        
                        
        