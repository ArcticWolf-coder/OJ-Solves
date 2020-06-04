import java.util.*;
public class huff{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] a=s.split("");
        String [] b={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String [] c={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int []d=new int[26];
        for (int i=0;i<a.length;i++){
            for(int j=0;j<d.length;j++){
                if(a[i].equals(b[j]) || a[i].equals(c[j])){
                    d[j]++;
                }
            }
        }
        int no=0;
        out:for (int i=0;i<d.length;i++){
            if(d[i]==0){
                continue out;
            }
            System.out.println(b[i]+" : "+d[i]);
            no++;
        }
        String [] e=new String [no];
        int []f=new int [no];
        for (int i=0,j=0;i<d.length;i++){
            if(d[i]!=0){
                e[j]=b[i];
                f[j]=d[i];
                j++;
            }
        }
        for (int i=0;i<e.length;i++){
            int max=f[i];
            int pos=i;
            
            for (int j=i+1;j<e.length;j++){
                if(f[j]>max){
                    max=f[j];
                    
                    pos=j;
                }
            }
            int temp=f[i];
            String tem=e[i];
            e[i]=e[pos];
            e[pos]=tem;
            f[pos]=temp;
        }
            
            
        for (String x:e){
            System.out.print(x);
        }
        System.out.println();
        String g[]=new String[e.length];
        
  
      
            
            
    }
}