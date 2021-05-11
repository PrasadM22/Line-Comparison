package problem;

public class Cartesian_Coordinates {
				//Declaration
				public int x1;
				public int y1;
				public int x2;
				public int y2;
				//Constructor
				Cartesian_Coordinates(int x1,int y1,int x2,int y2) {
				this.x1 = x1;
				this.y1 = y1;
				this.x2 = x2;
				this.y2 = y2;
				}
				//Method to find length of line
				double Calculate_length()
				{
					return Math.sqrt((x2-x1)^2 + (y2-y1)^2);
				}
				//Main Method
				public static void main(String[] args) 
			 {
					//Create Object
					Cartesian_Coordinates line_1 = new Cartesian_Coordinates(4, 5, 6, 9);
					Cartesian_Coordinates line_2 = new Cartesian_Coordinates(2, 7, 3, 1);
					int Checker = Double.compare(line_1.Calculate_length(), line_2.Calculate_length());
					//Checking equality of Two Line
					if( Checker > 0 )
						System.out.println("line 1 is Greater than line 2");
					else if( Checker < 0)
						System.out.println("line 2 is Greater than line 1 ");
					else
						System.out.println("Both line are Equal ");
	}
}
