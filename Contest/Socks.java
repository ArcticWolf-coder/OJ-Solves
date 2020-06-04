import java.util.*;

public class Socks {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int s=0;
        int sum= 0;
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(;;){
            if(n>0 && m>0){
                n--;
                m--;
                s++;
            } else {
                break;
            }

        }
        if(m==0){
            sum+=n/2;
        } else if(n==0){
            sum+=m/2;
        }


        System.out.println(s+" "+sum);

    }
}