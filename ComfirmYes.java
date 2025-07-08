import java.util.Scanner;
public class ComfirmYes {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		String word;
		int attempt = 0;
		while (attempt < 3){
		System.out.print("Enter the word (yes): ");
		word = scan.nextLine();

			if(word.equalsIgnoreCase("yes")){
			System.out.println("You are welcome");
			break;
			}
			attempt++;
		System.out.println("Invalid input! Please enter the correct word");
		}
		
			if(attempt == 3){
			System.out.println("Too many wrong trials, access denied.");
			}
				
	}	
}