package javatasks;

//"Welcome to Java coding to pass the values to the command line arguments".
class Arguments // create a class as Arguments
{
	public static void main(String argument[]) {
		int a, b, multiplication, addition, subtraction;
		a = Integer.parseInt(argument[0]);
		b = Integer.parseInt(argument[1]);
		addition = a + b;
		System.out.println("The addition of a and b is: " + addition);
		subtraction = a - b;
		System.out.println("The subtraction of a and b is: " + subtraction);
		multiplication = a * b;
		System.out.println("The multiplication of a and b is: "
				+ multiplication);
	}
}