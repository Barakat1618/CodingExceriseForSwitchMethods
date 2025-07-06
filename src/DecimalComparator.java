import java.math.BigDecimal;

public class DecimalComparator {

	public static void main(String[] args) {
		
		System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
		System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.176));
		System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
		System.out.println(areEqualByThreeDecimalPlaces(3.1756, 3.1757));
		
	}
	
	
	/*
	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		if(number1 < 0) {
			number1 *= -1;
		}
		
        if(number2 < 0) {
			number2 *= -1;
		}
        BigDecimal value = null;
        double remainder = 0;
        
        if(number1 > number2) {
        	remainder =(float) (number1 - number2);
        	value = new BigDecimal(remainder);
        	value = value.setScale(3,BigDecimal.ROUND_HALF_DOWN);
        	remainder = value.doubleValue();
        	System.out.println(remainder);
        	
        }else if(number2 > number1) {
        	System.out.println(number2);
        	System.out.println(number1);
        	
        	remainder = (float) (number2 - number1);
        	value = new BigDecimal(remainder);
        	value = value.setScale(4,BigDecimal.ROUND_HALF_DOWN);
        	remainder = value.doubleValue();
        	System.out.println(remainder);
        }else {
        	return true;
        }
        
        if((remainder >= 0.0001) && (remainder <= 0.0009999999999999999999999)) {
        	return true;
        }
        
        return false;
        
	}
	*/
	
	

	    public static boolean areEqualByThreeDecimalPlaces(double a, double b){

	        a = a * 1000;

	        b = b * 1000;

	        int c = (int) (a-b);

	        if (c == 0){

	            return true;

	        }

	        else return false;

	    }

	}
	
	
	