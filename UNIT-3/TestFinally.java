public class TestFinally {
	public static void main(String [] args) {
		try {
			System.out.println("Monu opening database connection...");
			int data = 25/5;
			System.out.println("Data calculated: " + data);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception caught.");
			
		} finally {
			System.out.println("FINNALY BLOCK: Closing monu's database connection guaranteed!");
		}
	}
}