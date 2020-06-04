import java.util.*;
public class A4 {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        if (s%2==0 && s>2){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}