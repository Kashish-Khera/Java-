import java.util.Scanner;

public class Count_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a Number");
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt();
		int OG_no = n; 
		
		int count = 0; 
		
		while(n >0)
		{
			int last_digit = n % 10 ; 
			count++; 
			n = n/10;
			
		}
		
		System.out.println("Total digit in the no  " + OG_no + " is  "  + count);

	}

}
