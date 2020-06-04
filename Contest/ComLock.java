import java.util.*;

public class ComLock {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int sum=0;
        int n=sc.nextInt();
        String a=sc.next();
        String b=sc.next();
        for(int i=0;i<n;i++){
            int m=a.charAt(i) -b.charAt(i);
            m=Math.abs(m);
            if(m>5){
                sum+=10-m;
            } else {
                sum+=m;
            }
        }


        System.out.println(sum);


    }
}