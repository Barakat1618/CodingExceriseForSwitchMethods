
public class MegaBytesCoverter {

	public static void main(String[] args) {
		
		printMegaBytesAndKiloBytes(-2050);
		
		printMegaBytesAndKiloBytes(2050);
		
		printMegaBytesAndKiloBytes(0);
		

	}
	
	public static void printMegaBytesAndKiloBytes(int kiloBytes){
		
		if(kiloBytes < 0) {
			System.out.println("Invalid Value");
		}
		else {
		
		int calculatedMegaBytes = kiloBytes / 1024;
		
		int remainingKiloBytes = kiloBytes % 1024;
		
	      System.out.println(kiloBytes + " KB = " + calculatedMegaBytes + " MB" + " and " + remainingKiloBytes + " KB");
	  }
	}

}
