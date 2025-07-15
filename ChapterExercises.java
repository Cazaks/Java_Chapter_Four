public class ChapterExercises{
	public static void main(String[]args){

		/*int age = 67;
		if (age >= 65){
		System.out.println("Age is greater than or equal to 65");
		}
		else{
   		System.out.println("Age is less than 65"); 
		}*/

		int x = -2;
 	    	int total = 0;

 	    	while (x <= 10) {
 		int y = x + 2;
 		x++;
 	       	total += y;
		System.out.printf("Y is: %d and total is %d\n", y, total);
		}	
	}

}