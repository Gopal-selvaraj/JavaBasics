package staticpro;

class A {
	
	int a = 10;

	void one() {
		a = a + 10;
		System.out.println(a);
	}

	void two() {
		a = a - 5;
		System.out.println(a);
	}

}

public class Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		a1.one();
		a1.two();
		System.out.println(a1.a);
		A a2 = new A();
		System.out.println(a2.a);
		
	}

}
