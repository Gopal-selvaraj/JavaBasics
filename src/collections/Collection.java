package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Collection {
	
	static HashMap<String, Object> map = new HashMap<String, Object>();
	static Scanner s = new Scanner(System.in);
	static Contact c = new Contact();
	static PersonalDetails pd = new PersonalDetails();
	static Address a = new Address();
	//static List<Map.Entry<String, Object>> l=new ArrayList<Map.Entry<String, Object>>();
	static List<String> l = new ArrayList<String>();	
	static Map.Entry<String, Object> m;
	static String name ;
	static String eMail;
	static String district;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner s = new Scanner(System.in);
//		Access a = new Access();
		
		int input = 1;
		while (input == 1) {
			System.out.println("Enter your choice 1-add, 2-view and 3-exit:");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				retrieve();
				break;
			case 3:
				System.exit(0);
			default:
				System.out.println("Please enter the valid numbers");
			}
			System.out.println("Press one to continue else exit");
			input = s.nextInt();
		}
	}

		@SuppressWarnings("rawtypes")
		static void add() {
			// List<String> l=new ArrayList<String>();
			System.out.println("Enter the Name:");
			name = s.next();
			// System.out.println("Enter the DateOfBirth:");
			// String dob=s.nextLine();
			System.out.println("Enter the EMail:");
			eMail = s.next();
			// System.out.println("Enter the PhoneNo:");
			// String phoneNo = s.nextLine();
			System.out.println("Enter the District:");
			district = s.next();

			pd.setName(name);
			// pd.setDob(dob);
			c.seteMail(eMail);
			// c.setPhoneNo(phoneNo);
			a.setDistrict(district);

			map.put("Name", pd.getName());
			// map.put("DateOfBirth", dob);
			map.put("Email", c.geteMail());
			// map.put("PhoneNo", c.getPhoneNo());
			map.put("District", a.getDistrict());
			Set set = map.entrySet();
			
			System.out.println(set);
			l.add(name);
			l.add(eMail);
			l.add(district);

		}

		@SuppressWarnings({ })
		static void retrieve() {
			//System.out.println(set);
			// Using set
			
			
	
			Iterator<String> i=l.iterator();
			while (i.hasNext()) {
				System.out.println(i.next());
	
			}

//			Set<Map.Entry<String, Object>> set = map.entrySet();
//			// System.out.println(set);

			
//			i1 = set.iterator();
//			while (i1.hasNext()) {
//				m = (Map.Entry<String, Object>) i1.next();
//				System.out.println(m.getKey());
//				System.out.println(m.getValue());
//			}

		}
		
		@SuppressWarnings({ "unchecked", "rawtypes" })
		static void retrieve1() {

//			Set<Map.Entry<String, Object>> set = map.entrySet();
//			// System.out.println(set);

			Set set=map.entrySet();
			Iterator<Object> i = set.iterator();
			while (i.hasNext()) {
				m = (Map.Entry<String, Object>) i.next();
				System.out.println(m.getKey());
				System.out.println(m.getValue());
			}

		}

		// Set set1=map.keySet();
		// System.out.println(set1);
		//
		// java.util.Collection<Object> set2=map.values();
		// System.out.println(set2);
		//
		// List<Map<String, Object>> valuesList =
		// new ArrayList<Map<String, Object>>();
		// valuesList.add(map);
		// System.out.println(valuesList.toString());

		// Iterator iterator = map.entrySet().iterator();
		// while (iterator.hasNext()) {
		// Map.Entry mapEntry = (Map.Entry) iterator.next();
		// System.out.println(mapEntry.getKey()+" : "+ mapEntry.getValue());
		// }
		//
		// for (Map.Entry<String, Object> entry : map.entrySet()) {
		// System.out.println(entry.getKey() + " : " + entry.getValue());
		// }
		//
		// for(Object key : map.keySet()){
		// System.out.println(key.toString() + "  : "
		// + map.get(key));
		// }
	}


