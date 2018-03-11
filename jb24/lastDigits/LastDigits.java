package by.epam.jb24.lastDigits;

import java.util.Scanner;

public class LastDigits {

	public static void main(String[] args) {
		int number = 0, LastDigKv;
		
		number = inOut();
		LastDigKv = calcZifra(number);
		print(LastDigKv, number);
		
	}
	
	public static int calcZifra (int number) {
		int poslZifra;
		int poslZifraKv;
		poslZifra = number % 10;
		switch (poslZifra) {
		case 0:
			poslZifraKv = 0;
			break;
		case 1:
			poslZifraKv = 1;
			break;
		case 2:
			poslZifraKv = 4;
			break;
		case 3:
			poslZifraKv = 9;
			break;
		case 4:
			poslZifraKv = 6;
			break;
		case 5:
			poslZifraKv = 5;
			break;
		case 6:
			poslZifraKv = 6;
			break;
		case 7:
			poslZifraKv = 9;
			break;
		case 8:
			poslZifraKv = 4;
			break;
		case 9:
			poslZifraKv = 1;
			break;
		default:
			return -1;
		}
		return poslZifraKv;
		}
	
	public static int inOut() {
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите число: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Введите число: ");
		}
		x = sc.nextInt();
		return x;
	}
	
	public static void print(int LastDigKv, int number) {
		if (LastDigKv == -1) {
			System.out.println("Что-то не о с программой.");
		}else {
			System.out.println("Последняя цифра квадрата числа " + number + " равняется " + LastDigKv);
		}
	}
}
