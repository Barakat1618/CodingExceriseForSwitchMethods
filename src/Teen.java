
public class Teen {

	public static void main(String[] args) {
		
		System.out.println(hasTeen(9,99,19));
		System.out.println(hasTeen(23,15,42));
		System.out.println(hasTeen(22,23,34));

		System.out.println("Congratulations we have completed our sixth coding excercise.");
	}
	
	
	public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
		
		if(((firstAge >= 13) && (firstAge <= 19) ) || ((secondAge >= 13) && (secondAge <= 19) ) || ((thirdAge >= 13) && (thirdAge <= 19))) {
			return true;
		}
		
		return false;
	}

}
