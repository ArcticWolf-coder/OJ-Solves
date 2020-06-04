import java.util.*;
public class AlarmClock {
	
 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		for(;;) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int sum=0;
			int start=0, end=0;
			if(x==0 && y==0 && a==0 && b==0) {
				break;
			}
			if(a==0) {
				start=24*60+b;
			} else {
				start=a*60+b;
			}
			if(x==0) {
				end=24*60+y;
			} else {
				end=x*60+y;
			}
			if(start>end) {
				sum=24*60+end-start;
			} else {
				sum=end-start;
			}
			System.out.println(sum);
		}
	}

}

