import java.util.Scanner;
public class PopInc{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        for (int i=1;i<=t;i++){
            int pa=sc.nextInt();
            int pb=sc.nextInt();
            double g1=sc.nextDouble();
            double g2=sc.nextDouble();
            int time=0;
            
            for (;;){
                if(time>100){
                    break;
                }
                time++;
                pa=(int)(pa+pa*g1/100.0);
                pb=(int)(pb+pb*g2/100.0);
                if(pa>pb){
                    break;
                }
            }
        
        if(time>100){
            System.out.println("Mais de 1 seculo.");
        } else{
            System.out.println(time+" anos.");
        }
        }
        
                
                
        
        
                
    }

}