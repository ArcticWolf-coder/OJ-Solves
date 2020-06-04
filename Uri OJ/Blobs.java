import java.util.*;
public class Blobs {
	
	
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			double a=sc.nextDouble();
			int sum=0;
			for(;a>1;) {
				
				sum++;
				a=a/2;
			}
			System.out.println(sum+" dias");
		}
	}

}

