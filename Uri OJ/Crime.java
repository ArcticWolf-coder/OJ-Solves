import java.util.Scanner;
public class Crime
{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int sum=0; int no=0;
int n=sc.nextInt();
for (int i=1;i<=n;i++){
    int num=sc.nextInt();
    sum+=num;
    if(sum<0){
        no++;
        sum++;
    }
}
System.out.println(no);

        
    
    


                




    }
}