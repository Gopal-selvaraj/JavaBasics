package javatasks;

import java.io.IOException;

public class Stringconcat {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)) ;
//		System.out.println("Enter the Mobile No:");
//		String str =br.readLine();
//		String mobileno="+91-".concat(str);
//		System.out.println("After the concatenation: "+mobileno);
		
		String s="gopal";
		String s1="krish";
		System.out.println("s = "+s.hashCode());
		System.out.println("s1 ="+s1.hashCode());
		boolean s2=(s==s1);
		System.out.println(" Using == is :"+s2);
		boolean s3=s.equals(s1);
		System.out.println(" Using equals is :"+s3);
		int s4=s.compareTo(s1);
		System.out.println(" Using compareTo is :"+s4);
	}

}
