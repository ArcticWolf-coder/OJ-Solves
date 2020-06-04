import java.util.*;

import static java.lang.System.*;
public class GameTheory {
    public static void main(String[]args) {
        Random rand= new Random();
        Scanner sc= new Scanner(System.in);
        int n= rand.nextInt(100);
        out.println(n);
        int start=0,end=100;
        while(true){
            int num= start  + (end-start)/2 ;
            if(num>n){
                end=num;
            } else if( num<n){
                start=num;
            } else { out.println(num+" is the number"); break;
            }
        }
    }
}
           
        