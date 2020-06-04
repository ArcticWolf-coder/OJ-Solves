import java.util.*;

public class Reverses {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String x=Integer.toString(a);
            String y=Integer.toString(b);
            String m="";
            String o="";
            for(int j=x.length()-1;j>=0;j--){
                m+=x.charAt(j);
            }
            for(int j=y.length()-1;j>=0;j--){
                o+=y.charAt(j);
            }
            a=Integer.parseInt(m);
            b=Integer.parseInt(o);
            a=a+b;
            x=Integer.toString(a);
            m="";
            for(int j=x.length()-1;j>=0;j--){
                m+=x.charAt(j);
            }
            b=Integer.parseInt(m);
            System.out.println(b);


        }


    }
}
