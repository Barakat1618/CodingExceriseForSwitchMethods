
public class LeapYear {

	public static void main(String[] args) {

		System.out.println(isLeapYear(-1600));
		System.out.println(isLeapYear(1600));
		System.out.println(isLeapYear(2017));
		System.out.println(isLeapYear(2000));
		System.out.println(isLeapYear(1924));
		

		System.out.println("Congratulations we have completed our third coding excercise.");	


	}

	public static boolean isLeapYear(int year) {

		if ((year < 1) || (year > 9999)) {
			return false;
		} else {
			int isItALeapYear = year % 400;
			int isItALeapYear1 = year % 4;
			int isItALeapYear2 = year % 100;

			if ((isItALeapYear == 0)) {
				return true;
			}
			else if ((isItALeapYear1 == 0) && (isItALeapYear2 != 0)) {
				return true;
			} else {
				return false;
			}

		}

	}

}
