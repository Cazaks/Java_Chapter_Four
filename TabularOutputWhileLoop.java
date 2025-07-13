public class TabularOutputWhileLoop{
	public static void main(String[]args){
		
		System.out.println("N\tN^2\tN^3\tN^4\n");
		
		int num = 1;
		while(num <= 5){
		System.out.println(num + "\t" + num*num + "\t" + num*num*num + "\t" + num*num*num*num);
		num++;
		}
	}
}