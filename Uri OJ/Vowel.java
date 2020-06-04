import java.util.*;
public class Vowel{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String [] a=s.split("");
        String [] b={"b","c","d","f","g","h","j","k","l","m","n","p","q","r","s","t","v","w","x","y","z"};
        String [] c={"B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
        for (int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i].equals(b[j]) || a[i].equals(c[j])){
                    System.out.print("."+b[j]);
                    break;
                }
            }
        }
        System.out.println();
    
    
    }
    
    
}