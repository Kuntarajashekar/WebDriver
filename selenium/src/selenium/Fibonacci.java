package selenium;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n,i,first=0,secound=1,next;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a series number:");
		n=s.nextInt();
		System.out.println("Fibonacci series are:");
		for(i=0;i<n;i++) {
			System.out.println(first);
			next=first+secound;
			first=secound;
			secound=next;
		}

	}

}
