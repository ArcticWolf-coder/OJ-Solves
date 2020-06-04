import java.util.Scanner;public class ChangeColor
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int n=0;
int T=sc.nextInt();
sc.nextLine();
String st=sc.nextLine();
String a[]=st.split("");
String x=a[0];
for (int i=1;i<a.length;i++){
    if (a[i].equals(x)){
        n++;
    } else {
        x=a[i];
    }
}


System.out.println(n);
  
    
    




    }
}
