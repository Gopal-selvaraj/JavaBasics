package staticpro;

class one{
	static String s =" One ";
	static String oneString(){
		String s ="I am Class one ";
		//System.out.println(s);
		return s;
	}
	
}
class two{
	static String s=" Two ";
	static String twoString(){
		String s ="I am Class two ";
		System.out.println(one.oneString()+" "+one.s);
		return s;
		
	}	
}
public class Staticpro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(two.twoString()+" "+two.s);
	}

}
