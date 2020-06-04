import java.util.*;
public class Main{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        sc.nextLine();
       
        for (int i=1;i<=n;i++){
            String s=sc.nextLine();
            if(s.length()==5){
                System.out.println(3);
            } else if((s.charAt(0)=='t' && s.charAt(1)=='w') || (s.charAt(0)=='t' && s.charAt(2)=='o') || (s.charAt(1)=='w' && s.charAt(2)=='o')){
                System.out.println(2);
            } else {
                System.out.println(1);
            }
        }
                
        
    }
}
    