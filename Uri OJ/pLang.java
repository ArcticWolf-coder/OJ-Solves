import java.util.Scanner;
public class pLang
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int x=0;
int T=sc.nextInt();
sc.nextLine();
for (int i=1;i<=T;i++){
    String st=sc.nextLine();
    String str[]=st.split("X");
    for (int j=0;j<str.length;j++){
    if (str[j].equals("++")){
        x++;
    } else if ( str[j].equals("--")){
        x--;
    }
    }
}
    System.out.println(x);
    


    }
}