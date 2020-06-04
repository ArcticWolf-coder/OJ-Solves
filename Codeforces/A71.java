import java.util.*;
public class A71{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            String s=sc.next();
            String st[]=s.split("");
            if (st.length <=10){
                System.out.println(s);
            } else{
                
                System.out.println(st[0]+(st.length-2)+st[st.length-1]);
            }
        }
    }
}
