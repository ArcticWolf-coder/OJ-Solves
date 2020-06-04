import java.util.*;
public class Beat {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);

        long x=sc.nextLong();
        long y=sc.nextLong();
        long sum=0;
        long max=0;

        for(int i=1;i<=y;i++){
            String a=sc.next();

            boolean b=false;
            if(a.contains("0")) {
                    b=true;



            }
            if(b){
                sum++;

            } else {

                    if(sum>max){
                        max=sum;
                    }

                sum=0;
            }


        }
        if(sum>max){
            max=sum;
        }
        System.out.println(max);


    }

}