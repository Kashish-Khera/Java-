
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
//		Note :  Prime number is a number that is greater than 1 and divided by 1 or itself only. 
//		In other words, prime numbers can't be divided by other numbers than itself or 1. 
//		For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
//		0 and 1 are not prime numbers. 
//		The 2 is the only even prime number 
//		because all the other even numbers can be divided by 2.
		
		int no = 10;
		
	
			if( no <=1)
			{
				System.out.println("NOT PRIME ");
			}
			for(int i = 2; i< Math.sqrt(no) ; i++)
			{
				if(no % i == 0)
				{
					System.out.println("NOT PRIME");
					
				}
				System.out.println("Prime");
		}
			
		
	}

}
