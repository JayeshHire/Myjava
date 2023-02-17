import java.io.*;

/**<h2> calculator calculating two numbers </h2>
 * this program implements an application which 
 * takes two nos ,
 * performs addition
 * and returns result
 * <p>
 * <b>note</b> comments make the code readable 
 * easy to understand
 *
 * @author Jayesh
 * @version 1.0.1
 * @since 15-2-2023
 */

public class Calculate {
	/**
	 * this method does the summation of two nos 
	 * @param input1 this is the first parameter of the sum() method
	 * @param input2 this is the second parameter to sum() method
	 * @return int this returns the addition of input1 and input2
	 */ 
	public int sum(int input1 , int input2){
		int result = input1 + input2;
		return result;
	}
	/**
	 * this is main method which uses sum() method
	 * @param args Unused
	 * @see IOException
	 */
	public static void main(String args[]){
		Calculate obj = new Calculate();
		int result = obj.sum(20,40);
		System.out.println(result);
	}
}
