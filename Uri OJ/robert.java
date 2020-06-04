import java.util.*;
public class robert{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a[]=s.split("");
        String b=a[a.length-2]+a[a.length-1];
        String c=a[0]+a[1];
        
        
        
        if (b.equals("PM")){
            
        int d=Integer.parseInt(c)+12; 
        String e=Integer.toString(d);
            System.out.print(e);
        }else {
            int d=Integer.parseInt(c); 
        String e=Integer.toString(d);
        System.out.print(e);
        }
        
            
            
            
        for (int i=2;i<a.length-2;i++){
                System.out.print(a[i]);
        }
        System.out.println();
            
        
                
        
        
        
        
    }
}
