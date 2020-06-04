import java.util.*;
public class SumOfPowers {
	public static boolean Power(long x, long y) {
        
        if (x == 1) 
            return (y == 1); 
  
        
        long pow = 1; 
        while (pow < y) 
            pow = pow * x; 
  
        
        return (pow == y); 
    } 
 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++) {
			int n=sc.nextInt();
			long m=sc.nextLong();
			int sum=0;
			for(int j=0;j<n;j++) {
				long num=sc.nextLong();
				boolean b=true;
				if(Power(m,num)) {
					sum++;
				}
			}
			System.out.println(sum);
		}
		
	}

}

