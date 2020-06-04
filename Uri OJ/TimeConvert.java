import java.util.*;public class TimeConvert
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 
  int n=sc.nextInt();
       int hr=n/3600;
       n%=3600;
       int min=n/60;
       n%=60;
       int sec=n;
       System.out.println(hr+" : "+min+" : "+sec);
    }}