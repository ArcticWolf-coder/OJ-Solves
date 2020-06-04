import java.util.Scanner;
public class Fib{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=0;
        int b=1;
        if (x==1){
            System.out.print(a);
        } else if (x>1){
            System.out.print(a+" "+b);
            if (x==2){
            } else {
                System.out.print(" ");
            }
        for (int i=3;i<=x;i++){
            int c=a+b;
            System.out.print(c);
            if(!(i==x)){
                System.out.print(" ");
                    
                a=b;
                b=c;
            }
        }
        }
        System.out.println();
            
                
    }

}
   