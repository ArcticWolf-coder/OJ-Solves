import java.util.Scanner;
public class DiagArr{

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        double sum=0;
        int no=0;
        double a[][]=new double [12][12];
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextDouble();
            }
        }
        for (int i=0;i<a.length;i++){
            for (int j=a.length-1;j>a.length-1-i;j--){
                sum+=a[i][j];
                no++;
            }
        }
        if (s.equals("S")){
            System.out.printf("%.1f\n",sum);
        } else if (s.equals("M")){
            System.out.printf("%.1f\n",sum/no);
        }
        
            
        
    }  

}