import java.util.*;
public class LoveCalculator {
    public static void main (String [] args) {
      Scanner sc=new Scanner(System.in);
      
      String [] b={"","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
      for (;sc.hasNext();){
      String []str=new String [2];
      int []a=new int [2];
      for(int i=0;i<2;i++){
          str[i]=sc.nextLine();
          str[i]=str[i].toLowerCase();
          String st[]=str[i].split("");
          for (int k=0;k<st.length;k++){
              for(int j=1;j<=26;j++){
                  if(st[k].equals(b[j])){
                      a[i]+=j;
                  }
              }

          }
      }
     
      for (int i=0;i<2;i++){
            
            
            int n=a[i];
            if(n==0){
                break;
            }
            String s=Integer.toString(n);
            
            for(;;){
                
                if(s.length()==1){
                    break;
                }
                n=0;
                for(int j=0;j<s.length();j++){
                    n+=Integer.parseInt(Character.toString(s.charAt(j)));
                }
                s=Integer.toString(n);
            }
            a[i]=n;
            
        }
        double d;
        if(a[0]>a[1]){
            d=(double)a[1]/a[0];
        } else {
            d=(double)a[0]/a[1];
        }
        d*=100;
        System.out.printf("%.2f ",d);
        System.out.println("%");
        }
      
        
                    
                            
 
    }
}