import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int number = 0;
		while (true){
		System.out.print("Enter a number: ");
		number = scan.nextInt();

			if(number > 0){
			break;
			}
		System.out.println("Invalid input! Please enter a positive number");
		}
		
		for(int count = 1; count <= 12; count++){
		System.out.println(number + " * " + count + " = " + (number * count));
		}

				
	}	
}