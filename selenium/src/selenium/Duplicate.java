package selenium;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		String s="aaabbcccddeffcccg";
		char[] charArray=s.toCharArray();
				Set<Character> linkedHashSet=new LinkedHashSet<Character>();
		for(char c:charArray) {
			linkedHashSet.add(c);
		}
		System.out.println(linkedHashSet);
		
		
		int r=20;
		r=--r+ --r;
		System.out.println(r);
		
		
		int arm=0,a,b,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		b=n;
		while(n>0) {
			a=n%10;
			n=n/10;
			arm=arm+a*a*a;
		}
		if(arm==b) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not a Armstrong number");
	
		}
	}

}
