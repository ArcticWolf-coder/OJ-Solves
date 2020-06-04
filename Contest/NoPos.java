import java.util.*;

public class NoPos {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum=0;
        for(int i=b+1;i<=a;i++){
            if(a-i<=c){
                sum++;
            }
        }


        System.out.println(sum);


    }
}