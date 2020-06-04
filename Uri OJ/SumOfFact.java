import java.util.*;
public class SumOfFact {
	public static long fact(long z) {
		if(z<=1) {
			return 1;
		} else {
			return z*fact(z-1);
		}
	}
	
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(;sc.hasNext();) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			long sum=fact(a)+fact(b);
			System.out.println(sum);
		}
	}

}

