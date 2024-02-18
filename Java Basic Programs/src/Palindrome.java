import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Palindrome are the numbers for which the reverse is 
//		exactly same as tge original one.
		
//		ex. 121 , palindrome = 121 
		
		
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

		
		if(rev_no == OG)
		{
			System.out.println("Palindrome Number");
		}else
		{
			System.out.println("Not a Palindrome");
		}
		

	}

}
