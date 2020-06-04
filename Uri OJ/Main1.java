import java.util.*;

public class Main1{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0 ; i<n ; ++i){
            int type = sc.nextInt();
            int size = sc.nextInt();
            if(type==1){
                a[i]=size;
            }else if(type==2){
                for(int j=0 ; j<=i ; ++j){
                    if(size==a[j]){
                        System.out.println(size);
                        break;
                    }else if(j==i){
                        System.out.println("Sorry");
                    }
                }
            }
        }
    }
}