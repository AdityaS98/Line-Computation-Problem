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

		System.out.println("Enter the value of x3 coordinate");
		int x3 = sc.nextInt();

		System.out.println("Enter the value of x4 coordinate");
		int x4 = sc.nextInt();

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
		 * Taking input of Y3
		 */
		System.out.println("Enter the value of y3  coordinate");
		int y3 = sc.nextInt();
		/*
		 * Taking input Y4
		 */
		System.out.println("Enter the value of y4 coordinate");
		int y4 = sc.nextInt();


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
		/*
		 * Calculating the values of x3 and x4 and storing them in value3 variable.
		 */
		int value3 = (int) Math.pow((x4 - x3), 2);
		/*
		 * Calculating the values of y3 and y4 and storing them in value4 variable.
		 */
		int value4 = (int) Math.pow((y4 - y3), 2);
		/*
		 * Calculating the values of Length of Line.
		 */		
		int LengthofLine1 = (int) Math.sqrt(value1 + value2);
		System.out.println("Length of Line 1 is " + LengthofLine1);
		/*
		 * Calculating the values of Length of Line.
		 */
		int LengthofLine2 = (int) Math.sqrt(value3 + value4);
		System.out.println("Length of line 2 is " + LengthofLine2);
		if (Integer.valueOf(LengthofLine1).equals(Integer.valueOf(LengthofLine2))) {
			System.out.println("Both Lines are equal");
		} else {
			System.out.println("Both Lines are not equal");
		}
		
		}
	}

