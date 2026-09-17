public class TestTryCatch {
	public static void main(String[] args) {
		String studentname = "Monu";
		System.out.println(studentName + " started math calculation...");
		
		
		try{
			int totalMarks = 100;
			int subject = 0;
			int result = totalMarks / subject;
			
			System.out.println("Result: " + result);
			
		} catch (ArithmeticException e){
			System.out.println("Exception Caught: Division by zero is not allowed for " + studentName + "|");
			System.out.println("System Error Details: "+ e.getMassage());
		}
		System.out.println(studentName + "'s program continuse execution smoothly!");
		
		
	}
}