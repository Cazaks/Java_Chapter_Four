import java.util.Scanner;
public class StudentGradeExerciseTwoForLoop {
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		
		for(int gradeCounter = 1; gradeCounter <= 10; gradeCounter++){
		System.out.print("Enter student grade: (1=pass, 2=fail): ");
		int result = scan.nextInt();

			if (result == 1){
			passes += 1;
			}
			else{
			failures += 1;
			}
		}
		
		System.out.printf("The number of passes is: %d%n", passes);

		System.out.printf("The number of failures is: %d%n", failures);

		if (passes > 8){
		System.out.println("Congratulation! Bonus to the instructor");
		}

	}
}