import java.util.*;
public class robertQ{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split("");
        String st=a[8]+a[9];
        int x=Integer.parseInt(a[0]+a[1]);
        if(st.equals("PM")){
            if(x==12){
             
            } else{
                x=x+12;
            }
            System.out.print(x);
        } else{
            if(x==12){
                System.out.print("00");
            } else if(x>9){
                System.out.print(x);
            } else{
                System.out.print("0"+x);
            }
        }
        for(int i=2;i<a.length-2;i++){
            System.out.print(a[i]);
        }
        System.out.println();
            
    }
}
        
            
        
                
        
        
        
        
        

