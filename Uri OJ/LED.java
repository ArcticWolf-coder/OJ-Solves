import java.util.Scanner;
public class LED{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k=1;k<=t;k++){
        int n=sc.nextInt();
        String s="";
        s+=n;
        int sum=0;
        String a[]=s.split("");
        int b[]={6,2,5,5,4,5,6,3,7,6};
        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if (a[i].equals(Integer.toString(j))){
                    sum+=b[j];
                    break;
                }
            }
        }
        System.out.println(sum);
        }
                    
        
       
            
        
    }  

}