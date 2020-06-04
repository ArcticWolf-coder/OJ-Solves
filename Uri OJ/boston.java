import java.util.*;
public class boston{
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1){
        System.out.println("1:1");
    } else{
    for (int i=1;i<=n;i++){
        
        int sum=0;
        System.out.print("(");
        
        for(int j=1;j<=i;j++){
            System.out.print(j);
            sum+=j;
            if(j==i){
                break;
            }
            System.out.print("+");
        }
        System.out.print(")");
        System.out.print(":"+sum);
        System.out.println();
        
    }
    }
    }
}
                            