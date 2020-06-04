import java.util.Scanner;
public class WalkDist
{
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int T=sc.nextInt();

for (int i=1;i<=T;i++){
    int n=sc.nextInt();
    int [] a=new int[n];
    for (int j=0;j<a.length;j++){
        a[j]=sc.nextInt();
    }
    for (int k=0;k<a.length;k++){
    int max=a[k];
    int pos=k;
    
    for (int j=k+1;j<a.length;j++){
        if (a[j]<max){
            max=a[j];
            pos=j;
        } 
        
    }
    int temp=a[k];
    a[k]=max;
    a[pos]=temp;
    }
    
    double avg=(a[0]+a[a.length-1])/2.0;
    double sum=(avg-a[0]);
    for (int l=1;l<a.length;l++){
        sum+=a[l]-a[l-1];
    }
sum+=(avg-a[0]);
        
 System.out.println((int)sum);
}

    }
}