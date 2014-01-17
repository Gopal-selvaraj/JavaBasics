package javatasks;

import java.util.Scanner;
@SuppressWarnings("resource")
public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number, factorial;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to find the factorial");
		number = s.nextInt();
		factorial = fact(number);
		System.out.println("The factorial of " + number + " is :" + factorial);
	}

	public static int fact(int number) {
		if (number == 0)
			return 1;
		else {
			return number * fact(number - 1);
		}
	}
}
