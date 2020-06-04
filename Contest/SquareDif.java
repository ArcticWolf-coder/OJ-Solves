import java.util.*;
public class SquareDif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int [n];
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int x=sc.nextInt();
			int y=sc.nextInt();
			int []b=new int [y-x+1];
			for(int j=x-1,k=0;j<y;j++,k++) {
				b[k]=a[j];
			}
			Arrays.sort(b);
			int sum=0;
			for(int j=1;j<b.length;j++) {
				sum+=Math.pow(Math.abs(b[j]-b[j-1]),2);
			}
			System.out.println(sum);
		}
		
	}

}

