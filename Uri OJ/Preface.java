import java.util.*;
public class Preface{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=0, d=0,e=0,f=0,q=0,r=0;
        if(a<0)
    {
        e=b;
        if(b<0) e=b*-1;
        for(r=0; r<e; r++)
        {
            f=a-r;
            if(f%b==0) break;
        }
        q=f/b;
    }
    else
    {
        q=a/b;
        r=a%b;
    }

       
        System.out.print(q+" ");
        System.out.println(r);
       
        
    }
} 