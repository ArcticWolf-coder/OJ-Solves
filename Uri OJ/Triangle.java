import java.util.*;public class Triangle
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 double a =sc.nextDouble();
 double b=sc.nextDouble();
 double c=sc.nextDouble();
 double num;
 if ((a+b)<=c|| (b+c)<=a|| (c+a)<=b){
     num= (a+b)/2*c;
     System.out.printf("Area = %.1f\n",num);
 } else{
     num=a+b+c;
     System.out.printf("Perimetro = %.1f\n",num);
 }
     
    
    }
}
 
 

    