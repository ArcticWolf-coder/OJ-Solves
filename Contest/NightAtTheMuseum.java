import java.util.*;


public class NightAtTheMuseum {



    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int sum=0;
        int b=1;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-96;
            if(a>b){
                if(a-b>26-a+b){
                    sum+=26-a+b;
                } else {
                    sum+=a-b;
                }
            } else {
                if(b-a>26-b+a){
                    sum+=26-b+a;
                } else {
                    sum+=b-a;
                }

            }
            b=a;



        }
        System.out.println(sum);








    }
}