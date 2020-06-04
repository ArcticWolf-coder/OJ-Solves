import java.util.*;public class SimpleSort
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 int a =sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int [] array= {a,b,c};
 int []array0={a,b,c};
 for (int i=0;i<array.length;i++){
 int max=array[i];
 int pos=i;
 for (int j=i+1; j<array.length;j++){
     if (array[j]<max){
         max=array[j];
         pos=j;
     }
 }
 int temp= array[i];
 array[i]=max;
 array[pos]=temp;
 }
        for (int x:array){
            System.out.println(x);
        }
        System.out.println();
    for (int y:array0){
    System.out.println(y);
    }
    
    }
}
 
 

    