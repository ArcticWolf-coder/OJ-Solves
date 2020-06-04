import java.util.*;public class StarLab
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int a=sc.nextInt();


for (int i=1;i<=a;i++){
    for (int j=1; j<=a-i;j++){
        System.out.print(" ");
    }
   
    if (i==1||i==a){
        for (int k=1; k<=i;k++){
            System.out.print(k);
        }
        for (int k=i-1;k>=1;k--){
            System.out.print(k);
        }
    } else {
         for (int k=1; k<=i;k++){
             if(k==1 ){
            System.out.print(k);
             } else {
                 System.out.print(" ");
             }
        }
        for (int k=i-1;k>=1;k--){
            if (k==1){
                System.out.print(k);
            } else {
                System.out.print(" ");
            }
        }
    }
    System.out.println();
}
    
    

                   
    
    
    
    






    }
}
    
       

    
    
