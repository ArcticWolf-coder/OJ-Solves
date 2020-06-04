public class Tracing{
    public static void main(String []args){
    
   int [] marks = {10,30,20,50,40};
   int max=marks[0];
   int min=marks[0];
   int sum=marks[0];
   for (int count=1;count<marks.length;count++){
       if (marks[count]>max){
       max=marks[count];
       }
       if (marks[count]<min){
       min=marks[count];
       }
       sum+=marks[count];
   }
   double avg=sum/5.0;
   System.out.println("max is "+max);
   System.out.println("min is "+min);
   System.out.println("avg is "+avg);  }
}


