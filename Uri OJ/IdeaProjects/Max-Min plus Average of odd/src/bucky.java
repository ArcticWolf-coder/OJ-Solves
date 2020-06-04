import com.sun.org.apache.xpath.internal.Arg;
        import java.util.Scanner;
public class bucky {
    public static void main(String[]args){
        System.out.println("Enter a number");
        Scanner tuna= new Scanner(System.in);
        int num= tuna.nextInt();
        int Count=1;
        int SmallSoFar= num;
        int BigSoFar=num;
        int Total;
        double no=0;
        if(num%2!=0){Total=num ;
        no++;}else{Total=0;}
         while (Count<=7){
            System.out.println("Please enter another number");
            num=tuna.nextInt();
            if(num>BigSoFar){BigSoFar=num;}
            else{}
            if (num<SmallSoFar){SmallSoFar=num;}
            else{ }
            if (num%2!=0){Total=Total+num;
            no++;}
            else{}
            Count++;}
            double Average= Total/no;
        System.out.println("Average of odd is "+Average);
        System.out.println("Minimum is "+SmallSoFar);
        System.out.println("Maximum is "+BigSoFar) ;


         }


    }
