package selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringReverse {

	public static void main(String[] args) {
		
		String actual="AUSTRALIA";
		char[] charArray=actual.toCharArray();
		List<Character> list=new ArrayList<>();
		for(char c:charArray) {
			list.add(c);
		}
		Collections.reverse(list);
		System.out.println(list);
		
		String s="Selenium";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb.reverse());
		
		
		

	}

}
