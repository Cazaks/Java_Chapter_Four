import java.util.Scanner;
public class StudentGradeExerciseTwoWhileTrueLoop {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		int gradeCounter = 0;
		int grade;
		
		while(true){
		System.out.print("Enter student grade: (1=pass, 2=fail): ");
		grade = scan.nextInt();

			if(grade == 1){
			passes += 1;
			}
			else if(grade == 2){
			failures += 1;
			}
			else{
			System.out.print("Invalid input. Please enter a vaild grade");
			}

		gradeCounter += 1;

		if(gradeCounter == 10){
		break;
		}
		}
	
		System.out.printf("The number of passes is: %d%n", passes);

		System.out.printf("The number of failures is: %d%n", failures);

		if (passes > 8){
		System.out.println("Congratulation! Bonus to the instructor");
		}

	}
}