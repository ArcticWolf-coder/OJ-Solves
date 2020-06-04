import java.util.*;
public class Flip {

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int max=-1;
        int count=0;
        int counter=0;

        for(int i=1;i<=n;i++){
            int num=sc.nextInt();
            if(num==1) {
                count++;
                if (counter > 0) {
                    counter--;
                }

            } else if(num==0){
                counter++;
                if(counter>max){
                    max=counter;
                }
            }

        }

        System.out.println(count+max);

    }

}

