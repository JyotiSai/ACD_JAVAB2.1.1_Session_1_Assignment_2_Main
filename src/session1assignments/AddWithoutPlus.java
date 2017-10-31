package session1assignments;

import java.util.Scanner; //Imports Scanner class to read inputs from the keyboard
/**
 * This class prints the sum of two numbers without using plus operator
 *
 */
public class AddWithoutPlus
{
	/**
	 * This is the main method and execution starts here.
	 */
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); // To read the inputs using Scanner object s
		int x, y, sum; // Declaration of x, y and sum
		System.out.println("Enter the two numbers to be added"); // Inputs to be entered from keyboard
		x = s.nextInt(); // Takes the value of x
		y = s.nextInt(); // Takes the value of y
		s.close(); // Scanner s closed
		sum = add(x,y); // Method call of add()
		System.out.println("The sum is: "+sum); // Prints the sum of the operands
	}
	
	public static int add(int a, int b) // This function adds two numbers using bitwise AND and XOR operators.
	{
		int carry; // Declaration of carry
		while(b!=0) // The loop iterates until b is equal to 0
		{
			carry = a&b; // Performs Bitwise AND operation on a and b to get carry value
			a= a^b; // Performs Bitwise XOR operation on a and b to get sum value
			b= carry<<1; // Left shifts the carry by 1 bit to get new b value
		} // While loop closed
		return a; // Returns the sum
	} // add function closed
} // Class closed
