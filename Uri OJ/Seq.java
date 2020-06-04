import java.util.Scanner;
public class Seq{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        for (int i=1;;){
            int x=sc.nextInt();
            if(x==0){
                break;
            }
            for (int j=1;j<=x;j++){
                System.out.print(i);
                i++;
                if(!(j==x)){
                    System.out.print(" ");
                }  
            }
            System.out.println();
            i=1;
            
        }
 
   
    }

}