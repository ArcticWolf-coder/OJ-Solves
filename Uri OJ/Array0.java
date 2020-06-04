import java.util.Scanner;
public class Array0{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int [] par=new int [5];
        int [] impar=new int [5];
        int a=0,b=0,c=0,d=0;

        for (int i=1;i<=15;i++){
            
            int n=sc.nextInt();
            if (n%2==0){
                if(a>=5){
                    if(a==5){
                    for (int j=0;j<par.length;j++){
                        System.out.println("par["+j+"] = "+par[j]);
                    }
                    a++;
                    }
                    
                        par[c]=n;
                        
                        c++;
                    }
            
                 else {
                par[a]=n;
                a++;
                 }
            }
             else {
                if(b>=5){
                    if(b==5){
                
                    for (int j=0;j<par.length;j++){
                        System.out.println("impar["+j+"] = "+impar[j]);
                    }
                    b++;
                    }
                    impar[d]=n;
                    
                    d++;
                }
                    
                else{ 
                impar[b]=n;
                b++;
            }
        }
    }
        for (int i=0;i<d;i++){
            System.out.println("impar["+i+"] = "+impar[i]);
        }
        for (int i=0;i<c;i++){
            System.out.println("par["+i+"] = "+par[i]);
        }
        
}
}