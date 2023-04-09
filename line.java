package linecomputation;

import java.util.*;

/**
 * 
 * @author DELL
 *
 */

public class linecalculationUC1 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/*
		 * 1)Taking input for x coordinates 2)Taking Input for y coordinates
		 * 3)Calculating length of line
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * Taking Input of X1 Coordinate.
		 */
		
		System.out.println("Welcome to Line Comparison Computation Program");
		System.out.println("Enter the value of x1 coordinate");
		int x1 = sc.nextInt();
		/*
		 * Taking input of X2 Coordinate
		 */
		System.out.println("Enter the value of x2 coordinate");
		int x2 = sc.nextInt();
		/*
		 * Taking input of Y1 Coordinate
		 */
		System.out.println("Enter the value of y1 coordinate");
		int y1 = sc.nextInt();
		/*
		 * Taking input of Y2 Coordinate
		 */
		System.out.println("Enter the value of  y2 coordinate");
		int y2 = sc.nextInt();

		/*
		 * Calculating the values of x2 and x1 and storing them in value1 variable.
		 */

		int value1 = (int) Math.pow((x2 - x1), 2);
		/*
		 * Calculating the values of y2 and y1 and storing them in value2 variable.
		 */
		int value2 = (int) Math.pow((y2 - y1), 2);
		/*
		 * Calculating the values of Length of Line.
		 */
		int LengthofLine1 = (int) Math.sqrt(value1 + value2);
		System.out.println("Length of Line 1 is " + LengthofLine1);

		
		}
	}

