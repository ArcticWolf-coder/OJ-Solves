import java.util.Scanner;
public class welfare
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int n=sc.nextInt();
int a[]= new int [n];
for (int i=0;i<a.length;i++){
    a[i]=sc.nextInt();
}
int max=a[0];
for (int j=1;j<a.length;j++){
    if (a[j]>max){
        max=a[j];
    }
}
int sum =0;
for (int i=0;i<a.length;i++){
    sum+= max-a[i];
}
System.out.println(sum);
    


                




    }
}
