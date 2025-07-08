// Coding exercise that contain 3 types of control statement
// 1. Sequence, 2. Selection, 3. Repetition
import java.util.Scanner;
public class AtmSimulation {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int correctPin = 4425;
		int balance = 20000;
		int pin;
		int pinAttempt = 0;

		boolean authenticated = false;
		while(true){
		System.out.print("Enter your pin: ");
		pin = scan.nextInt();
			if (pin == correctPin){
			System.out.println("Welcome to your account");
			authenticated = true;
			break;
			}
			else{
			pinAttempt++;
			System.out.println("Incorrect pin. you will be blocke if you exceed the number of trials");

				if(pinAttempt == 3){
				System.out.println("You have exceeded the number of trials, account locked for 24hours");
				System.out.print("Bye");
				break;
				}
			}
		}

		if(authenticated){		
		while (true){
		System.out.println("\nMenu options");
		System.out.println("1. Check balance");
		System.out.println("2. Make withdrawal");
		System.out.println("3. Make deposit");
		System.out.println("4. Make transfer");
		System.out.println("5. Exit");

		System.out.print("Select option: ");
		int userChoice = scan.nextInt();

			if (userChoice == 1){
			System.out.println("Your balance is: " + balance);
			}

			else if(userChoice == 2){
			System.out.print("Enter the amount you want to withdraw: ");
			int amount = scan.nextInt();
				if(amount > 0 && amount < balance){
				balance = balance - amount;
				System.out.println("Withdrawal successful and your balance is: " + balance);
				}
				else if(amount < 0){
				System.out.println("You cannot withdraw a negative amount");
				}
				else{
				System.out.println("Insufficient balance. Your balance is: " + balance);
				}
			}

			else if(userChoice == 3){
			System.out.print("Enter the amount you want to deposit: ");
			int depositAmount = scan.nextInt();
				if(depositAmount > 0){
				balance = balance + depositAmount;
				System.out.println("Deposit was successful and you new balance is: " + balance);
				}
				else if(depositAmount < 0){
				System.out.println("You cannot deposit a negative amount");
				}
				else{
				System.out.println("You cannot deposite a negative balance");
				}
			}

			else if(userChoice == 4){
			System.out.print("Enter the amount you want to transfer: ");
			int transferAmount = scan.nextInt();
				if(transferAmount > 0 && transferAmount < balance){
				balance = balance - transferAmount;
				System. out.println("Money transferred successfully. Your balance is: " + balance);
				}
				else if(transferAmount < 0){
				System.out.println("You cannot transfer a negative amount");
				}

				else{
				System.out.println("Insufficient amount, your balance is: " + balance);
				}
			}

			else if(userChoice == 5){
			System.out.println("Thanks for doing business with us");
			System.out.println("Hope to see you again");
			break;
			}

			else{
			System.out.println("Invalid selection, please select a valid option");
			}
			
		}
		}
				
	}	
}