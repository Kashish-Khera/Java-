
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1. Fibonacci Series");
		
//		Note : In fibonacci series, next number is the sum of previous two numbers 
//		for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
//		The first two numbers of fibonacci series are 0 and 1.
		
		
//		Fibonacci without recursion : 
		int n1 = 0 ; int n2 = 1;
		int limit = 10;
		
		System.out.print(n1 + " "  + n2 + " ");
		for (int i = 2 ; i <limit ; i++)
		{
			int sum = n1 + n2;
			System.out.print(sum + " ");
			n1 = n2 ; n2 = sum; 
			
		}
		
	}

}

