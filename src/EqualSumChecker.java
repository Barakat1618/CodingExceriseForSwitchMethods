
public class EqualSumChecker {

	public static void main(String[] args) {
		
		
		System.out.println(hasEqualSum(1,1,1));
		System.out.println(hasEqualSum(1,1,2));
		System.out.println(hasEqualSum(1,-1,0));

		System.out.println("Congratulations we have completed our fifth coding excercise.");
	}
	
	
	public static boolean hasEqualSum(int number1, int number2, int number3) {
		
		int total = number1 + number2;
		
		if( total == number3 ) {
			return true;
		}
		
		return false;
		
		
	}

}
