
public class SumOfEvenNumbers {
	public static void main(String[] args){
	
		int sumEven = 0;
		/*for(int even = 1; even <= 20; even++){
			
			if(even % 2 == 0){
			sumEven += even;
			}
		}*/

		for(int even = 2; even <= 20; even += 2){
		sumEven += even;
		}
		System.out.printf("The sum of the even numbers is: %d%n", sumEven);


	}
}