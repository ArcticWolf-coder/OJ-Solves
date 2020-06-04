import java.util.Scanner;
public class ExZ{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int z;
        for (;;){
            z=sc.nextInt();
            if(z>x){
                break;
            }
        }
        int n=0,sum=0;
        for (int i=x;;i++){
            sum+=i;
            n++;
            if(sum>z){
                break;
            }
        }
        System.out.println(n);
                
    }

}
     