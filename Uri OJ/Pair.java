import java.util.*;

public class Pair{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        for (int i=1;i<=t;i++){
            int n=sc.nextInt();
            int no=0;
            int [] a=new int [10];
            for (int j=1;j<=n;j++){
                int num=sc.nextInt();
                no++;
                for (int k=0;k<a.length;k++){
                    if (k==num){
                        a[k]++;
                    }
                }
            }
            for (int k=0;k<a.length;k++){
                if (a[k]>1){
                    no-=a[k]-1;
                }
            }
            if(no>1){int p1=1,p2=1;
            for (int k=1;k<=no;k++){
                p1*=k;
            }
            for (int k=1;k<=no-2;k++){
                p2*=k;
            }
            double pr=p1/(2.0*p2);
            System.out.println((int)pr);
            } else {
                System.out.println(1);
            }
        }
      
    }
}
