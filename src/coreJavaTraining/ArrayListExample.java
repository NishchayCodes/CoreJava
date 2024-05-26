package coreJavaTraining;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s=new ArrayList<String>();
		s.add("Rahul");
		s.add("Java");
		System.out.println(s);
		s.add(1, "Nishchay");
		System.out.println(s);
		s.remove("Java");
		System.out.println(s);
		System.out.println(s.get(1));
		System.out.println(s.contains("Rahul"));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
	    System.out.println(s.indexOf("Nishchay"));
	}
	
	//Below code is for access modifiers lecture
	protected void abc(){
	 System.out.println("hello");
	}

}
