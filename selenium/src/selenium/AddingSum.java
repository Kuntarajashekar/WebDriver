package selenium;

public class AddingSum {

	public static void main(String[] args) {
		int num=785,sum=0,rem=0;
		while(num!=0) {
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
		
		

	}

}
