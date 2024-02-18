import java.util.Scanner;

public class Reverse_digit_of_a_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		int OG = n ; 
		int rev_no= 0; 
		int last_digit= 0;
		
		while(n != 0)
		{
			last_digit = n % 10; 
			n = n / 10; 
			rev_no = rev_no * 10 + last_digit; 
		}
		
		System.out.println("Reverse digit of the no  " + OG + " is "  + rev_no );

	}

}
