import java.util.*;

public class MinDist {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();

            long [] a=new long [num];
            for(int j=0;j<num;j++) {
                a[j]=sc.nextLong();

            }
            long []b=new long [num];
            for(int j=0;j<num;j++){
                for(int k=0;k<num;k++){
                    if(a[k]-a[j]<=1 && a[k]-a[j]>=0){
                        b[j]++;
                    } else {

                    }
                }
            }
            Arrays.sort(b);
            System.out.println(b[num-1]);













        }


    }
}