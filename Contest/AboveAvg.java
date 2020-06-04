import java.util.*;

public class AboveAvg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int num=sc.nextInt();
            int []a=new int [num];
            double sum=0.0;
            for(int j=0;j<a.length;j++){
                a[j]=sc.nextInt();
                sum+=a[j];
            }
            sum=sum/num;
            num=0;
            for(int j=0;j<a.length;j++){
               if(a[j]>sum){
                   num++;
               }
            }
            sum=(double)num/a.length*100;
            System.out.printf("%.3f",sum);
            System.out.println("%");


        }










    }
}
