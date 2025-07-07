 import java.util.Scanner;
public class GradeChecker {
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		/*System.out.print("Enter student score (0 - 100): ");
		int scores = scan.nextInt();

		if(scores >= 90 && scores <= 100){
		System.out.println("The Student score is: A");
		}

		else if(scores >= 80 && scores <= 89){
		System.out.println("The Student score is: B" );
		}

		else if(scores >= 70 && scores <= 79){
		System.out.println("The Student score is: C");
		}
		
		else if(scores >= 60 && scores <= 69){
		System.out.println("The Student score is: D");
		}

		else{
		System.out.println("The Student score is: F");
		}*/

		//Using a loop

		int score = 0;

		while (true){
		System.out.print("Enter student score (0 - 100): ");
		score = scan.nextInt();

			if(score >= 0 && score <= 100){
			break;
			}
		System.out.println("Invalid score! Please enter a number between 0 and 100.");
		}

		if(score >= 90) {
           	 System.out.println("Grade: A");
       		 } 

		 else if (score >= 80) {
            	 System.out.println("Grade: B");
        	 } 

		else if (score >= 70) {
            	System.out.println("Grade: C");
        	} 
		else if (score >= 60) {
            	System.out.println("Grade: D");
       	 	} 
		else {
            	System.out.println("Grade: F");
		}

		
		
	}	
}