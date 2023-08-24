package week1.day2;



public class MyCalculator {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.addTwoNumber(5,5));
		System.out.println(calc.multiplication(2.5f,10));
		calc.subtraction();
	}
}
