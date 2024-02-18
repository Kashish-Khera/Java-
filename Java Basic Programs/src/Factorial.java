import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int fact = 1; 
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		if(n == 0)
		{
			fact = 1; 
		}
		else if (n <0)
		{
			System.out.println("Invalid no");
			System.exit(0);		}
		else 
		{
			for(int i = n ; i>=1 ; i--)
			{
				fact = fact * i;
			}
			
		}
		
		System.out.println("Factorial of a number is "  + fact);

	}

}
