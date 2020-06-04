import java.util.*;public class Average3
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 double a=sc.nextDouble();
 double b=sc.nextDouble();
 double c=sc.nextDouble();
 double d=sc.nextDouble();
 double avg=(a+b+c+d)/4.0;
 
 if (avg>=7){
 System.out.printf("Media: %.1f\n",avg);
 System.out.println("Aluno aprovado.");}
 else if (avg<5){System.out.printf("Media: %.1f\n",avg);
     System.out.println("Aluno reprovado.");
 } else {
 System.out.printf("Media: %.1f\n",avg);
 System.out.println("Aluno em exame.");
 double e=sc.nextDouble();
  double n= (e+avg)/2.0;
 System.out.printf("Nota do exame: %.1f\n",e);
 if (n<5){
     
 System.out.println("Aluno reprovado.");
 
 }
 else {System.out.println("Aluno aprovado.");
 }
 System.out.printf("Media final: %.1f\n",n);}
 
 }
    }