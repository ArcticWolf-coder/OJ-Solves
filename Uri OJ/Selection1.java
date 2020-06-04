import java.util.*;public class Selection1
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int d=sc.nextInt();
 //if B is greater than C and D is greater than A and if the sum of C and D is greater than the sum of A and B and if C and D were positives values and if A is even
 if((b>c&&d>a)&&((c+d)>(a+b))&&(c>0&&d>0)&&(a%2==0)){
 System.out.println("Valores aceitos");
 }          else{
 System.out.println("Valores nao aceitos");
 }
    }}