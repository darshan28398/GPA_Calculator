package gpaCalc.helper;

public class Helper {
	
	public static double addArray(double[] arrayResult) {
		double total= 0;
		for(int i =0; i < arrayResult.length; i++) {
			total += arrayResult[i];
		}
		return total;
	}
	
	public static double percentageMarks(double MarksOutOf, double MarksObtained) {
		return (MarksObtained/MarksOutOf)*100;
	}
	
	public static double percentCover(double percentageMarks, double totalWeightage ) {
		return (percentageMarks*totalWeightage)/100;
	}
	
	public static double GPA(double percentCover) {
		if(percentCover<0 || percentCover >100) {
			return -1;
		}
		if(percentCover < 50) {
			return 0.0;
		}
		if(percentCover >=50 && percentCover <56.5) {
			return 1.0;
		}
		if(percentCover >=56.5 && percentCover <59.5) {
			return 1.3;
		}
		if(percentCover >=59.5 && percentCover <62.5) {
			return 1.7;
		}
		if(percentCover >=62.5 && percentCover <66.5) {
			return 2.0;
		}
		if(percentCover >=66.5 && percentCover <69.5) {
			return 2.3;
		}
		if(percentCover >=69.5 && percentCover <72.5) {
			return 2.7;
		}
		if(percentCover >=72.5 && percentCover <76.5) {
			return 3.0;
		}
		if(percentCover >=76.5 && percentCover <79.5) {
			return 3.3;
		}
		if(percentCover >=79.5 && percentCover <85.5) {
			return 3.7;
		}
		if(percentCover >=85.5 && percentCover <89.5) {
			return 4.0;
		}
		if(percentCover >=89.5 && percentCover <=100) {
			return 4.0;
		}
		return -1;
	}	

}
