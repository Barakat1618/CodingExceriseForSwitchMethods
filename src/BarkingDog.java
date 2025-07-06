
public class BarkingDog {

	public static void main(String[] args) {
	
		
		System.out.println(bark(true, 1));
		System.out.println(bark(false, 2));
		System.out.println(bark(true, 8));
		System.out.println(bark(true, -1));
		
		System.out.println("Congratulations we have completed the second coding excercise.");	

	}
	
	
	public static boolean bark(boolean barking, int hourOfDay) {
		
	if((barking == true) && (hourOfDay < 8) && ( hourOfDay >= 0)) {
		return true;
	}else if((barking == true) && (hourOfDay > 22) && ( hourOfDay < 24)) {
		return true;
	}else if((barking == true) && (hourOfDay < 0)) {
		return false;
	}
	
	return false;
	}

}
