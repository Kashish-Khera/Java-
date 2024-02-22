import java.util.Scanner;

public class Userdefined_Method {

	
	public static void Odd_even(int n) {
		
		if(n%2 == 0)
		{
			System.out.println("EVEN NUMBER");
		}
		else
		{
			System.out.println("ODD Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number ");
		Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				
				Odd_even(n);
		
	}

}
