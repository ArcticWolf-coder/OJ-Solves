import java.util.*;
public class Untitled{
    public static void main(String[]args){
        int firstarray[][]={{8,9},{12,13,14},{43}};
      
        int []mark={20,30,50,40,10};
        change(mark);
        for (int v:mark){
        System.out.println(v);}
        System.out.println("first array:0");
      display(firstarray);
        }
    public static void change (int x[]){
        for (int count=0; count <x.length;count ++){
        x[count]+=5;
        }
    }
    public static void display (int x[][]){
        for (int row=0; row <x.length;row ++){
            for (int column=0; column <x[row].length;column ++){
                System.out.print(x[row][column]+"\t");
            }System.out.println();}}
    
    
    
}
    
    
    
    
    
    
    
    
    
 
    
