import java.util.*;public class NumberType
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
int [] a=new int[15];
for (int i=0; i<a.length;i++){
    a[i]=sc.nextInt();
}
int[] b=new int [10];
for (int j=0; j<b.length;j++){
    for (int k=0; k<a.length; k++){
        if (a[k]==j){
        b[j]++;
        }
        
    }
}
for (int l=0; l<b.length; l++){
    System.out.println(l+" has been typed "+b[l]+" time(s)");
}
    


    }
}
