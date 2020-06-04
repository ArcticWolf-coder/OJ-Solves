import java.util.*;
public class Queen {
	
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(;;) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(a==0 && b==0 && x==0 && y==0) {
				break;
			}
			if(a==x && b==y) {
				System.out.println(0);
			
			} else if(Math.abs(x-a)==Math.abs(b-y)) {
				System.out.println(1);
			} else if(a==x || b==y){
				System.out.println(1);
				
			} else {
				System.out.println(2);
			}
		}
	}

}

