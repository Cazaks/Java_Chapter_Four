import java.util.Scanner;
public class TaskContinueIteration {
	public static void main(String[] args){
Scanner scan = new Scanner(System.in);

		System.out.println("What message would you like me to print? ");
		String message = scan.nextLine();

		System.out.print("How many times should I print the message? \n");
		int times = scan.nextInt();

	while(times <= 0){
	System.out.println("invalid input. Please enter a positive number\n");

	System.out.print("How many times should I print the message? \n");
		times = scan.nextInt();
	}
		for(int i = 1; i <= times; i++){
		System.out.println(i + ". " + message);			
	}	}
}