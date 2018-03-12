package by.epam.jb24.function;

import java.util.Scanner;

public class Function {

	public static void main(String[] args) {
		double result;
		result = calc();
		print(result);
		
	}		
	
	public static double calc() {
		double x;
		double value = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number ");
	
		if (sc.hasNextInt()) {
			x = sc.nextInt();
			if (x <= - 3) {
				value = 9;
				}
			else if (x > 3) {
				value = 1 / (x*x + 1);
			}
			else value = Double.NaN;			
			}
		return value;
		}
	
	public static void print(double result) {
		System.out.println("Function value = " + result);
	}
}

