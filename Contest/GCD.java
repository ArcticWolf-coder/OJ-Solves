import java.util.*;

public class GCD {
    public static int P(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;

        c:for(int i=start;i<=end;i++){

            for(int j=i+1;j<=end;j++){
                if(P(i,j)==1){
                    sum++;

                    if(sum==1){
                        System.out.println("YES");
                    }
                    System.out.println(i+" "+j);
                    if(sum==(end-start+1)/2){
                        break c;
                    }
                }
            }
        }
        if(sum==0){
            System.out.println("NO");
        }



    }
}