import java.util.Scanner;
public class Task1 {
	public static void main(String[] args){
Scanner scan = new Scanner(System.in);

		System.out.println("What message would you like me to print? ");
		String message = scan.nextLine();

		System.out.print("How many times should I print the message? ");
		int times = scan.nextInt();
		for(int i = 1; i <= times; i++){
		System.out.println(i + ". " + message);
		}			
	}	
}