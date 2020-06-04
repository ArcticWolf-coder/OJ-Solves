import java.util.*;public class SalaryIncrease
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 double a =sc.nextDouble();
 double p=0; double add,t;
 if (a>=0 && a<=400){
     p=.15;
 } else if(a>=400.01 && a<=800){
     p=.12;
 } else if (a>=800.01 && a<=1200){
     p=.1;
 } else if(a>=1200.01 && a<=2000){
     p=.07;
 } else if (a>2000){
     p=.04;
 }
 add=p*a;
 t=a+add;
 int per= (int) (p*100);
 System.out.printf("Novo salario: %.2f\n",t);
 System.out.printf("Reajuste ganho: %.2f\n",add);
 System.out.println("Em percentual: "+per+" %");
 
 
                          
     
 

    }
    }

 
 

    