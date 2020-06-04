import java.util.*;
public class ass0{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        for (;;){
            System.out.println("Enter the number of intervals (0 to quit):");
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            for (;;){
                System.out.println("Enter the length of the X semi-axis in cm (> 0):");
                double x=sc.nextDouble();
                if(x<=0){
                    System.out.println("The length of the X semi-axis, 0, must be greater than zero!");
                    break;
                }
                System.out.println("Enter the length of the Y semi-axis in cm (> 0):");
                double y=sc.nextDouble();
                if(y<=0){
                    System.out.println("The length of the Y semi-axis, 0, must be greater than zero!");
                    break;
                }
                System.out.println("Enter the length of the Y semi-axis in cm (> 0):");
                double z=sc.nextDouble();
                if(z<=0){
                    System.out.println("The length of the Z semi-axis, 0, must be greater than zero!");
                    break;
                }
                double v=(4/3.0)*(Math.PI)*x*y*z;
                System.out.println("The approximate volume of the ellipsoid is "+v);
            }
        }
    }
}
            
                