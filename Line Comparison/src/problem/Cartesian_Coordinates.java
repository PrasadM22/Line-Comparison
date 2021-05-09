package problem;

public class Cartesian_Coordinates {
	        //Declaration
			public static int x1=4;
			public static int y1=3;
			public static int x2=6;
			public static int y2=8;
		public static void main(String[] args) {
			System.out.println("Welcome to Line Comparison Computation ");
			
			double line_length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
			System.out.println("length of Line is: "+line_length);
			}
	}
