package pack1;

import java.util.HashMap;
import java.util.Map;

public class CountAllOccurences {
	public static void main(String[]args){
		String in = "abbccddeeefffggghhh";
		char arr[]=in.toCharArray();
		Map<Character, Integer> countMap = new HashMap<Character, Integer>();
		
		for (char c: arr){
			if(countMap.containsKey(c)){
				countMap.put(c, countMap.get(c)+1);
			}
			else
				countMap.put(c, 1);
		}
		for (char c: countMap.keySet()){
			if(countMap.get(c)>0)
			System.out.println(c +" occurs "+ countMap.get(c)+" times");
		}
	
	
	}
	
}