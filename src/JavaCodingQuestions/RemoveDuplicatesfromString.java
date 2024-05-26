package JavaCodingQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesfromString {
	
	public static void main(String[] args) {
		
		String str="aaabcccdd";
		String nstr=Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
		System.out.println(nstr);
}
}
