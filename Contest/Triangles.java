import java.util.*;

public class Triangles {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c=sc.nextInt();
            System.out.print("Case "+i+": ");
            if(a+b>c && a+c>b && b+c>a){
                if(a==b && b==c){
                    System.out.println("Equilateral");

                } else if(a==b || b==c || c==a){
                    System.out.println("Isosceles");
                } else {
                    System.out.println("Scalene");
                }

            } else {
                System.out.println("Invalid");

            }
        }










    }
}
