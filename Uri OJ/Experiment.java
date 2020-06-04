import java.util.Scanner;public class Experiment
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int n; n=sc.nextInt(); int num; String st;
int sum=0; float c0=0,r0=0,s0=0; int c=0, r=0, s=0;
for (int i=1;i<=n;i++){
    num=sc.nextInt();
   
    sum+=num;
    st=sc.next();
    if (st.equals("C")){
        c+=num;
    } else if (st.equals("R")){
        r+=num;
    } else if (st.equals("S")){
        s+=num;
    }
     c0=(float)(c*100.00/sum);
 r0=(float)(r*100.00/sum);
 s0=(float)(s*100.00/sum);
}
System.out.println("Total: "+sum+" cobaias");
System.out.println("Total de coelhos: "+c);
System.out.println("Total de ratos: "+r);                     
System.out.println("Total de sapos: "+s);
 
System.out.printf("Percentual de coelhos: %.2f",c0);
System.out.println(" %");
System.out.printf("Percentual de ratos: %.2f",r0);
System.out.println(" %");                  
System.out.printf("Percentual de sapos: %.2f",s0);
System.out.println(" %");
  


    }
}
