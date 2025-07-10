import java.util.Scanner;
public class StudentGrade1 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int counter = 1;

		while(counter <= 10){
		System.out.print("Enter student grade (0-100): ");
		int grade = scan.nextInt();
		total = total + grade;
		counter++;
		}

	int average = total / 10;

	System.out.printf("%nTotal of 10 grade is: %d%n", total);
	System.out.printf("The average of the class is: %d%n", average);				
	}	
}