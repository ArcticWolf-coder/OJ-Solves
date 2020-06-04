import java.util.*;
public class SportsTime {
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int [n];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int i=1;
        x: for (int count=0;i<=90;i++){
            if(count==15){
                i--;
                break;
            }
            for (int j=0;j<a.length;j++){
                if(a[j]==i){
                    count=0;
                    continue x;
                }
            }
            count ++;

        }
        if(i>90){
            i=90;
        }

        System.out.println(i);



    }

}