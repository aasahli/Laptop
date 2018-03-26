import java.util.Scanner;

class Location {
	private int row;
	private int column;
	private double maxValue;

	Location() {

	}
	
	public int getRow() {
		return row;
	}
	
	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}

	public double getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(double maxValue) {
		this.maxValue = maxValue;
	}
}

public class Task1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the numbner of rows and columns in the array: ");
		int rows = input.nextInt();
		int columns = input.nextInt();
		int[][] m = new int[rows][columns];
		System.out.println("Enter the array: ");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = input.nextInt();
				/* System.out.println(m[i][j] + " "); */
			}
		}

		Location location = locateLargest(m);
		System.out.println("The location of the largest element is " + location.getMaxValue() + " at " + location.getRow() + ","
				+ location.getColumn());
	}

	/**
	 * This method locates the largest element in a two dimensional array, and return the largest value 
	 * together with the row and column where it was found.
	 * 
	 * @param m the input two dim array
	 * @return the location object representing the max value in the array
	 */
	public static Location locateLargest(int[][] m) {
		
		// create a location object to hold the return value
		Location location = new Location();
		
		// initialize the max value of the return to double min value 
		location.setMaxValue(Double.MIN_VALUE);
		
		// now loop over input matrix
		for (int i = 0; i < m.length; i++) { //rows of m
			for (int j = 0; j < m[i].length; j++) { //cols of m[i]
				
				// now test is m[i][j] is larger than the current maxvalue
				if (m[i][j] > location.getMaxValue()) {
					
					// new max value so update location
					location.setMaxValue(m[i][j]);
					location.setRow(i + 1);
					location.setColumn(j + 1);
				}
			}
		}
		
		// return the location object
		return location;

	}
}
