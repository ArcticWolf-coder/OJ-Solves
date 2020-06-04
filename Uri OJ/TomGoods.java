import java.util.*;public class TomGoods
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int n=sc.nextInt();
int a=0;int no=0;
for (int i=1; i<=n;i++){
    int t=sc.nextInt();
    if (t==1){a=sc.nextInt();
        if (a<1 || a>50){
        no++;}}
    else if (t==2){a=sc.nextInt();if (a<1 || a>50){
        no++;}else{
            System.out.println(a);}}}
if(no==n){System.out.println("Sorry");}
    
        




    


    }
}



