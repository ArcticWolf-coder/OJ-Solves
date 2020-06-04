import java.util.*;
public class Gcd {
	public static int gcd(int x,int y) {
		if(y%x==0) {
			return x;
		}
		return gcd(y%x,x);
	}
	
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(gcd(a,b));
		}
	}

}

