import java.util.*;
public class ass{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of decimal places (>0):");
        int plc= sc.nextInt();
        System.out.println("Enter the first fraction.");
        System.out.println("Enter the numerator as an integer:");
        
        int num=sc.nextInt();
        int den=0;   
        for (;;){
            System.out.println("Enter the denominator as an integer:");
            
             den=sc.nextInt();
            if (den!=0){
                
                
                break;
            }
            System.out.println("The denominator cannot be zero!");
        }
        double f=num/(double)den;
        String form="%."+plc+"f\n";
        System.out.printf(form,f);
        System.out.println();
        for (;;){
            
            num=sc.nextInt();
           if (num!=0){
               break;
           }
        }
        for (;;){
             den=sc.nextInt();
            if (den!=0){
                break;
            }
        }
        double s=num/(double)den;
        System.out.printf(form,s);
        System.out.println();
        double p=f*s;
        System.out.printf(form,p);
        
    }
}
        
        