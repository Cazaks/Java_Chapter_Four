import java.util.Scanner;
public class GasMileageTwo{
	public static void main(String[]args){

		Scanner scan = new Scanner(System.in);

		int totalMiles = 0;
		int totalGallons = 0;
		
		System.out.print("Enter mileage driven or enter -1 to exit: ");
		int miles = scan.nextInt();

		while(miles != -1){

			if(miles <= 0){
			System.out.println("Miles must be greater than zero, or enter -1 to quit: ");
			}
			else{
			System.out.print("Enter gallons used: ");
			int gallons = scan.nextInt();

				if(gallons <= 0){
				System.out.println("Gallon must be greter than 0");
				}
				else{
				double milesPerGallon = miles / (double) gallons;
				System.out.printf("Miles per gallon for a trip is: %.2f%n", milesPerGallon);

				totalMiles += miles;
				totalGallons += gallons;

				double combineMilesPerGallon = (double)totalMiles / totalGallons;
				System.out.printf("%nThe combine miles is: %.2f%n", combineMilesPerGallon);
				}
			}

			System.out.print("Enter mileage driven or enter -1 to exit: ");
			miles = scan.nextInt();
			
			

		}

	}
}