import java.util.*;public class Easy
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);

int x;double num;
for (int i=1;i<=30;i++){
    
    int a=sc.nextInt();
    int b=sc.nextInt();
    int m=sc.nextInt();
    if(a==0 || b==0 || m==0){break;}
    else {
    
    num=Math.pow(a,b);
    x=(int)num%m;
    System.out.println(x);
    }
}

    


    }
}

 
 
                          
     
 

    
   

 
