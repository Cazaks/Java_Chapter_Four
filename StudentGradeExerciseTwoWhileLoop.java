import java.util.Scanner;
public class StudentGradeExerciseTwoWhileLoop {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		int gradeCounter = 1;

		while(true){
		System.out.print("Enter student grade (1=pass or 2=fail): ");
		int result = scan.nextInt();

			if(result == 1){
			passes += 1;
			}
			else{
			failures += 1;
			}

			if (gradeCounter == 10){
			break;
			}
			else{
			gradeCounter++;
			}
		}

		System.out.printf("The number of passes is: %d%n", passes);

		System.out.printf("The number of failures is: %d%n", failures);

		if (passes > 8){
		System.out.println("Congratulation! Bonus to the instructor");
		}

	}
}