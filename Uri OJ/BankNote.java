import java.util.*;public class BankNote
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 
  double num=sc.nextDouble();
        System.out.println("NOTAS:");
        num=num*100;
        int n=(int)num;
  int hund=n/10000;
  n=n%10000;
  System.out.println(hund+" nota(s) de R$ 100.00");
  int fif=n/5000;
  n=n%5000;
   System.out.println(fif+" nota(s) de R$ 50.00");
  int twe=n/2000;
  n=n%2000;
                       System.out.println(twe+" nota(s) de R$ 20.00");
  int ten=n/1000;
  n=n%1000;
                                           System.out.println(ten+" nota(s) de R$ 10.00");
  int fiv=n/500;
  n=n%500;
                                                               System.out.println(fiv+" nota(s) de R$ 5.00");
  int two=n/200;
  n=n%200;
        System.out.println(two+" nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
  int one=n/100;
                                                                                                       System.out.println(one+" moeda(s) de R$ 1.00");
                                                                                                     n%=100;
                                                                                                     
                                                                                                     int p50=n/50;
                                                                                                     System.out.println(p50+" moeda(s) de R$ 0.50");
                                                                                                     n%=50;
                                                                                                     int p25=n/25;
                                                                                                     System.out.println(p25+" moeda(s) de R$ 0.25");
                                                                                                     n%=25;
                                                                                                     int p10=n/10;
                                                                                                     System.out.println(p10+" moeda(s) de R$ 0.10");
                                                                                                     n%=10;
                                                                                                     int p5=n/05;
System.out.println(p5+" moeda(s) de R$ 0.05");
n%=05;
int p1=n/01;
System.out.println(p1+" moeda(s) de R$ 0.01");
    }}