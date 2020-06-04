import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Height {



    public static void main(String[] args) throws IOException {

        Scanner sc=new Scanner(System.in);
        int b = sc.nextInt();
        int a=sc.nextInt();
        double c=((double)a/b*2.0);




        System.out.println((int)Math.ceil(c));

    }
}
