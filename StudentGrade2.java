import java.util.Scanner;
public class StudentGrade2 {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int total = 0;
		int count = 0;

	System.out.print("Enter student grade, enter -1 to stop: ");
	int grade = scan.nextInt();

	while(grade != -1){
	total = total + grade;
	count = count + 1;
	System.out.print("Enter student grade, enter -1 to stop: ");
	grade = scan.nextInt();
	}

	if(count != 0){
	double average = (double) total / count;
	System.out.printf("%nTotal of %d grade is: %d%n", count, total);
	System.out.printf("The average of the class is: %.2f%n", average);
	}

	else{
	System.out.println("No grade was entered");
	}
					
	}	
}