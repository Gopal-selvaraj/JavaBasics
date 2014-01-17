package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collection {

	@SuppressWarnings({ "rawtypes", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		Scanner s = new Scanner(System.in);
		Contact c = new Contact();
		PersonalDetails pd=new PersonalDetails();
//		List<String> l=new ArrayList<String>();
		System.out.println("Enter the Name:");
		String name=s.nextLine();
//		System.out.println("Enter the DateOfBirth:");
//		String dob=s.nextLine();
//		System.out.println("Enter the EMail:");
//		String eMail = s.nextLine();
//		System.out.println("Enter the PhoneNo:");
//		String phoneNo = s.nextLine();
		System.out.println("Enter the Address:");
		String address = s.nextLine();
		
		pd.setName(name);
//		pd.setDob(dob);
//		c.seteMail(eMail);
//		c.setPhoneNo(phoneNo);
		c.setAddress(address);

		//Using set
		
		map.put("Name", pd.getName());
//		map.put("DateOfBirth", dob);
//		map.put("Email", c.geteMail());
//		map.put("PhoneNo", c.getPhoneNo());
		map.put("Address", address);
		
		Set set=map.entrySet();
		System.out.println(set);
		
		Set set1=map.keySet();
		System.out.println(set1);
		
		java.util.Collection<Object> set2=map.values();
		System.out.println(set2);
		
		List<Map<String, Object>> valuesList =
			    new ArrayList<Map<String, Object>>();
		valuesList.add(map);
		System.out.println(valuesList.toString());
		

//		Iterator iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry mapEntry = (Map.Entry) iterator.next();
//			System.out.println(mapEntry.getKey()+" : "+ mapEntry.getValue());
//		}
//
//		 for (Map.Entry<String, Object> entry : map.entrySet()) {
//		 System.out.println(entry.getKey() + " : " + entry.getValue());
//		 }
//
//		 for(Object key : map.keySet()){
//		 System.out.println(key.toString() + "  : "
//		 + map.get(key));
//		 }
	}

}
