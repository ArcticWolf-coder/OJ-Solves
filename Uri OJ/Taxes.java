import java.util.*;
public class Taxes{
    
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);

double a=sc.nextDouble();
double tax=0;
if(a>=0 && a<=2000){
    System.out.println("Isento");
} else if (a>=2000.01 && a<=3000){
    tax=(a-2000)*0.08;
    System.out.printf("R$ %.2f\n",tax);
} else if (a>=3000.01 && a<=4500){
    tax=80+(a-3000)*0.18;
    System.out.printf("R$ %.2f\n",tax);
} else if (a>4500){
    tax=80 + 270+ (a-4500)*0.28;
    System.out.printf("R$ %.2f\n",tax);
}
    }
}





 
 
                          
     
 

    
   

 