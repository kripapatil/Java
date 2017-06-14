package pack1;

import java.util.Map;
import java.util.TreeMap;

public class CountDuplicates {
	public static void main(String[]args){
		char arr []= {'a','a','c','d','e','!','!','f','g','h','i'};
		Map<Character, Integer> countMap = new TreeMap<Character, Integer>();
		
		for (char c: arr){
			if(countMap.containsKey(c)){
				countMap.put(c, countMap.get(c)+1);
			}
			else
				countMap.put(c, 1);
		}
		for (char c: countMap.keySet()){
			System.out.println(c +" occurs "+ countMap.get(c)+" times");
		}
	
	
	}
	
}