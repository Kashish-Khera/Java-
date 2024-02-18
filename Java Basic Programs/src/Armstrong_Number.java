import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		armstrong no: An Armstrong number is one whose sum of digits raised to the power three equals the number itself. 
//		371, for example, is an Armstrong number because 3^3 + 7^3 + 1^3 = 27 + 343 + 1=371.
		
		int sum = 0; 
		int last_digit = 0; 
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		int OG = n ; 
		
		while(n !=0)
		{
			last_digit = n%10; 
			sum = sum + (last_digit  * last_digit * last_digit );
					n = n/10;
			
		}
		
		System.out.println("Armstrong number " + OG + " is "  + sum);
		
		


		

	}

}
