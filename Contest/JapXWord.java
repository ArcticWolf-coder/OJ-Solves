import java.util.*;

public class JapXWord {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []a =new int[n];
        String s=sc.next();
        int sum=0;
        int t=0;
        b:for(int i=0;i<s.length();i++){
            if (s.charAt(i) == 'B') {
                sum++;
                int num=1;
                int j=i+1;
                for(;j<s.length();j++){
                    if (s.charAt(j) == 'B') num++;
                    else {

                        break;
                    }
                }
                i=j;
                a[t]=num;
                t++;


            }
        }
        System.out.println(sum);
        for(int i=0;i<t;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();


    }
}