import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class TimeConversion {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String a="";
        String b="";
        b+=s.charAt(0);
        b+=s.charAt(1);
        a+=s.charAt(8);
        a+=s.charAt(9);
        if(a.equals("PM")){
            if((b).equals("12")){
                a=b;
            }else{


                int c=(Integer.parseInt(b)+12);
                a= Integer.toString(c) ;
            }
        } else {
            if((b).equals("12")){
                a="00";
            } else if(s.charAt(0)=='1'){
                a=b;
            } else {
                a="0";
                a+=s.charAt(1);
            }
        }
        for(int i=2;i<=7;i++){
            a+=s.charAt(i);
        }
        return a;




    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();

        String result = timeConversion(s);

        System.out.println(result);

    }
}
