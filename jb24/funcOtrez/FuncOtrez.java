package by.epam.jb24.funcOtrez;

public class FuncOtrez {

	public static void main(String[] args) {
		int x =0;
		int a = 0;
		int b = 10;
		int step = 2;
		double result;
		
		for (int i = 0; i < b; i +=step) {
			x +=step;
			result = 2 * Math.tan(x / 2) + 1;
			System.out.println("Argument x = " + x + " Fanction value = " + result);
		}
			
	}

}
