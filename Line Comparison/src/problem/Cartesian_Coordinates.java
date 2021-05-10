package problem;

public class Cartesian_Coordinates {
	        //Declaration
			static int x1;
			static int y1;
			static int x2;
			static int y2;
			//Assign Value to Class Member
			 public static void Assign_value(int x1,int y1,int x2,int y2) {
				Cartesian_Coordinates.x1 = x1;
				Cartesian_Coordinates.y1 = y1;
				Cartesian_Coordinates.x2 = x2;
				Cartesian_Coordinates.y2 = y2;
			}
			 //Main Method
			 public static void main(String[] args) 
			 {
			System.out.println("Welcome to Line Comparison Computation ");
			Assign_value(4, 3, 6, 8);
			double line1_length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
			System.out.println("length of Line_1 is: "+line1_length);
			Assign_value(4, 3, 6, 8);
			double line2_length = Math.sqrt((x2-x1)^2 + (y2-y1)^2);
			System.out.println("length of Line_2 is: "+line2_length);
			
			//Checking Equality of Two Line
			
			if(line1_length == line2_length)
				System.out.println("Both line are Equal");
			else
				System.out.println("Both line are Not Equal");
			}
			
	}
	
