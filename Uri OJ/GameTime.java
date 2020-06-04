import java.util.*;public class GameTime
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 int a =sc.nextInt();
 int b=sc.nextInt();
 int t;
 
 if (b>a) {
     t=b-a;
     System.out.println("O JOGO DUROU "+t+" HORA(S)");
 } else {
     t = 24+b-a;
     System.out.println("O JOGO DUROU "+t+" HORA(S)");
 }
                          
     
 

    
    }
}
 
 

    