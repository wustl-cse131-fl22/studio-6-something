package studio6;

import java.lang.reflect.Array;
import java.util.Arrays;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	static double sum = 0;
	public static double geometricSum(int n) {
	
		if(n==0) {
			return 0;
		}else if(n==1) {
			return 0.5;
		}
			return sum = 0.5+0.5*geometricSum(n-1);
		
		
			
		
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
		int r = p % q;
		if( r == 0 )
		    return q;
		else
			return gcd(q,r);
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		if(array.length==0) {
			return new int[0];		}
			int a = array.length;
			int[] reversed =Arrays.copyOf(array,a);
			
			
			System.out.println();
			return reverse(reversed,a-1,0); 
		
	}
	public static int[] reverse(int[] array, int  i, int j) {
		 if(array.length%2==0&&i==array.length/2.0-1) {
				return array;
			}else if(array.length%2==1&&i==array.length/2.0-0.5) {
				return array;
			}
		int temp;
		 temp =array[i];
		 array[i]= array[j];
		 array[j]=temp;
		
					return reverse( array, --i,++j);

		
	}
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			
			double radiusMinimumDrawingThreshold) {
		StdDraw.circle(xCenter, yCenter, radius);
		StdDraw.circle(xCenter+radius, yCenter, radius/3);
		StdDraw.circle(xCenter-radius, yCenter, radius/3);
		StdDraw.circle(xCenter, yCenter+radius, radius/3);
		StdDraw.circle(xCenter, yCenter-radius, radius/3);

	if(radius>radiusMinimumDrawingThreshold) {
		circlesUponCircles(xCenter,yCenter,radius/3,radiusMinimumDrawingThreshold);
	}
	}
	

}
