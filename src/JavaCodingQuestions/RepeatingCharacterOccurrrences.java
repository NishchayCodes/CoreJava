package JavaCodingQuestions;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacterOccurrrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		String name="Nishchay";
		HashMap<Character,Integer> mp=new HashMap<Character,Integer>();
		
		char[] strarray=name.toCharArray();
		for(char c:strarray) {
			if(mp.containsKey((c))){
				mp.put(c, mp.get(c)+1);
			}
			else {
				mp.put(c, 1);
				
			}
		}
		for(Map.Entry entry:mp.entrySet()) {
			System.out.println(entry.getKey()+""+entry.getValue());
			
		}
		

	} 
	}


