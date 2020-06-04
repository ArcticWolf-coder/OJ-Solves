import java.util.*;
public class star{
    public static void main (String [] args){
        Scanner sc=new Scanner (System.in);
        int b=sc.nextInt();
        String st=Integer.toString(b);
        String [] a=st.split("");
        String [] c={"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i=0;i<a.length;i++){
            int num=Integer.parseInt(a[i]);
            for (int j=0;j<c.length;j++){
              if (num==j){
                System.out.println(c[j]);
              }
            }
        }
    }
}