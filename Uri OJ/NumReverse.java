import java.util.Scanner;public class NumReverse
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);

int T=sc.nextInt();
for (int i=1;i<=T;i++){
    String sum="";
    int n=sc.nextInt();
   
    String st[]=Integer.toString(n).split("");
    int s=0;
    for (int j=st.length-1;j>=0;j--){
        sum+=st[j];
        s=Integer.parseInt(sum);
    }
    System.out.println(s);
    
    
    
}



    }
}


 
 