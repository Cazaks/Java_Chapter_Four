import java.util.Scanner;
public class StudentGradeWhileTrueLoop {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int total = 0;
		int counter = 0;
		int grade;
		int invalidGrade = 0;

		while (true){
		System.out.print("Enter student grade between 0-100. Enter -1 to quit: ");
		grade = scan.nextInt();

			if (grade == -1){
			break;
			}
			else if(grade >= 0 && grade <= 100){
			total += grade;
			counter += 1;
			}
			else{
			invalidGrade++;
			System.out.println("Invalid grade. Enter a valid grade between 0 - 100: ");
			}
		}

		if(counter != 0){
		double average = (double) total / counter;
		System.out.printf("%nTotal of the %d grade entered is: %d%n", counter, total);
		System.out.printf("The average of the grade is: %.2f%n", average);
		System.out.printf("Totald of invalid grade entered is: %d%n", invalidGrade);
		}
		else{
		System.out.println("no grade was entered");
		}				
	}	
}