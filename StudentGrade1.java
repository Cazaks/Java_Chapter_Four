import java.util.Scanner;
public class StudentGrade1 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int counter = 0;

		/*while(counter <= 10){
		System.out.print("Enter student grade (0-100): ");
		int grade = scan.nextInt();
		total = total + grade;
		counter++;
		}

	int average = total / 10;

	System.out.printf("%nTotal of 10 grade is: %d%n", total);
	System.out.printf("The average of the class is: %d%n", average);*/

	
		System.out.print("Enter student grade (0-100), enter - 1 to quit: ");
		int grade = scan.nextInt();
		
		while(grade != -1){
		if(grade >= 0 && grade <= 100){
		total += grade;
		counter += 1;
		}
		else{
		System.out.println("imvalid grade. Enter grade between 0 and 100");
		}

		System.out.print("Enter student grade (0-100): ");
		grade = scan.nextInt();
		}

		if(counter != 0){
		double average = (double) total / counter;
		
		System.out.printf("Total of %dn grade is: %d%n", counter, total);
		System.out.printf("The average of student score is: %.2f%n", average);
		}
		else{
		System.out.println("No grade was entered");
		}
					
	}	
}

