import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Alphabet{





    public static void main(String[] args) throws IOException {

        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader f = new BufferedReader(r);

        Scanner sc=new Scanner(System.in);
        
        String s=sc.nextLine();
        s=s.toLowerCase();
        String sum="";
        String [] a=s.split("");
        String [] b={"@","8","(","|)","3","#","6","[-]","|","_|","|<","1","[]\\/[]","[]\\[]","0","|D","(,)","|Z","$","']['","|_|","\\/","\\/\\/","}{","`/","2"};
        for(int i=0;i<a.length;i++){
            String c[]=a[i].split("");
            for(int j=0;j<a[i].length();j++) {
                
                if (Character.isLetter(a[i].charAt(j))) {
                    sum += b[(int) a[i].charAt(j) - 97];
                } else {
                    sum += c[j];
                    }
            }

        }
        System.out.println(sum);
    }
}
