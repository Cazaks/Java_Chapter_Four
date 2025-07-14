import java.util.Scanner;
public class CreditLimitCalculator {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

		System.out.println("Enter account number:");
		int accNo = scan.nextInt();

		System.out.println("Enter balance at the beginning of the month:");
		double beginnibgBalance = scan.nextDouble();

		System.out.println("Enter Monthly charged:");
		double C = scan.nextDouble();

		System.out.println("Enter monthly credit:");
		double monthlyCredit = scan.nextDouble();

		System.out.println("Enter credit limit:");
		double creditLimit = scan.nextDouble();

		double newBalance =  beginnibgBalance + beginnibgBalance - monthlyCredit;

		if(newBalance > creditLimit){
		System.out.println("Credit limit exceeded");
		}
	}
}