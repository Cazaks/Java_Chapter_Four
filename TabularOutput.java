public class TabularOutput{
	public static void main(String[]args){
		
		System.out.println("N\tN^2\tN^3\tN^4\n");
		for(int num = 1; num <= 5; num++){
		System.out.println(num + "\t" + num*num + "\t" + num*num*num + "\t" + num*num*num*num);
		}
	}
}