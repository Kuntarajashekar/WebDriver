package selenium;

public class ReverseString {

	public static void main(String[] args) {
		
		String actual="Wipro Limited";
		char[] charArray=actual.toCharArray();
		for(int i=charArray.length-1;i>=0;i--) {
			System.out.println(charArray[i]);
			}
	
	}

}
