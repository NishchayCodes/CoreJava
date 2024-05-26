package coreJavaTraining;

import java.util.ArrayList;

public class javaStreamsExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Without Java streams
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("Alekhya");
		names.add("Ram");
		names.add("Aman");
		names.add("Suresh");
		names.add("Naman");
		names.add("Akash");
		int count=0;
		for(int i=0;i<names.size();i++) {
			String actual=names.get(i);
			if(actual.startsWith("A")) {
				
				count++;
				
			}
		}
		System.out.println(count);
		

	}

}
