import java.util.*;

public class WorkHour {
    public static int b[]=new int [101];
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            int sum=sc.nextInt();
            sum*=60;
            int a=0;
            for(int j=1;j<=num;j++) {
                String s = sc.next();
                String e = sc.next();
                a+= (10*(e.charAt(3)-48)+(e.charAt(4)-48)-10*(s.charAt(3)-48)-(s.charAt(4)-48))+60*(10*(e.charAt(0)-48)+(e.charAt(1)-48)-10*(s.charAt(0)-48) - (s.charAt(1)-48));


            }
            if(a>=sum){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }







        }


    }
}