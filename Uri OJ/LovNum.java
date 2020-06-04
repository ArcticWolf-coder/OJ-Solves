import java.util.Scanner;
public class LovNum
   
{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for (int i=1;i<=num;i++){
    int n=sc.nextInt();
    
    for (int j=n-1;j>=0;j--){
        if ((int)(n^j)==n+j){
            System.out.print(j+" ");
            break;
        }
    }
    for (int j=n+1;;j++){
        if ((int)(n^j)==n+j){
            System.out.print(j);
            break;
        }
    }
    System.out.println();
}
        


}
}
