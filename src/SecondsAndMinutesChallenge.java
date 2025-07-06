
public class SecondsAndMinutesChallenge {

	private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
	//Always declared after class statement, Can be used globally. Its value cannot be changed.
	//Variable name is always written in capital just to identify easily that they are constants.
	public static void main(String[] args) {
		
		System.out.println(getDurationString(36360));
		System.out.println(getDurationString(-36));
		System.out.println(getDurationString(0));
		
		System.out.println(getDurationString(36360,33));
		System.out.println(getDurationString(61,5));
		

	}
	
	
	private static String getDurationString(int minutes, int seconds) {
		
		if((minutes>= 0) && ((seconds >= 0) && (seconds <= 59) )) {
			
			
			int hoursCalculation =  minutes / 60;
			int minutesCalculation =  minutes % 60;
			
			String prefixMinute = minutesCalculation + "m";
			String prefixHour = hoursCalculation + "h";
			String prefixSeconds = seconds + "s.";
			
			if(hoursCalculation < 10) {
				prefixHour = "0" + hoursCalculation + "h";
			}
			
			if (minutesCalculation < 10) {
				prefixMinute = "0" + minutesCalculation + "m"; 
			}
			
			if (seconds < 10) {
				prefixSeconds = "0" + seconds + "s."; 
			}
			
			
			
				return prefixHour + " " + prefixMinute + " " + prefixSeconds;
			}
			
		else {
			return INVALID_VALUE_MESSAGE;
		}
		
	}
	
private static String getDurationString(int seconds) {
		
		if(seconds>=0) {
			
			int minutesCalculation  = seconds/60;
			int secondsCalculation  = seconds%60;
			return getDurationString(minutesCalculation,secondsCalculation);
		}
		else {
			
			return INVALID_VALUE_MESSAGE;
		}
		
	}
	

}
