import java.util.*;
public class Walk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int []a=new int [n];
			int b[]=new int [n];
			for(int j=0;j<a.length;j++) {
				a[j]=sc.nextInt();
				b[j]=a[j]+j;
			}
			Arrays.sort(b);
			System.out.println(b[b.length-1]);
			
			
		}
		
	}

}

