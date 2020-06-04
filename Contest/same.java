import java.util.*;
public class same {
    public static void main (String [] args) {
        Scanner sc=new Scanner(System.in);
        for(int k=1;sc.hasNext();k++){
            char[] s=sc.next().toCharArray();
           
            
            
            int n=sc.nextInt();
            System.out.println("Case "+k+":");
            for (int i=1;i<=n;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                sc.nextLine();
                if(a>b){
                    int temp=a;
                    a=b;
                    b=temp;
                }
                
                String flag="Yes";
                for(int j=a+1;j<=b;j++){
                    if (s[j]!=s[a]){
                        flag="No";
                        break;
                    }
                }
                System.out.println(flag);
            }
        }
                        
                    
    }
}
    