
import java.util.Scanner;

public class Apple {
	public static void main(String[] args) {
		Scanner tuna = new Scanner(System.in);
		Scanner zero = new Scanner(System.in);
		System.out.println("Enter start hour: ");
		int baby1 = tuna.nextInt();
		System.out.println("Enter start minute: ");
		int baby2 = tuna.nextInt();
		System.out.println("Enter end hour : ");
		int baby3 = tuna.nextInt();
		System.out.println("Enter end minute: ");
		int baby4 = tuna.nextInt();
		int babystart = (baby1) * 60 + baby2;
		int babyend = (baby3) * 60 + baby4;
		int duration = babyend - babystart;
		System.out.println("Enter type of number: ");
		String baby = zero.nextLine();
		System.out.println("Enter hour type: ");
		String baby9 = zero.nextLine();
		int total;
		if (baby.equals("f&f")) {
			if (baby9.equals("peak")) {
				total = 4 * 5 + (duration - 5) * 2;

			} else {
				total = 3 * 5 + (duration - 5) * 1;

			}
		} else {
			if (baby9.equals("peak")) {
				total = 7 * 5 + (duration - 5) * 6;
			} else {
				total = 8 * 5 + (duration - 5) * 5;

			}
		}
		System.out.println("The callcharge is " + total);

	}
}
