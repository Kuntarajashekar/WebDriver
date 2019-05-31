package automationtests;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplic {

	public static void main(String[] args) {
		
		String actual= "wiprolimited";
		char[] charArray=actual.toCharArray();
		Set<Character>LinkedHashSet=new LinkedHashSet<Character>();
		for(char c:charArray) {
			LinkedHashSet.add(c);
			}

		System.out.println(LinkedHashSet);
	}

}
