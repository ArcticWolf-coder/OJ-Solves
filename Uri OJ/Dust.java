import java.util.Scanner;
public class Dust
{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();

for (int i=1;i<=T;i++){
    int n=sc.nextInt();
    int a[]=new int [n];
    int sum=0;
    for (int j=0;j<a.length;j++){
        a[j]=sc.nextInt();
        if (a[j]>0){
            sum+=a[j];
        }
    }
    System.out.println("Case "+i+": "+sum);
    
}

               
        

        
    
    


                




    }
}

