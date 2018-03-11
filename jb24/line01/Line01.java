package by.epam.jb24.line01;

import java.util.Scanner;

public class Line01 {

	public static void main(String[] args) {
		int number = 0; 
		boolean result;
		number = inOut();
		result = calcDigit(number);
		print(result);
	}	
	
		public static boolean calcDigit(int number) {
			int digit = 0;
			while (number != 0) {
				digit = number % 10;
				number = number /10;
				if (digit % 2 == 0) {
					return (true);
				}
			}
			return (false);
		}
		
		public static int inOut() {
			int x;
			Scanner sc = new Scanner(System.in);
			System.out.println("������� �����: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("������� �����: ");
			}
			x = sc.nextInt();
			return x;
		}
		
		public static void print(boolean result) {
			if (result == true) {
				System.out.println("� ����� ���� ������ �����.");
			}else {
				System.out.println("� ����� ��� ������ ����.");
			}
		}
		
	}


