import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class HelpLostRobot {



    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader c = new BufferedReader(r);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            if(x2==x1 || y1==y2) {

                if (x2 < x1 ) {
                    System.out.println("left");
                } else if(x2>x1){
                    System.out.println("right");
                } else if (y2 > y1) {
                    System.out.println("up");
                } else if ( y2 < y1) {
                    System.out.println("down");
                }
            } else {
                System.out.println("sad");
            }
        }




    }
}
