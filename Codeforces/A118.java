import java.util.*;
public class A118{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        while(sc.hasNext()){
        
       
        
        String st = sc.next().toLowerCase().replaceAll("[aeiouyAEIOUY]", "");
        String s[]=st.split("");
        for (int i=0;i<s.length;i++){
            System.out.print("."+s[i]);
        }
        System.out.println();
        }
    }
}