import java.util.*;
public class String0{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       
       
        String st=sc.nextLine();
        int num=Integer.parseInt(st);
        String [] s=st.split("");
        String t="";
        for (int i=s.length-1;i>=0;i--){
            t+=s[i];
        }
        double n=Double.parseDouble(t);
        double diff;
        if (num>n){
            diff=num-n;
        } else {
            diff=n-num;
        }
        System.out.println(diff);
        
        
        
            
       
           
        
        
        
            
        
        
        
            }
        }