package automationtests;

public class RemoveChars {

	public static void main(String[] args) {
		
		String s="aabcbbacccbdad";
		int count=0;
		char c=s.charAt(0);
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)) {
				count++;
			}
			else {
				System.out.println(c+""+count);
				count=1;
				c=s.charAt(i);
			}
			
		}

System.out.println(c+""+count);		
		
	}

}
