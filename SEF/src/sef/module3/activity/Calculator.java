/**
 * 
 */
package sef.module3.activity;

/**
 * @author 
 *
 */
public class Calculator {
		
	public static void main(String[] args) {
		
	int x = 5;
	int y = 10;
	
	int[] nums = {1, 2, 3, 4};
	
	System.out.println("Addition = " + add(x,y));
	System.out.println("Subtraction = " + subtract(x,y));
	System.out.println("Multiplication = " + multiply(nums));
	System.out.println("Division = " + divide(x,y));
	
	}


	private static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	private static int subtract(int x, int y) {
		int diff = 0;
		if (x > y) {
			diff = x - y;
		} else {
			diff = y - x;
		}

		return diff;
	}

	private static int multiply(int[] numbers) {
		int temp = 1;

		for (int i = 0; i < numbers.length; i++) {
			temp = temp * numbers[i];
		}
		return temp;

	}

	private static int divide(int x, int y) {
		int divValue = 0;
		if (x == 0 || y == 0) {
			if (x == 0 && y == 0) {
				System.out.println("Not possible to devide by 0");
			}
			if (x == 0) {
				divValue = x / y;
			} else {
				divValue = y / x;
			}
		} if (x>y) {
			divValue = x / y;
		} else {
			divValue = y / x;
	
		}
		
		return divValue;

	}
	
}

