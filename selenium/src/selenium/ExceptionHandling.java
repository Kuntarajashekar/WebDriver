package selenium;

public class ExceptionHandling {

	public static void main(String[] args) {
		try {
			Thread.sleep(2000);
			System.out.println("try block");
			System.exit(0);
		}
		catch(Exception e) {
			System.out.println("catch block");
		
		}
		finally {
			System.out.println("finally block");
		}
		
		
		
	}
}