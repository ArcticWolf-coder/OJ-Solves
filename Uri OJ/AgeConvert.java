import java.util.*;public class AgeConvert
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 
  int n=sc.nextInt();
       int yr=n/365;
       n%=365;
       int mnth=n/30;
       n%=30;
       int day=n;
       System.out.println(yr+" ano(s)");
        System.out.println(mnth+" mes(es)");
        System.out.println(day+" dia(s)");
    }}