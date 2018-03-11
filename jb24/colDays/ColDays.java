package by.epam.jb24.colDays;

import java.util.Scanner;

public class ColDays {

	public static void main(String[] args) {
		int year = 0, month = 0,  result= 0;
		
		year = inOut(1);
		month = inOut(0);
			
		result = calcMonth(year, month);
		print(result);
	}
	
	public static int calcMonth( int year, int month) {
		int col_day = 0;
		switch (month) {
	case 1:
	case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
	col_day = 31;
	break;
	case 2:
		if (year % 4 == 0) {
			col_day = 29;
		}else {
			col_day = 28;
		}
	break;
	case 4:
	case 6:
	case 9:
	case 11:
		col_day = 30;
		break;
		} 
		return col_day;
		}
	
	public static int inOut(int param) {
		Scanner sc = new Scanner(System.in);
		int x;
		if (param == 1) {
			System.out.println("¬ведите год: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("¬ведите год: ");
			}
			x = sc.nextInt();

		}else {
			System.out.println("¬ведите мес€ц: ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("¬ведите мес€ц: ");
				}
			x = sc.nextInt();	
			}	
		return x;		
		}
	public static void print (int result) {
		System.out.println(" оличество дней равно - " + result);
	}
	}

