import java.util.Scanner;
public class Fuel{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int a=0,g=0,d=0;
        outer : for (;;){
            int num=sc.nextInt();
            switch(num){
                case 1: a++; break;
                case 2: g++; break;
                case 3: d++; break;
                case 4: break outer;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+a);
        System.out.println("Gasolina: "+g);
        System.out.println("Diesel: "+d);
     
 
   
    }

}