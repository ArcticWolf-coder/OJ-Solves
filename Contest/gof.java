import java.util.*;
public class gof {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        
        for (;;){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            String s=Integer.toString(n);
            
            for(;;){
                
                if(s.length()==1){
                    break;
                }
                n=0;
                for(int i=0;i<s.length();i++){
                    n+=Integer.parseInt(Character.toString(s.charAt(i)));
                }
                s=Integer.toString(n);
            }
            System.out.println(n);
        }
                    
                
        
       
                
        
    }
}
    