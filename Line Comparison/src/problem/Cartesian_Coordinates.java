package problem;

public class Cartesian_Coordinates {
			//Method to find length of line
			static double Calculate_length(int x1,int y1,int x2,int y2)
			{
				return Math.sqrt((x2-x1)^2 + (y2-y1)^2);
			}
			 //Main Method
			 public static void main(String[] args) 
			 {
			System.out.println("Welcome to Line Comparison Computation ");
			System.out.println("length of Line_1 is: "+Calculate_length(4, 3, 6, 8));
			System.out.println("length of Line_1 is: "+Calculate_length(3, 4, 6, 9));
			
			//Checking Equality of Two Line
			int Checker = Double.compare(Calculate_length(4, 3, 6, 8),Calculate_length(3, 4, 6, 9));
			if(Checker > 0)
				System.out.println("line 1 is Greater than line 2");
			else if(Checker < 0)
				System.out.println("line 2 is Greater than line 1");
			else
				System.out.println("Both line are Equal");
	}
}
