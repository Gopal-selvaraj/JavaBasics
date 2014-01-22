package staticpro;

class A {
	
	int a = 10;

	void one() {
		a = a + 10;
		System.out.println("a1 is :"+a);
	}

	void two() {
		a = a - 5;
		System.out.println("a2 is :"+a);
	}

}

public class InstanceVariableValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.one();
		a1.two();
		System.out.println("current value of a is :"+a1.a);
		A a2 = new A();
		System.out.println("New object of current value of a is :"+a2.a);
		
	}

}
