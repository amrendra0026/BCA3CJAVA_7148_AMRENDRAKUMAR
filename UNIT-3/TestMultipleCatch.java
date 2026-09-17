public class TestMultipleCatch {
	public static void main(String[] args) {
		try{
			int[] monuScores = new int[3];
			monuScores[0] = 95;
			monuScores[1] = 90;
			monuScores[2] = 85;
			
			monuScores[5] = 100;
			
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Error occurred.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Error: monu accessed an invalid index!");
		} catch (Exception e) {
			System.out.println("General Exception Handler: " + e);
			
		}
	}
}