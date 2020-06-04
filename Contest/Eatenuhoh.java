import java.util.*;
public class Eatenuhoh {
    public static boolean P(String str){

        
        
        for (int i=0; i<str.length()/2; i++){
         
         if (str.charAt(i) != str.charAt(str.length()-1-i))
              return false;
         
        }
        
        return true;
    }
    
    
    
        
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        for(;;){
        String q=sc.nextLine();
        if(q.equals("DONE")){
            break;
        }
        
        
       
        String z=q.replaceAll("[^a-zA-Z ]", "").toLowerCase().replaceAll(" ","");
        
        
        
        
        
        if(P(z)){
            System.out.println("You won't be eaten!");
        } else {
            System.out.println("Uh oh..");
        }
        
        }
    }
}
                
                
                
                
                
                
            
        
        
        
                        
        