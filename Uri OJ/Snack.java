import java.util.*;public class Snack
{
    public static void main(String[] args) {
Scanner sc=new Scanner( System.in);
 int a=sc.nextInt();
 int b=sc.nextInt();
 double price=0;double total;
 switch(a){
     case 1 : price=4;break;
     case 2: price =4.5;break;
     case 3: price =5;break;
     case 4: price =2;break;
     case 5: price=1.5;break;
     
 }
 total=price*b;
 System.out.printf("Total: R$ %.2f\n",total);
 
 
 
 }
    }