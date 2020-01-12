package convertFeetAndInchesToCentimeters;

public class Main {

	public static void main(String[] args) {
		calcFeetAndInchesToCentimeters(60.00);

	}
	
	public static double calcFeetAndInchesToCentimeters(double feet,double inch) {
		if(feet >0 || (inch>=0 && inch<=12)){
			double feetInCm = feet * 12 * 2.54;
			double inches= inch * 2.54;
			double sumInCms = feetInCm + inches;
			return sumInCms;
		}else
			return -1;
		
	}
	
	
	public static double calcFeetAndInchesToCentimeters(double inch) {
		if(inch>=0) {
			calcFeetAndInchesToCentimeters(5, inch);
		}else {
			return -1;
		}
		return inch;
		
	}

}
