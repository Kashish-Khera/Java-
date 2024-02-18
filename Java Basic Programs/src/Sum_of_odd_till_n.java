import java.util.Scanner;

public class Sum_of_odd_till_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		
		int sum = 0; 
		for(int i = 0; i<n ; i++)
		{
			if(i%2 != 0)
			{
				sum = sum + i; 
			}
		}
		
		System.out.println("Sum of odd till " + n + " is "  + sum);
	}

}
