import java.util.*;
public class URI {

    public static  void main(String[] args){

        int N, lineNo;

        float sum = 0, avg = 0;

        Scanner sc = new Scanner(System.in);

        float M[][] = new float[12][12];

        String option ;

        lineNo = sc.nextInt();

        option = sc.next();

        //take input in the array

        for (int i = 0; i < 12; i++) {

            for (int j = 0; j < 12; j++) {

                M[i][j] = sc.nextFloat();

            }

        }

        

        //logic for summation or average

        //Now find the line No which we've just scanned



            for (int j = 0; j < 12; j++) {

                sum +=  M[lineNo][j];

            }

        

        avg = sum / 12;

        if(option.equals("S")){

            System.out.printf("%.1f\n", sum);

        }else if(option.equals("M")){

            System.out.printf("%.1f\n", avg);

        }



    }



}
