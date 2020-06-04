import java.util.Scanner;
public class Problem1{
public static void main(String args[]) {
 
  Scanner sc = new Scanner(System.in);
  
  while(sc.hasNextInt()) {
  int  n = sc.nextInt();
  int  j = sc.nextInt();
  System.out.print(n+" "+j+" ");
  
  int i,k,max=-9999999;
  int c;
 
   for(i=n;i<=j;i++) {
     c=1;
     k=i;
     
    while(k!=1) {
   
  if(k%2!=0) {k=3*k+1;c+=1;}
   else {k=k/2;c+=1;}
   
      }
      if(c>max) {max=c;}
  
    }
    System.out.println(max);
  }
 
  } 
}