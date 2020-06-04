import java.util.Scanner;
public class calc
{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();

for (int i=1;i<=T;i++){
    int n=sc.nextInt();
    int total=(((7492+((n*567)/9))*235)/47)-498;
    String st=Integer.toString(total);
    String [] str=st.split("");
    int num=Integer.parseInt(str[str.length-2]);
    System.out.println(num);
    
}
    }
}
