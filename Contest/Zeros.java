import java.util.*;

public class Zeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        String s=Integer.toString(sum);
        s=s.replaceAll("0","");
        sum=Integer.parseInt(s);
        String x=Integer.toString(a);
        String y=Integer.toString(b);
        x=x.replaceAll("0","");
        y=y.replaceAll("0","");
        a=Integer.parseInt(x);
        b=Integer.parseInt(y);
        if(a+b==sum){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }




    }
}
