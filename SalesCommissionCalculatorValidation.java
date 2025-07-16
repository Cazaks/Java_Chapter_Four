import java.util.Scanner;
public class SalesCommissionCalculatorValidation{
	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);
		
		double WeeklyPay = 200;
		double commission = 0.09; 
		double totalSales = 0.0;

		System.out.print("Enter weekly price sold or -1 to quit: ");
		double price = scan.nextDouble();

		while(price != -1){
			if(price < 0){
			System.out.println("Please enter a valid price or -1 to quit: ");
			}
			else{
			totalSales += price;
			}

		System.out.print("Enter weekly price sold or -1 to quit: ");
		price = scan.nextDouble();
		}

		double earnings = WeeklyPay + (commission * totalSales);

		System.out.printf("The earnings for this saleperson is: %.2f%n", earnings);
	}
}