import java.util.Scanner;
public class SalesCommissionCalculator{
	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);
		
		double WeeklyPay = 200;
		double commission = 0.09; 
		double totalSales = 0.0;

		while(true){
		System.out.print("Enter the price of item sold or enter -1 to quit: ");
		double price = scan.nextDouble();

			if(price == -1){
			break;
			}
			else{
			totalSales += price;
			}
		}

		double earnings = WeeklyPay + (commission * totalSales);

		System.out.printf("The earnings for this saleperson is: %.2f%n", earnings);
	}
}