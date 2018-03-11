package by.epam.jb24.minMaxString;

import java.util.Scanner;

public class MinMaxString {

	public static void main(String[] args) {
	String max = "",min = "", str = "";
	
	String[] result = calcStr(max,min,str);
	print(result[0], result[1]);
	}
	
	public static String[]  calcStr(String max,String min,String str) {
	int n =10;
	Scanner sc = new Scanner (System.in);	
	for (int i = 0; i <n; i++) {
		System.out.println(">");
		if(sc.hasNextLine()) {
			str = sc.nextLine();
			if (i == 0) {
			min = str;
			}
			if (str.length() > max.length()) {
			max = str;
			}else if (str.length() < min.length()) {
			min = str;
			}
		}
	}
	return new String[] {max, min};
	}
	
	public static void print(String max, String min) {
		System.out.println("max string = " + max + " Length = " + max.length());
		System.out.println("min string = " + min + " Length = " + min.length());
	}
}
	

