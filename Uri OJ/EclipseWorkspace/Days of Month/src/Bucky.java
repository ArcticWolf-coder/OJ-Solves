
import java.util.Scanner;
public class Bucky {

	public static void main(String[] args) {
		Scanner tuna= new Scanner(System.in);
		System.out.println("Enter Year");

		int year=tuna.nextInt();
		System.out.println("Enter month");
		int month=tuna.nextInt();
		int days;
		switch(month){
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			days=31; 
			break;
		case 4: case 6: case 9: case 11:
			days=30; 
			break;
		case 2: 
			if((year%4==0 && 
                    !(year % 100 == 0))
                    || (year % 400 == 0)){
				days=29;
			}else {days=28;} 
			break;
		default: 
			days=0;
			break;
			
		
		
		
		
		}
System.out.println("The number of days is "+days);
	}

}
