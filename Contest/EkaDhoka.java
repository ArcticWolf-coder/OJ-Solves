import java.util.*;


public class EkaDhoka {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++){


            long n=sc.nextLong();
            System.out.print("Case "+i+": ");
            if(n%2!=0)
                System.out.println("Impossible");
            else {
                int a = 1;
                for(;n%2==0;) {
                    a*=2;
                    n/=2;

                }
                System.out.println(n+" "+a);



            }







        }
    }
}