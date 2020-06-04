import java.util.*;
public class  PalNo{
   
    
    
        
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
       
        String s[]=sc.nextLine().split("");
        
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
        for(int i=s.length-1;i>=0;i--){
            System.out.print(s[i]);
        }
        System.out.println();
        
        
    }
}