import java.util.Scanner;
public class GasMileage{
	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);

		int totalMiles = 0;
		int totalGallons = 0;
		
		System.out.print("Enter mileage driven or enter -1 to exit: ");
		int miles = scan.nextInt();

		while(true){
			if(miles == -1){
			break;
			}
			else{
			System.out.print("Enter gallons used: ");
			int gallons = scan.nextInt();

			double milePerGallon = (double) miles / gallons;
		System.out.printf("The miles per gallon for each trip is: %.2f%n", milePerGallon);
			
			totalMiles += miles;
			totalGallons += gallons;

			double combineMileAndGallon = (double) totalMiles / totalGallons;
		System.out.printf("The combined miles per gallon is: %.2f%n", combineMileAndGallon);
			}
			
		System.out.print("Enter mileage driven or enter -1 to exit: ");
		miles = scan.nextInt();
		
		}
	}

}