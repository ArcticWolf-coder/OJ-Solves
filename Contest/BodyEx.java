import java.util.*;
public class BodyEx {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s[]={"chest","biceps","back"};
        int a[]={0,0,0};
        for (int i=1;i<=n;i++){
            int t=i%3;
            int num = sc.nextInt();
            if(t==0){
                a[2]+=num;

            } else {

                a[t - 1] += num;
            }
        }
        if(a[0]>a[1] && a[0]>a[2]){
            n=0;
        } else if(a[1]>a[0] && a[1]>a[2]){
            n=1;
        } else
            n=2;

        System.out.println(s[n]);
    }

}
