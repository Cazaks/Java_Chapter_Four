
public class CompundInterestCalculation {
	public static void main(String[] args){
	
		double principal = 1000.0;
		double interestRate = 0.05;

		for(int year = 1; year <= 10; year++){
		double amount = principal * (Math.pow((1.0 + 0.05), year));


		System.out.printf("The amount for each year is: year %d%n%.2f%n ", year, amount);
		}

	}
}