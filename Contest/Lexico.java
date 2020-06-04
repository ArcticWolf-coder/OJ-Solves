import java.util.*;
public class Lexico {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next().toLowerCase();
        String b=sc.next().toLowerCase();
        int n=a.compareTo(b);
        if(n<0){
            System.out.println(-1);
        } else if(n>0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }







    }

}