import java.util.*;public class GameTimeMin
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 int a =sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int d=sc.nextInt();
 int t;
 if(c<=a){
 t=(24+c)*60+d-a*60-b; 
 }else{
      t=c*60+d-a*60-b;}
 int h=t/60;
 int m=t%60;
 System.out.println("O JOGO DUROU "+h+" HORA(S) E "+m+" MINUTO(S)");
 
 
                          
     
 

    }
    }

 
 

    