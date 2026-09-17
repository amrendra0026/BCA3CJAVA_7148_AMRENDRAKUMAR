public class TestThrow {
	static void checkVotingEligility(int age, String studentName) {
	if (age < 18)  {
		throw new ArithmeticException(studentName + " is not eligible to vote (Age must be 18+).");
	}  
	else{
		System.out.println(studentName +" is eligible to vate!");
		
	}
	
	}
	public static void main(String[] args){
		try {
			System.out.println("Checking regisration for monu...");
			checkVotingEligility(16, "monu");
		} catch (ArithmeticException e) {
			System.out.println("Caught Explicit Exception: " + e.getMessage());
		}
	}
}