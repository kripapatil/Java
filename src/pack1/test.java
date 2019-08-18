package pack1;

import java.util.Map;
import java.util.HashMap;

public class test {
	
	public static void main(String[]args)
	{
		String input = "xxxyyygggggz";
		char arr[] = input.toCharArray();
		Map <Character, Integer> countmap = new HashMap<Character, Integer>();
		
		for(char c: arr)
		{
			if(countmap.containsKey(c))
				countmap.put(c, countmap.get(c)+1);
				else
					countmap.put(c, 1);
		}
			
		for (char c: countmap.keySet())
		{
			if(countmap.get(c)>0)
			System.out.println(c +" occurs "+ countmap.get(c)+" times");
		}
				
		
	}

	
}
