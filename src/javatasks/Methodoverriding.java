package javatasks;

import java.util.Scanner;
class square {
	Scanner s = new Scanner(System.in);

	void area() {
		System.out.println("\t\tArea of Square");
		System.out.println("Enter the side of the square");
		int side = s.nextInt();
		int area = side * side;
		System.out.println("Area of square is " + area);
	}
}

class rectangle {
	Scanner s = new Scanner(System.in);

	void area() {
		System.out.println("\t\tArea of Rectangle");
		System.out.println("Enter the breadth and Height of the rectangle");
		int breadth = s.nextInt();
		int height = s.nextInt();
		int area = breadth * height;
		System.out.println("Area of Rectangle is " + area);
	}
}

class triangle {
	Scanner s = new Scanner(System.in);

	void area() {
		System.out.println("\t\tArea of triangle");
		System.out.println("Enter the Breadth and Height of the triangle");
		int width = s.nextInt();
		int height = s.nextInt();

		float area = (float) (0.5) * width * height;
		System.out.println("Area of triangle is " + area);
	}
}
@SuppressWarnings("resource")
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int ch = 0;
		System.out
				.println("\n*****Area of Square, Rectangle and Triangle using method overriding*****");
		square sq = new square();
		rectangle re = new rectangle();
		triangle tri = new triangle();
		do {
			System.out
					.println("\n\t\t*****Enter your choice you want to calculate*****\n1.Square\t2.Rectangle\t3.Triangle\t4.Exit");
			ch = s.nextInt();
			switch (ch) {
			case 1:
				sq.area();
				break;
			case 2:
				re.area();
				break;
			case 3:
				tri.area();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Please Enter the choice in the above");
			}
		} while (ch != 4);
	}
}
