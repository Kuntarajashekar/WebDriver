package selenium;

public class ReverseNumber {

	public static void main(String[] args) {
		int num=12345,rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;}
			System.out.println("Reverse of number:"+rev);
			
			
			
			
			int n=9876;
			System.out.println(new StringBuffer(String.valueOf(n)).reverse());
		}
	

	}


