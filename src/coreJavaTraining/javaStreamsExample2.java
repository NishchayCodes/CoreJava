package coreJavaTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javaStreamsExample2 {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("Alekhya");
		names.add("Ram");
		names.add("Aman");
		names.add("Suresh");
		names.add("Naman");
		names.add("Akash");
		
		long d=Stream.of("Alekhya","Ram","Aman","Suresh","Naman","Akash").filter(s->s.startsWith("A")).count();
		System.out.println(d);
		
		//Filter
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//Map 
		System.out.println("-----Map----");
		
		Stream.of("Alekhya","Rama","Aman","Suresh","Naman","Akash").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
        //sorted
		Stream.of("Alekhya","Rama","Aman","Suresh","Naman","Akash").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		List<String> names1=Arrays.asList("Don","Rajeev","Ankit");
		//Merging 2 streams
		System.out.println("-----Concat Streams----");
		Stream<String> st=Stream.concat(names.stream(), names1.stream());
//		st.sorted().forEach(s->System.out.println(s));
//		
		//anyMatch
		
		boolean flag=st.anyMatch(s->s.equalsIgnoreCase("Aman"));
		System.out.println(flag);
		
		//Collect
		List<String> ls=Stream.of("Alekhya","Rama","Aman","Suresh","Naman","Akash").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		//print unique no's of array
		List<Integer> lt=Arrays.asList(2,7,8,6,6,7,8,4);
//		lt.stream().distinct().forEach(s->System.out.println(s));
		
		//sort it,Convert back to list  and print 3rd value
		List<Integer> values=lt.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values.get(2));
		
	}

}
