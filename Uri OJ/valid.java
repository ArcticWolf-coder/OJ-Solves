import java.util.*;
public class valid{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number");
        String n= sc.nextLine();
        if (n.startsWith("01") && n.length()==11){
            System.out.println("it is valid");
        } else {
            System.out.println("it is invalid");
        }
        System.out.println("Enter email");
        String e=sc.nextLine();
        if (e.endsWith(".com") && e.contains("@")){
             System.out.println("it is valid");
        } else {
            System.out.println("it is invalid");
        }
    }
}
            
        
        