import java.util.HashMap;
import java.util.Scanner;

public class largestElement {

	public static void main(String[] args) {
		int smallestNumber = -2147483648;
		int largestNumber = 2147483647;
		
		int[] myArray = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<5;i++) {
			myArray[i] = sc.nextInt();
		}
		
		for(int i=0;i<myArray.length;i++) {
			if(smallestNumber<myArray[i]) {
				smallestNumber = myArray[i];
			}
		}
		
System.out.println("Largest element is : " + smallestNumber);


for(int i=0; i<myArray.length; i++) {
	if(largestNumber> myArray[i]) {
		largestNumber = myArray[i];
	}
}

System.out.println("Smallest element is : " + largestNumber);




HashMap<Integer, String> hm = new HashMap<Integer, String>();
hm.put(12, "twele");
hm.put(1, "one");
hm.put(2, "two");
hm.put(3, "three");


for(Integer val : hm.keySet()) {
System.out.println(hm.get(val));	
}



	}
	
	
	
	
	

	
}
