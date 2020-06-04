import java.util.*;
public class Card {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        for (int j=1;j<=num;j++){
            String s=sc.nextLine();
            s=s.replaceAll(" ","");
            String [] st=s.split("");
            String odd="";
            String even="";
            for (int i=0;i<st.length;i+=2){
                int n=Integer.parseInt(st[i]);
                n*=2;
                even+=n;
            }
            for (int i=1;i<st.length;i+=2){
                
                odd+=st[i];
            }
            int x=0;
            int y=0;
            String [] a=even.split("");
            String [] b=odd.split("");
            for (int i=0;i<a.length;i++){
                x+=Integer.parseInt(a[i]);
            } 
            for (int i=0;i<b.length;i++){
                y+=Integer.parseInt(b[i]);
            }
            if((x+y)%10==0){
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
                
            
            
      
        
 
    }
}
    